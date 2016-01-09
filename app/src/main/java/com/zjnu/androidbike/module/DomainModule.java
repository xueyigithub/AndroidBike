package com.zjnu.androidbike.module;

import android.util.Log;

import com.zjnu.androidbike.doamin.PlayGuide;
import com.zjnu.androidbike.doamin.User;
import com.zjnu.androidbike.enums.CityEnum;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by xueyi on 2016/1/9.
 */
@Module
public class DomainModule {

    private static final String TAG = "DomainModule";

    @Provides
    @Singleton
    User provideUser() {
        Log.d(TAG, "provideUser");
        User u = User.builder().userName("1").password("1").build();
        return u;
    }

    @Provides
    @Singleton
    @Named("Hangzhou")
    PlayGuide providePlayGuide1() {
        Log.d(TAG, "providePlayGuide1");
        PlayGuide p = PlayGuide.builder().title("aaa").city(CityEnum.Hangzhou).build();
        return p;
    }

    @Provides
    @Singleton
    @Named("Jinhua")
    PlayGuide providePlayGuide2() {
        Log.d(TAG, "providePlayGuide2");
        PlayGuide p = PlayGuide.builder().title("bbb").city(CityEnum.Jinhua).build();
        return p;
    }
}
