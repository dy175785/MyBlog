package com.example.myblog.mvp.model;

import com.example.myblog.base.BaseModel;
import com.example.myblog.entity.BlogTop;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * dy@auth
 * 2020-03-13 创建的系统天
 * 15:39 创建的系统时间
 * 2020 创建的年份
 * 03 创建的月份
 * com.example.myblog.mvp.model 所在包名
 * Administrator 当前用户系统登录名
 */
public class AnswerModel extends BaseModel {
    public Observable<BlogTop> requestAnswer(int page){
        return get().getAnswer(page).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
    }
}
