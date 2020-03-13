package com.example.myblog.fragment;


import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.example.myblog.R;
import com.example.myblog.adapter.BlogAdapter;
import com.example.myblog.adapter.WebAdapter;
import com.example.myblog.base.BaseFragment;
import com.example.myblog.entity.Blog;
import com.example.myblog.entity.WebUrl;
import com.example.myblog.mvp.presenter.HomePresenter;
import com.example.myblog.mvp.view.HomeView;
import com.example.myblog.ui.WebActivity;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends BaseFragment<HomePresenter> implements HomeView {
    @BindView(R.id.home_spinner)
    Spinner mSpinner;
    @BindView(R.id.refreshLayout)
    SmartRefreshLayout mRefreshLayout;
    @BindView(R.id.home_rv_item)
    RecyclerView mRecyclerView;
    private WebAdapter adapter;
    private int count = 0;
    private BlogAdapter mAdapter;
    private List<Blog.DataBean.DatasBean> mBeans;
    private List<WebUrl.DataBean> mUrlList = new ArrayList<>();
    @Override
    protected void initViews() {
        mP = new HomePresenter(this);
        mBeans = new ArrayList<>();
        //初始化适配器 添加数据
        mAdapter = new BlogAdapter(R.layout.blog_item_rv,mBeans);
        //设置布局
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        //给适配器绑定 布局
        mRecyclerView.setAdapter(mAdapter);
        mP.requestBlog(0);
        mRefreshLayout.autoLoadMore();
    }

    /**
     * 设置页面 显示数据
     * @return
     */
    @Override
    public int getLayoutId() {
        return R.layout.fragment_home;
    }

    @Override
    public void initData() {
        //刷新
        shuaxin();
        //设置加载动画
        mAdapter.openLoadAnimation(BaseQuickAdapter.SCALEIN);
        mAdapter.isFirstOnly(false);
        //设置Spinner点击事件
        mSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        mRefreshLayout.setEnableRefresh(true);
                        mRefreshLayout.setEnableLoadMore(true);
                        shuaxin();
                        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
                        mRecyclerView.setAdapter(mAdapter);

                        break;
                    case 1:
                        mP.getWebUrl();
                        break;
                    default:
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        //首页的点击事件
        mAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                Blog.DataBean.DatasBean o = (Blog.DataBean.DatasBean) adapter.getData().get(position);
                Intent intent = new Intent(getActivity(), WebActivity.class);
                intent.putExtra("url",o.getLink());
                startActivity(intent);
            }
        });

    }

    @Override
    public void getBlog(Blog blog) {
        mBeans.addAll(blog.getData().getDatas());
    }

    @Override
    public void getWebUrl(WebUrl webUrl) {
        adapter = new WebAdapter(R.layout.weburl_item,webUrl.getData());
        mRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        adapter.bindToRecyclerView(mRecyclerView);
        mRefreshLayout.setEnableRefresh(false);
        mRefreshLayout.setEnableLoadMore(false);
        adapter.openLoadAnimation(BaseQuickAdapter.EMPTY_VIEW);
        adapter.isFirstOnly(false);
        //常用网站的点击事件
        adapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                WebUrl.DataBean o = (WebUrl.DataBean) adapter.getData().get(position);
                Intent intent = new Intent(getActivity(), WebActivity.class);
                intent.putExtra("url",o.getLink());
                startActivity(intent);
            }
        });
    }

    @Override
    public void getTopBlog(Blog blog) {

    }

    @Override
    public void showDialog(String msg) {
        dialog.setTitle(msg);
        dialog.setMessage(msg);
        dialog.show();
    }

    @Override
    public void hideDialog() {
        dialog.hide();
    }

    @Override
    public void onError(String msg) {

    }

    public void shuaxin(){
        //设置上拉刷新监听
        mRefreshLayout.setOnRefreshListener(refreshLayout -> {
            mRefreshLayout.setEnableLoadMore(false);
            if (count!=0){
                mP.requestBlog(--count);
            }else{
                mP.requestBlog(0);
            }
            mRefreshLayout.finishRefresh();
            mRefreshLayout.setEnableLoadMore(true);
        });
        //下拉刷新
        mRefreshLayout.setOnLoadMoreListener(refreshLayout -> {
            mRefreshLayout.setEnableRefresh(false);
            mP.requestBlog(++count);
            mAdapter.setNewData(mBeans);
            mRefreshLayout.finishLoadMore();
            mRefreshLayout.setEnableRefresh(true);
        });
    }
}
