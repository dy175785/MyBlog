package com.example.myblog.api;

import com.example.myblog.entity.Blog;
import com.example.myblog.entity.BlogTop;
import com.example.myblog.entity.User;
import com.example.myblog.entity.WebUrl;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * dy@auth
 * 2020-03-11 创建的系统天
 * 09:44 创建的系统时间
 * 2020 创建的年份
 * 03 创建的月份
 * com.example.mvp_model.api 所在包名
 * Administrator 当前用户系统登录名
 */
public interface API131 {
    @POST("user/login")
    Observable<User> requestLogin(@Query("username") String username, @Query("password") String password);

    @GET("article/list/{page}/json")
    Observable<Blog> getBlog(@Path("page") int page);

    @GET("friend/json")
    Observable<WebUrl> getUrl();

    @GET("article/top/json")
    Observable<BlogTop> getTopBlog();

    @GET("wenda/list/{page}/json ")
    Observable<BlogTop> getAnswer(@Path("page")int page);

}
