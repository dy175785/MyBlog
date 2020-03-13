package com.example.myblog.api;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * 1@auth
 * 2020-03-11 创建的系统天
 * 09:34 创建的系统时间
 * 2020 创建的年份
 * 03 创建的月份
 * com.example.mvp_model.api 所在包名
 * Administrator 当前用户系统登录名
 */
public class ApiService {

    public static Retrofit getApi(){
        Retrofit retrofit = new Retrofit.Builder().baseUrl("https://www.wanandroid.com/")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit;
    }

}
