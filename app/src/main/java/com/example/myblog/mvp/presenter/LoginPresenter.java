package com.example.myblog.mvp.presenter;

import com.example.myblog.base.BasePresenter;
import com.example.myblog.base.BaseView;
import com.example.myblog.entity.User;
import com.example.myblog.mvp.model.LoginModel;
import com.example.myblog.mvp.view.LoginView;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

/**
 * dy@auth
 * 2020-03-12 创建的系统天
 * 15:56 创建的系统时间
 * 2020 创建的年份
 * 03 创建的月份
 * com.example.myblog.mvp.presenter 所在包名
 * Administrator 当前用户系统登录名
 */
public class LoginPresenter extends BasePresenter<LoginView,LoginModel> {

    public LoginPresenter(LoginView view) {
        super(view);
        mM = new LoginModel();
    }

    public void requesetLogin(){

        mView.showDialog("登录中");
        mM.requestLogin(mView.getName(),mView.getPwd())
                .subscribe(new Observer<User>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                    }

                    @Override
                    public void onNext(User user) {
                        mView.hideDialog();
                        mView.loginSuccess();
                    }

                    @Override
                    public void onError(Throwable e) {
                        mView.showDialog(e.getMessage());
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
