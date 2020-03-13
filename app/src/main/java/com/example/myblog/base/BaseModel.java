package com.example.myblog.base;

import com.example.myblog.api.API131;
import com.example.myblog.api.ApiService;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * dy@auth
 * 2020-03-12 创建的系统天
 * 18:48 创建的系统时间
 * 2020 创建的年份
 * 03 创建的月份
 * com.example.myblog.base 所在包名
 * Administrator 当前用户系统登录名
 */
public class BaseModel {
    protected API131 get(){
        return ApiService.getApi().create(API131.class);
    }


}
