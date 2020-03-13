package com.example.myblog.mvp.presenter;

import com.example.myblog.base.BasePresenter;
import com.example.myblog.base.BaseView;
import com.example.myblog.entity.BlogTop;
import com.example.myblog.mvp.model.AnswerModel;
import com.example.myblog.mvp.view.AnswerView;

import io.reactivex.functions.Consumer;

/**
 * dy@auth
 * 2020-03-13 创建的系统天
 * 15:48 创建的系统时间
 * 2020 创建的年份
 * 03 创建的月份
 * com.example.myblog.mvp.presenter 所在包名
 * Administrator 当前用户系统登录名
 */
public class AnswerPresenter extends BasePresenter<AnswerView, AnswerModel> {

    public AnswerPresenter(AnswerView view) {
        super(view);
        mM = new AnswerModel();
    }

    public void getAnswer(int page){
        mM.requestAnswer(page).subscribe(new Consumer<BlogTop>() {
            @Override
            public void accept(BlogTop blogTop) throws Exception {
                mView.getAnswer(blogTop);
            }
        });
    }
}
