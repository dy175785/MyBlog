package com.example.myblog.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.myblog.R;
import com.example.myblog.base.BaseActivity;

import butterknife.BindView;

public class WebActivity extends BaseActivity {
    @BindView(R.id.webView1)
    WebView mWebView;
    @Override
    protected int getLayout() {
        return R.layout.activity_web;
    }

    @Override
    protected void initViews() {
        if (getIntent()==null){
            this.finish();
        }else {
            String url = getIntent().getStringExtra("url");
            mWebView = (WebView) findViewById(R.id.webView1);
            // 设置WebView的客户端
            mWebView.setWebViewClient(new WebViewClient(){
                @Override
                public boolean shouldOverrideUrlLoading(WebView view, String url) {
                    return false;// 返回false
                }
            });
            //baiduboxapp:
            //webView加载网页后出现ERR_UNKNOWN_URL_SCHEME

            WebSettings webSettings = mWebView.getSettings();
            // 让WebView能够执行javaScript
            webSettings.setJavaScriptEnabled(true);
            // 让JavaScript可以自动打开windows
            webSettings.setJavaScriptCanOpenWindowsAutomatically(true);
            // 设置缓存
            webSettings.setAppCacheEnabled(true);
            // 设置缓存模式,一共有四种模式
            webSettings.setCacheMode(webSettings.LOAD_CACHE_ELSE_NETWORK);
            // 设置缓存路径
    //        webSettings.setAppCachePath("");
            // 支持缩放(适配到当前屏幕)
            webSettings.setSupportZoom(true);
            // 将图片调整到合适的大小
            webSettings.setUseWideViewPort(true);
            // 支持内容重新布局,一共有四种方式
            // 默认的是NARROW_COLUMNS
            webSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
            // 设置可以被显示的屏幕控制
            webSettings.setDisplayZoomControls(true);
            // 设置默认字体大小
            webSettings.setDefaultFontSize(12);

            // 设置WebView属性，能够执行Javascript脚本
            // mWebView.getSettings().setJavaScriptEnabled(true);
            //3、 加载需要显示的网页
            mWebView.loadUrl(url);
        }
    }

    @Override
    protected void initData() {

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
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) ) {
            if (mWebView.canGoBack())
            {
                mWebView.goBack(); //goBack()表示返回WebView的上一页面
                return true;
            }else
            {
                finish();
                return true;
            }

        }
        return false;
    }
}
