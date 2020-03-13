package com.example.myblog.mvp.model;

import com.example.myblog.base.BaseModel;
import com.example.myblog.entity.Blog;
import com.example.myblog.entity.BlogTop;
import com.example.myblog.entity.WebUrl;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * dy@auth
 * 2020-03-12 创建的系统天
 * 18:46 创建的系统时间
 * 2020 创建的年份
 * 03 创建的月份
 * com.example.myblog.mvp.model 所在包名
 * Administrator 当前用户系统登录名
 */
public class HomeModel extends BaseModel {
    /**
     * 获取首页文章
     * @param page
     * @return
     */
    public Observable<Blog> requestBlog(int page){
        return get().getBlog(page).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
    }

    /**
     * 常用网站
     * @return
     */
    public Observable<WebUrl> getUrl(){
        return get().getUrl().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
    }

    public Observable<BlogTop> gteTopBlog(){
        return get().getTopBlog().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
    }


}
