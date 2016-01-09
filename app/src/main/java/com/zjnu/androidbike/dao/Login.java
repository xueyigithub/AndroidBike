package com.zjnu.androidbike.dao;

import com.google.gson.annotations.Expose;
import com.zjnu.androidbike.doamin.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by xueyi on 2016/1/9.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(suppressConstructorProperties = true)
public class Login {

    @Expose
    private String id;

    @Expose
    private User user;

    @Expose
    private Boolean hasLogin;

    @Expose
    private String hasLogin2;
}
