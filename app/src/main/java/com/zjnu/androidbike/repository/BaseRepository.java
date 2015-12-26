package com.zjnu.androidbike.repository;

import android.content.Context;

import com.couchbase.lite.Database;
import com.couchbase.lite.Document;
import com.couchbase.lite.Manager;
import com.couchbase.lite.android.AndroidContext;
import com.zjnu.androidbike.config.Consts;

/**
 * Created by xueyi on 2015/12/26.
 */
public class BaseRepository {

    public static Document getDocument(Context wrappedContext) throws Exception {
        Manager manager = new Manager(new AndroidContext(wrappedContext), Manager.DEFAULT_OPTIONS);
        Database database = manager.getDatabase(Consts.DAtABASE_NAME);
        Document document = database.getDocument(Consts.DOCUMENT_NAME);
        return document;
    }
}
