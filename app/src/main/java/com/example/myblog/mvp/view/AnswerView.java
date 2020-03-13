package com.example.myblog.mvp.view;

import com.example.myblog.base.BaseView;
import com.example.myblog.entity.BlogTop;

/**
 * dy@auth
 * 2020-03-13 创建的系统天
 * 15:51 创建的系统时间
 * 2020 创建的年份
 * 03 创建的月份
 * com.example.myblog.mvp.view 所在包名
 * Administrator 当前用户系统登录名
 */
public interface AnswerView extends BaseView {

    void getAnswer(BlogTop blogTop);
}
