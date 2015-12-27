package com.zjnu.androidbike.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.zjnu.androidbike.config.Consts;
import com.zjnu.androidbike.util.DateDeserializer;
import com.zjnu.androidbike.util.DateSerializer;

import java.text.DateFormat;
import java.util.Date;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

/**
 * Created by xueyi on 2015/12/28.
 */
public class CallService {

    public static final HttpService service;

    static {
        Gson gson = new GsonBuilder()
                .excludeFieldsWithoutExposeAnnotation()
                .registerTypeAdapter(Date.class, new DateSerializer()).setDateFormat(DateFormat.LONG)
                .registerTypeAdapter(Date.class, new DateDeserializer()).setDateFormat(DateFormat.LONG)
                .create();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Consts.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        service = retrofit.create(HttpService.class);
    }
}
