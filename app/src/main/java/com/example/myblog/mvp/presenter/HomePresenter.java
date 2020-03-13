package com.example.myblog.mvp.presenter;

import android.util.Log;

import com.example.myblog.base.BasePresenter;
import com.example.myblog.base.BaseView;
import com.example.myblog.entity.Blog;
import com.example.myblog.entity.BlogTop;
import com.example.myblog.entity.WebUrl;
import com.example.myblog.mvp.model.HomeModel;
import com.example.myblog.mvp.view.HomeView;

import io.reactivex.functions.Consumer;

/**
 * dy@auth
 * 2020-03-12 创建的系统天
 * 18:46 创建的系统时间
 * 2020 创建的年份
 * 03 创建的月份
 * com.example.myblog.mvp.presenter 所在包名
 * Administrator 当前用户系统登录名
 */
public class HomePresenter extends BasePresenter<HomeView, HomeModel> {

    public HomePresenter(HomeView view) {
        super(view);
        mM=new HomeModel();
    }

    public void requestBlog(int page){

            mView.showDialog("加载中");
            mM.requestBlog(page).subscribe(new Consumer<Blog>() {
                @Override
                public void accept(Blog blog) throws Exception {
                    mView.hideDialog();
                    mView.getBlog(blog);
                }
            });


    }

    public void getWebUrl(){

        mView.showDialog("加载中");
        mM.getUrl().subscribe(new Consumer<WebUrl>() {
            @Override
            public void accept(WebUrl webUrl) throws Exception {
                mView.hideDialog();
                mView.getWebUrl(webUrl);
            }
        });
    }
}
