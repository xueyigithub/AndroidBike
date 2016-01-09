package com.zjnu.androidbike.dao;

import android.text.TextUtils;
import android.util.Log;

import com.activeandroid.query.Delete;
import com.activeandroid.query.Select;
import com.google.gson.Gson;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xueyi on 2016/1/2.
 */
public class Dao {

    private static final String TAG = "Dao";

    public static <T> DbModel save(T t) {
        DbModel dbModel = null;
        try {
            String obj = t.getClass().getSimpleName();
            Method getId = t.getClass().getMethod("getId");
            String key = (String) getId.invoke(t);
            Gson gson = new Gson();
            String value = gson.toJson(t);
            dbModel = DbModel.builder().obj(obj).key(key).value(value).build();
            dbModel.save();
        } catch (Exception e) {
            Log.d(TAG, e.toString());
        }
        return dbModel;
    }

    public static <T> Boolean delete(T t) {
        try {
            String obj = t.getClass().getSimpleName();
            Method getId = t.getClass().getMethod("getId");
            String key = (String) getId.invoke(t);
            DbModel dbModel = new Select()
                    .from(DbModel.class)
                    .where("obj = ? And key = ?", obj, key)
                    .executeSingle();
            if (dbModel != null) {
                dbModel.delete();
            }
            return true;
        } catch (Exception e) {
            Log.d(TAG, e.toString());
        }
        return false;
    }

    public static <T> T findOne(Class<T> objClass, String key) {
        T t = null;
        DbModel dbModel = new Select()
                .from(DbModel.class)
                .where("obj = ? And key = ?", objClass.getSimpleName(), key)
                .executeSingle();
        if (dbModel != null && !TextUtils.isEmpty(dbModel.getValue())) {
            Gson gson = new Gson();
            t = gson.fromJson(dbModel.getValue(), objClass);
        }
        return t;
    }

    public static <T> List<T> findAll(Class<T> objClass) {
        List<T> ts = new ArrayList<>();
        List<DbModel> dbModels = new Select()
                .from(DbModel.class)
                .where("obj = ?", objClass.getSimpleName())
                .execute();
        if (dbModels != null && dbModels.size() > 0) {
            Gson gson = new Gson();
            for (DbModel dbModel : dbModels) {
                if (!TextUtils.isEmpty(dbModel.getValue())) {
                    T t = gson.fromJson(dbModel.getValue(), objClass);
                    ts.add(t);
                }
            }
        }
        return ts;
    }

    public static <T> Boolean cleanAll(Class<T> objClass) {
        new Delete().from(DbModel.class).where("obj = ?", objClass.getSimpleName()).execute();
        return true;
    }
}
