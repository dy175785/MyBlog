package com.example.myblog.adapter;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;

/**
 * dy@auth
 * 2020-03-12 创建的系统天
 * 18:02 创建的系统时间
 * 2020 创建的年份
 * 03 创建的月份
 * com.example.myblog.adapter 所在包名
 * Administrator 当前用户系统登录名
 */
public class ViewPageAdapter extends FragmentPagerAdapter {
    List<Fragment> mList;
    Context mContext;
    public ViewPageAdapter(@NonNull FragmentManager fm, List<Fragment> list, Context context) {
        super(fm);
        mList = list;
        mContext = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return mList.get(position);
    }

    @Override
    public int getCount() {
        return mList!=null?mList.size():0;
    }
}
