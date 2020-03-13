package com.example.myblog.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.example.myblog.R;
import com.example.myblog.base.BaseFragment;
import com.example.myblog.entity.BlogTop;
import com.example.myblog.mvp.view.AnswerView;

import butterknife.BindView;

/**
 * A simple {@link Fragment} subclass.
 */
public class AnswerFragment extends BaseFragment implements AnswerView {

    @BindView(R.id.answer_refreshLayout)
    RelativeLayout mRelativeLayout;

    @BindView(R.id.answer_rv_item)
    RecyclerView mRecyclerView;

    @Override
    protected void initViews() {

    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_answer;
    }

    @Override
    public void initData() {

    }

    @Override
    public void showDialog(String msg) {

    }

    @Override
    public void hideDialog() {

    }

    @Override
    public void onError(String msg) {

    }

    @Override
    public void getAnswer(BlogTop blogTop) {

    }
}
