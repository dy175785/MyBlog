package com.example.myblog.adapter;

import androidx.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.myblog.R;
import com.example.myblog.entity.WebUrl;

import java.util.List;
import java.util.Random;

/**
 * dy@auth
 * 2020-03-13 创建的系统天
 * 13:39 创建的系统时间
 * 2020 创建的年份
 * 03 创建的月份
 * com.example.myblog.adapter 所在包名
 * Administrator 当前用户系统登录名
 */
public class WebAdapter extends BaseQuickAdapter<WebUrl.DataBean, BaseViewHolder> {

    public WebAdapter(int layoutResId, @Nullable List<WebUrl.DataBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, WebUrl.DataBean item) {
        helper.setText(R.id.home_tv_url,item.getId()+":"+item.getName());
    }
}
