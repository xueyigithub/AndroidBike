package com.zjnu.androidbike.dao;

import com.google.gson.annotations.Expose;
import com.zjnu.androidbike.doamin.PlayGuide;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by tao on 2016/1/3.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(suppressConstructorProperties = true)
public class DbPlayGuide {

    @Expose
    private String id;

    @Expose
    private PlayGuide playGuide;

    @Expose
    private Boolean hasLogin;

    @Expose
    private String testStr;
}
