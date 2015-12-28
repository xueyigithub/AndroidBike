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

    @GET("/bike/download/{download}")
    Call<File> download(@Path("download") String download);

    @Multipart
    @POST("/bike/upload")
    Call<FileInfo> upload(@PartMap Map<String, RequestBody> params);

    @POST("/bike/user/register")
    Call<User> register(@Body User user);

    @GET("/bike/playGuide/listPlayGuide?sort=baiduPage,Asc&sort=id,Asc")
    Call<Page<PlayGuide>> listPlayGuide(@Query("page") Integer page, @Query("city") CityEnum city);

}
