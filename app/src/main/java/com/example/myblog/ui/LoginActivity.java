package com.example.myblog.ui;


import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myblog.MainActivity;
import com.example.myblog.R;
import com.example.myblog.base.BaseActivity;
import com.example.myblog.mvp.presenter.LoginPresenter;
import com.example.myblog.mvp.view.LoginView;

import butterknife.BindView;
import butterknife.OnClick;

public class LoginActivity extends BaseActivity<LoginPresenter> implements LoginView {
    @BindView(R.id.username)
    EditText username;
    @BindView(R.id.password)
    EditText password;
    @BindView(R.id.login)
    Button login;
    @Override
    protected int getLayout() {
        return R.layout.activity_login;
    }

    @Override
    protected void initViews() {
        mPresenter = new LoginPresenter(this);

    }

    @Override
    protected void initData() {

    }
    @Override
    public String getName() {
        return username.getText().toString().trim();
    }

    @Override
    public String getPwd() {
        return password.getText().toString().trim();
    }

    @Override
    public void loginSuccess() {
        startActivity(new Intent(this, MainActivity.class));
        this.finish();
    }

    @Override
    public void loginError(String msg) {
        dialog.setTitle("网络挂掉了");
        dialog.setMessage("送一个闪退");
        dialog.show();
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

    /**
     * 登录事件
     */
    @OnClick(R.id.login)
    public void onclick(){
        mPresenter.requesetLogin();
    }

}
