package com.example.myblog.base;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myblog.mvp.presenter.LoginPresenter;
import com.example.myblog.ui.LoginActivity;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import butterknife.ButterKnife;
import me.yokeyword.fragmentation.SupportActivity;

/**
 * dy@auth
 * 2020-03-12 创建的系统天
 * 15:47 创建的系统时间
 * 2020 创建的年份
 * 03 创建的月份
 * com.example.myblog.base 所在包名
 * Administrator 当前用户系统登录名
 */
public abstract class BaseActivity<P extends BasePresenter> extends SupportActivity implements BaseView{
    protected P mPresenter;
    protected ProgressDialog dialog;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(LayoutInflater.from(this).inflate(getLayout(),null));
        ButterKnife.bind(this);
        dialog = new ProgressDialog(this);
        new Thread(){
            @Override
            public void run() {
                super.run();
                if (!isOnline()){
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(BaseActivity.this, "当前没有网络", Toast.LENGTH_SHORT).show();
                            System.exit(0);
                        }
                    });
                }
            }
        }.start();
        initViews();
        initData();
    }

    /**
     * 设置布局
     * @return
     */
    protected abstract int getLayout();

    /**
     * 初始化组件
     */
    protected abstract void initViews();
    /**
     * 初始化数据
     */
    protected abstract void initData();

    public boolean isOnline(){
        URL url;
        try {
            url = new URL("https://www.baidu.com");
            InputStream stream = url.openStream();
            return true;
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
