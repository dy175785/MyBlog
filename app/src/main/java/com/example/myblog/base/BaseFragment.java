package com.example.myblog.base;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import butterknife.ButterKnife;


/**
 * dy@auth
 * 2020-03-12 创建的系统天
 * 17:53 创建的系统时间
 * 2020 创建的年份
 * 03 创建的月份
 * com.example.myblog.base 所在包名
 * Administrator 当前用户系统登录名
 */
public abstract class BaseFragment<P extends BasePresenter> extends Fragment {
    protected ProgressDialog dialog;
    protected P mP;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(getLayoutId(),container,false);
        ButterKnife.bind(this,view);
        dialog = new ProgressDialog(getContext());
        initViews();
        initData();
        return view;
    }

    protected abstract void initViews();

    public abstract int getLayoutId();
    public abstract void initData();

}
