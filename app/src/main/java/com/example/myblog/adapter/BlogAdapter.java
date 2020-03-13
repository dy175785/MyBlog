package com.example.myblog.adapter;

import androidx.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.myblog.R;
import com.example.myblog.entity.Blog;

import java.util.List;

/**
 * dy@auth
 * 2020-03-11 创建的系统天
 * 11:35 创建的系统时间
 * 2020 创建的年份
 * 03 创建的月份
 * com.example.mvp_model.adapter 所在包名
 * Administrator 当前用户系统登录名
 */
public class BlogAdapter extends BaseQuickAdapter<Blog.DataBean.DatasBean, BaseViewHolder> {

    public BlogAdapter(int layoutResId, @Nullable List<Blog.DataBean.DatasBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, Blog.DataBean.DatasBean item) {
        helper.setText(R.id.rv_item_tv_title,item.getTitle());
        helper.setText(R.id.sharing_2,item.getShareUser());
        helper.setText(R.id.classification_2,item.getSuperChapterName()+"/"+item.getChapterName());
        helper.setText(R.id.timev_2,item.getNiceShareDate());
    }


}
