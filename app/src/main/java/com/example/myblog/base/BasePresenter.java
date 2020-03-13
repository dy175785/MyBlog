package com.example.myblog.base;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

/**
 * dy@auth
 * 2020-03-12 创建的系统天
 * 15:57 创建的系统时间
 * 2020 创建的年份
 * 03 创建的月份
 * com.example.myblog.base 所在包名
 * Administrator 当前用户系统登录名
 */
public class BasePresenter<V extends BaseView,M extends BaseModel> {
    protected V mView;
    protected M mM;

    public BasePresenter(V view) {
        mView = view;
    }




}
