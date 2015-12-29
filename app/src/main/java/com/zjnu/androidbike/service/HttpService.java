package com.zjnu.androidbike.service;

import com.squareup.okhttp.RequestBody;
import com.zjnu.androidbike.doamin.FileInfo;
import com.zjnu.androidbike.doamin.PlayGuide;
import com.zjnu.androidbike.doamin.User;
import com.zjnu.androidbike.dto.Page;
import com.zjnu.androidbike.enums.CityEnum;

import java.io.File;
import java.util.Map;

import retrofit.Call;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.Multipart;
import retrofit.http.POST;
import retrofit.http.PartMap;
import retrofit.http.Path;
import retrofit.http.Query;


/**
 * Created by xueyi on 2015/12/27.
 */
public interface HttpService {

    /**
     * 无效,需要修改
     */
    @GET("/bike/download/{download}")
    Call<File> download(@Path("download") String download);

    /**
     * 无效,需要修改
     */
    @Multipart
    @POST("/bike/upload")
    Call<FileInfo> upload(@PartMap Map<String, RequestBody> params);

    /**
     * 无效,需要修改
     */
    @POST("/bike/user/login")
    Call<User> login(@Body User user);

    /**
     * 登录
     */
    @POST("/bike/user/login")
    Call<User> login(@Query("userName") String userName, @Query("password") String password);

    /**
     * 无效,需要修改
     */
    @POST("/bike/user/register")
    Call<User> register(@Body User user);

    @GET("/bike/playGuide/listPlayGuide?sort=baiduPage,Asc&sort=id,Asc")
    Call<Page<PlayGuide>> listPlayGuide(@Query("page") Integer page, @Query("city") CityEnum city);

}
