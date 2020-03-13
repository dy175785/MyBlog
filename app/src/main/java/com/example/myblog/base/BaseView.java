package com.example.myblog.base;

/**
 * dy@auth
 * 2020-03-12 创建的系统天
 * 15:51 创建的系统时间
 * 2020 创建的年份
 * 03 创建的月份
 * com.example.myblog.base 所在包名
 * Administrator 当前用户系统登录名
 */
public interface BaseView {
    /**
     * 显示对话框
     * @param msg
     */
    void showDialog(String msg);

    /**
     * 隐藏对话框
     */
    void hideDialog();

    /**
     * 错误
     * @param msg
     */
    void onError(String msg);
}
