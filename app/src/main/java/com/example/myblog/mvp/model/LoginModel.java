package com.example.myblog.mvp.model;

import com.example.myblog.api.API131;
import com.example.myblog.api.ApiService;
import com.example.myblog.base.BaseModel;
import com.example.myblog.entity.User;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * dy@auth
 * 2020-03-12 创建的系统天
 * 16:21 创建的系统时间
 * 2020 创建的年份
 * 03 创建的月份
 * com.example.myblog.mvp.model 所在包名
 * Administrator 当前用户系统登录名
 */
public class LoginModel extends BaseModel {

    public Observable<User> requestLogin(String name, String pwd){
        return  get().requestLogin(name,pwd).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
    }
}
