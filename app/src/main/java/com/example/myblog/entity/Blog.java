package com.example.myblog.entity;

import java.util.List;

/**
 * dy@auth
 * 2020-03-11 创建的系统天
 * 11:32 创建的系统时间
 * 2020 创建的年份
 * 03 创建的月份
 * com.example.mvp_model.entity 所在包名
 * Administrator 当前用户系统登录名
 */
public class Blog {

    /**
     * data : {"curPage":1,"datas":[{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"id":12327,"link":"https://juejin.im/post/5e66541bf265da5732553af2","niceDate":"1小时前","niceShareDate":"1小时前","origin":"","prefix":"","projectLink":"","publishTime":1583891078000,"selfVisible":0,"shareDate":1583890112000,"shareUser":"chs2018","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Android自动化测试入门(三)Espresso","type":0,"userId":9180,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":26,"chapterName":"基础UI控件","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"id":12305,"link":"https://juejin.im/post/5e659f6ce51d45272443f3e2","niceDate":"12小时前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1583849219000,"selfVisible":0,"shareDate":1583800890000,"shareUser":"AprilEyon","superChapterId":26,"superChapterName":"常用控件","tags":[],"title":"Android性能优化-TextView的setText方法会导致界面重绘？","type":0,"userId":3559,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":432,"chapterName":"UI渲染","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"id":12317,"link":"https://juejin.im/post/5e64390bf265da575f4e7de8","niceDate":"13小时前","niceShareDate":"13小时前","origin":"","prefix":"","projectLink":"","publishTime":1583849167000,"selfVisible":0,"shareDate":1583845924000,"shareUser":"鸿洋","superChapterId":173,"superChapterName":"framework","tags":[],"title":"说说Android的UI刷新机制","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":459,"chapterName":"Activity","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"id":12320,"link":"https://juejin.im/post/5e6640f0e51d4527021907f1","niceDate":"13小时前","niceShareDate":"13小时前","origin":"","prefix":"","projectLink":"","publishTime":1583849151000,"selfVisible":0,"shareDate":1583846381000,"shareUser":"鸿洋","superChapterId":173,"superChapterName":"framework","tags":[],"title":"来聊聊Activity的显示原理","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":444,"chapterName":"androidx","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"id":12319,"link":"https://juejin.im/post/5e67523551882549003d2c4f","niceDate":"13小时前","niceShareDate":"13小时前","origin":"","prefix":"","projectLink":"","publishTime":1583849105000,"selfVisible":0,"shareDate":1583846378000,"shareUser":"鸿洋","superChapterId":55,"superChapterName":"5.+高新技术","tags":[],"title":"【背上Jetpack之Fragment】从源码角度看 Fragment 生命周期 AndroidX Fragment1.2.2源码分析","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":78,"chapterName":"性能优化","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"id":12321,"link":"https://juejin.im/post/5e66eca351882549431ffee0","niceDate":"13小时前","niceShareDate":"13小时前","origin":"","prefix":"","projectLink":"","publishTime":1583849092000,"selfVisible":0,"shareDate":1583846413000,"shareUser":"鸿洋","superChapterId":196,"superChapterName":"热门专题","tags":[],"title":"Android性能优化-你的lottie动画今天跳帧了吗？","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>之前我们讨论过 <a href=\"https://wanandroid.com/wenda/show/8488\">View的onAttachedToWindow ,onDetachedFromWindow 调用时机<\/a> 。<\/p>\r\n<p>这个机制在RecyclerView卡片中还适用吗？<\/p>\r\n<p>例如我们在RecyclerView的Item的onBindViewHolder时，利用一个CountDownTimer去做一个倒计时显示 / 或者是有一个属性动画效果？<\/p>\r\n<ol>\r\n<li>到底在什么时候可以cancel掉这个倒计时/ 动画，而不影响功能了（滑动到用户可见范围内，倒计时/动画 运作正常）?<\/li>\r\n<li>有什么方法可以和onBindViewHolder 对应吗？就像onAttachedToWindow ,onDetachedFromWindow这样 。<\/li>\r\n<\/ol>","descMd":"","envelopePic":"","fresh":true,"id":12148,"link":"https://wanandroid.com/wenda/show/12148","niceDate":"13小时前","niceShareDate":"2020-03-01 15:14","origin":"","prefix":"","projectLink":"","publishTime":1583845880000,"selfVisible":0,"shareDate":1583046877000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 RecyclerView卡片中持有的资源，到底该什么时候释放？","type":0,"userId":2,"visible":1,"zan":17},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"id":12309,"link":"https://juejin.im/post/5e6712356fb9a07cd323e7a2","niceDate":"20小时前","niceShareDate":"20小时前","origin":"","prefix":"","projectLink":"","publishTime":1583823687000,"selfVisible":0,"shareDate":1583823687000,"shareUser":"许朋友爱玩","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"进阶之路 | 奇妙的Thread之旅","type":0,"userId":43523,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"id":12306,"link":"https://juejin.im/post/5e664f30f265da572549d3e2","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1583801324000,"selfVisible":0,"shareDate":1583801324000,"shareUser":"chs2018","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Android自动化测试入门(二)UI Automator","type":0,"userId":9180,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12301,"link":"https://juejin.im/post/5e664d04f265da57127e56f6","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1583765062000,"selfVisible":0,"shareDate":1583765062000,"shareUser":"chs2018","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Android自动化测试入门(一)Monkey和MonkeyRunner","type":0,"userId":9180,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12296,"link":"https://www.jianshu.com/p/5c5c03ff4370","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1583751214000,"selfVisible":0,"shareDate":1583751187000,"shareUser":"ZhangKe_","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Gradle 扫盲与 Task 基础","type":0,"userId":11873,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12295,"link":"https://blog.csdn.net/Fantasy_Lin_/article/details/104686495","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1583737371000,"selfVisible":0,"shareDate":1583737371000,"shareUser":"FantasyLin","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Android App 架构设计相关资料汇总","type":0,"userId":17645,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12293,"link":"https://juejin.im/post/5e65ad276fb9a07cc01a3264","niceDate":"2天前","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1583722471000,"selfVisible":0,"shareDate":1583722471000,"shareUser":"JsonChao","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"《【建议收藏】面试没有亮点？给你一份Android热门三方库源码面试宝典》","type":0,"userId":611,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12291,"link":"https://weilu.blog.csdn.net/article/details/104745624","niceDate":"2天前","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1583717354000,"selfVisible":0,"shareDate":1583717354000,"shareUser":"唯鹿","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"说说Flutter中最熟悉的陌生人 &mdash;&mdash; Key","type":0,"userId":2657,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"xing16","canEdit":false,"chapterId":402,"chapterName":"跨平台应用","collect":false,"courseId":13,"desc":"玩 Android 是基于 Flutter 开发的跨平台的客户端应用，包括首页，项目，体系，搜索，妹子浏览，积分，自定义控件动画控件，主题切换，暗黑模式等功能。","descMd":"","envelopePic":"https://www.wanandroid.com/blogimgs/a5740328-31a4-4554-be61-8f0de83dd8ec.png","fresh":false,"id":12245,"link":"https://www.wanandroid.com/blog/show/2720","niceDate":"2天前","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"https://github.com/xing16/WanAndroid-Flutter","publishTime":1583665358000,"selfVisible":0,"shareDate":1583665358000,"shareUser":"","superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=402"}],"title":"精致de玩 Android 客户端(Flutter 版)","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"devallever","canEdit":false,"chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"介绍\r\n【文本翻译器】是一款免费的简洁实用的翻译软件。文本翻译器应用程序完全免费，可以非常快速翻译您的单词，帮助您与外国人交流。文本翻译器适用于旅行者、学生、商人和其他语言爱好者，使用文本翻译器可以轻松了解其他语言。文本翻译器支持多国语言，全新领先的翻译引擎，让各种变得更加可靠有保证。界面设计简洁、优雅，体积小巧，但是功能很强大哦。赶快下载来试试吧~","descMd":"","envelopePic":"https://www.wanandroid.com/blogimgs/9fc6e10c-b3e8-46bb-928b-05ccd2147335.png","fresh":false,"id":12244,"link":"https://www.wanandroid.com/blog/show/2719","niceDate":"2天前","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"https://github.com/devallever/TranslationTextOpenSource","publishTime":1583665265000,"selfVisible":0,"shareDate":1583665265000,"shareUser":"","superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"TranslationTextOpenSource-文本翻译器开源版","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"darryrzhong","canEdit":false,"chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"该开源项目采用组件化的方式开发，使用MVVM + AndroidX + jetpack 组件为基本架构进行开发。","descMd":"","envelopePic":"https://www.wanandroid.com/blogimgs/01bbbf6a-da45-4bf9-8924-471dc337b8d0.png","fresh":false,"id":12243,"link":"https://www.wanandroid.com/blog/show/2718","niceDate":"2天前","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"https://github.com/darryrzhong/Android-MvvmComponent-App","publishTime":1583665230000,"selfVisible":0,"shareDate":1583665230000,"shareUser":"","superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"Android 组件化开源app -开眼短视频(OpenEyes)","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":375,"chapterName":"Flutter","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12231,"link":"https://zhuanlan.zhihu.com/p/90836859","niceDate":"2天前","niceShareDate":"2020-03-07 22:28","origin":"","prefix":"","projectLink":"","publishTime":1583665117000,"selfVisible":0,"shareDate":1583591298000,"shareUser":"鸿洋","superChapterId":375,"superChapterName":"跨平台","tags":[],"title":"万字长文轻松彻底入门 Flutter，秒变大前端","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":135,"chapterName":"二维码","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12228,"link":"https://blog.csdn.net/yinhaide/article/details/104551458","niceDate":"2天前","niceShareDate":"2020-03-07 17:46","origin":"","prefix":"","projectLink":"","publishTime":1583665110000,"selfVisible":0,"shareDate":1583574388000,"shareUser":"鸿洋","superChapterId":135,"superChapterName":"项目必备","tags":[],"title":"Android二维码原理与优化方向","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":171,"chapterName":"binder","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12242,"link":"https://www.jianshu.com/p/4a135838da4a","niceDate":"2天前","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1583665072000,"selfVisible":0,"shareDate":1583663860000,"shareUser":"鸿洋","superChapterId":173,"superChapterName":"framework","tags":[],"title":"腾讯面试题&mdash;&mdash;谈一谈Binder的原理和实现一次拷贝的流程","type":0,"userId":2,"visible":1,"zan":0}],"offset":0,"over":false,"pageCount":404,"size":20,"total":8077}
     * errorCode : 0
     * errorMsg :
     */

    private DataBean data;
    private int errorCode;
    private String errorMsg;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "data=" + data +
                ", errorCode=" + errorCode +
                ", errorMsg='" + errorMsg + '\'' +
                '}';
    }

    public static class DataBean {
        /**
         * curPage : 1
         * datas : [{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"id":12327,"link":"https://juejin.im/post/5e66541bf265da5732553af2","niceDate":"1小时前","niceShareDate":"1小时前","origin":"","prefix":"","projectLink":"","publishTime":1583891078000,"selfVisible":0,"shareDate":1583890112000,"shareUser":"chs2018","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Android自动化测试入门(三)Espresso","type":0,"userId":9180,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":26,"chapterName":"基础UI控件","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"id":12305,"link":"https://juejin.im/post/5e659f6ce51d45272443f3e2","niceDate":"12小时前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1583849219000,"selfVisible":0,"shareDate":1583800890000,"shareUser":"AprilEyon","superChapterId":26,"superChapterName":"常用控件","tags":[],"title":"Android性能优化-TextView的setText方法会导致界面重绘？","type":0,"userId":3559,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":432,"chapterName":"UI渲染","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"id":12317,"link":"https://juejin.im/post/5e64390bf265da575f4e7de8","niceDate":"13小时前","niceShareDate":"13小时前","origin":"","prefix":"","projectLink":"","publishTime":1583849167000,"selfVisible":0,"shareDate":1583845924000,"shareUser":"鸿洋","superChapterId":173,"superChapterName":"framework","tags":[],"title":"说说Android的UI刷新机制","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":459,"chapterName":"Activity","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"id":12320,"link":"https://juejin.im/post/5e6640f0e51d4527021907f1","niceDate":"13小时前","niceShareDate":"13小时前","origin":"","prefix":"","projectLink":"","publishTime":1583849151000,"selfVisible":0,"shareDate":1583846381000,"shareUser":"鸿洋","superChapterId":173,"superChapterName":"framework","tags":[],"title":"来聊聊Activity的显示原理","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":444,"chapterName":"androidx","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"id":12319,"link":"https://juejin.im/post/5e67523551882549003d2c4f","niceDate":"13小时前","niceShareDate":"13小时前","origin":"","prefix":"","projectLink":"","publishTime":1583849105000,"selfVisible":0,"shareDate":1583846378000,"shareUser":"鸿洋","superChapterId":55,"superChapterName":"5.+高新技术","tags":[],"title":"【背上Jetpack之Fragment】从源码角度看 Fragment 生命周期 AndroidX Fragment1.2.2源码分析","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":78,"chapterName":"性能优化","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"id":12321,"link":"https://juejin.im/post/5e66eca351882549431ffee0","niceDate":"13小时前","niceShareDate":"13小时前","origin":"","prefix":"","projectLink":"","publishTime":1583849092000,"selfVisible":0,"shareDate":1583846413000,"shareUser":"鸿洋","superChapterId":196,"superChapterName":"热门专题","tags":[],"title":"Android性能优化-你的lottie动画今天跳帧了吗？","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>之前我们讨论过 <a href=\"https://wanandroid.com/wenda/show/8488\">View的onAttachedToWindow ,onDetachedFromWindow 调用时机<\/a> 。<\/p>\r\n<p>这个机制在RecyclerView卡片中还适用吗？<\/p>\r\n<p>例如我们在RecyclerView的Item的onBindViewHolder时，利用一个CountDownTimer去做一个倒计时显示 / 或者是有一个属性动画效果？<\/p>\r\n<ol>\r\n<li>到底在什么时候可以cancel掉这个倒计时/ 动画，而不影响功能了（滑动到用户可见范围内，倒计时/动画 运作正常）?<\/li>\r\n<li>有什么方法可以和onBindViewHolder 对应吗？就像onAttachedToWindow ,onDetachedFromWindow这样 。<\/li>\r\n<\/ol>","descMd":"","envelopePic":"","fresh":true,"id":12148,"link":"https://wanandroid.com/wenda/show/12148","niceDate":"13小时前","niceShareDate":"2020-03-01 15:14","origin":"","prefix":"","projectLink":"","publishTime":1583845880000,"selfVisible":0,"shareDate":1583046877000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 RecyclerView卡片中持有的资源，到底该什么时候释放？","type":0,"userId":2,"visible":1,"zan":17},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"id":12309,"link":"https://juejin.im/post/5e6712356fb9a07cd323e7a2","niceDate":"20小时前","niceShareDate":"20小时前","origin":"","prefix":"","projectLink":"","publishTime":1583823687000,"selfVisible":0,"shareDate":1583823687000,"shareUser":"许朋友爱玩","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"进阶之路 | 奇妙的Thread之旅","type":0,"userId":43523,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"id":12306,"link":"https://juejin.im/post/5e664f30f265da572549d3e2","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1583801324000,"selfVisible":0,"shareDate":1583801324000,"shareUser":"chs2018","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Android自动化测试入门(二)UI Automator","type":0,"userId":9180,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12301,"link":"https://juejin.im/post/5e664d04f265da57127e56f6","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1583765062000,"selfVisible":0,"shareDate":1583765062000,"shareUser":"chs2018","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Android自动化测试入门(一)Monkey和MonkeyRunner","type":0,"userId":9180,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12296,"link":"https://www.jianshu.com/p/5c5c03ff4370","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1583751214000,"selfVisible":0,"shareDate":1583751187000,"shareUser":"ZhangKe_","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Gradle 扫盲与 Task 基础","type":0,"userId":11873,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12295,"link":"https://blog.csdn.net/Fantasy_Lin_/article/details/104686495","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1583737371000,"selfVisible":0,"shareDate":1583737371000,"shareUser":"FantasyLin","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Android App 架构设计相关资料汇总","type":0,"userId":17645,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12293,"link":"https://juejin.im/post/5e65ad276fb9a07cc01a3264","niceDate":"2天前","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1583722471000,"selfVisible":0,"shareDate":1583722471000,"shareUser":"JsonChao","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"《【建议收藏】面试没有亮点？给你一份Android热门三方库源码面试宝典》","type":0,"userId":611,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12291,"link":"https://weilu.blog.csdn.net/article/details/104745624","niceDate":"2天前","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1583717354000,"selfVisible":0,"shareDate":1583717354000,"shareUser":"唯鹿","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"说说Flutter中最熟悉的陌生人 &mdash;&mdash; Key","type":0,"userId":2657,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"xing16","canEdit":false,"chapterId":402,"chapterName":"跨平台应用","collect":false,"courseId":13,"desc":"玩 Android 是基于 Flutter 开发的跨平台的客户端应用，包括首页，项目，体系，搜索，妹子浏览，积分，自定义控件动画控件，主题切换，暗黑模式等功能。","descMd":"","envelopePic":"https://www.wanandroid.com/blogimgs/a5740328-31a4-4554-be61-8f0de83dd8ec.png","fresh":false,"id":12245,"link":"https://www.wanandroid.com/blog/show/2720","niceDate":"2天前","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"https://github.com/xing16/WanAndroid-Flutter","publishTime":1583665358000,"selfVisible":0,"shareDate":1583665358000,"shareUser":"","superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=402"}],"title":"精致de玩 Android 客户端(Flutter 版)","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"devallever","canEdit":false,"chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"介绍\r\n【文本翻译器】是一款免费的简洁实用的翻译软件。文本翻译器应用程序完全免费，可以非常快速翻译您的单词，帮助您与外国人交流。文本翻译器适用于旅行者、学生、商人和其他语言爱好者，使用文本翻译器可以轻松了解其他语言。文本翻译器支持多国语言，全新领先的翻译引擎，让各种变得更加可靠有保证。界面设计简洁、优雅，体积小巧，但是功能很强大哦。赶快下载来试试吧~","descMd":"","envelopePic":"https://www.wanandroid.com/blogimgs/9fc6e10c-b3e8-46bb-928b-05ccd2147335.png","fresh":false,"id":12244,"link":"https://www.wanandroid.com/blog/show/2719","niceDate":"2天前","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"https://github.com/devallever/TranslationTextOpenSource","publishTime":1583665265000,"selfVisible":0,"shareDate":1583665265000,"shareUser":"","superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"TranslationTextOpenSource-文本翻译器开源版","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"darryrzhong","canEdit":false,"chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"该开源项目采用组件化的方式开发，使用MVVM + AndroidX + jetpack 组件为基本架构进行开发。","descMd":"","envelopePic":"https://www.wanandroid.com/blogimgs/01bbbf6a-da45-4bf9-8924-471dc337b8d0.png","fresh":false,"id":12243,"link":"https://www.wanandroid.com/blog/show/2718","niceDate":"2天前","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"https://github.com/darryrzhong/Android-MvvmComponent-App","publishTime":1583665230000,"selfVisible":0,"shareDate":1583665230000,"shareUser":"","superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"Android 组件化开源app -开眼短视频(OpenEyes)","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":375,"chapterName":"Flutter","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12231,"link":"https://zhuanlan.zhihu.com/p/90836859","niceDate":"2天前","niceShareDate":"2020-03-07 22:28","origin":"","prefix":"","projectLink":"","publishTime":1583665117000,"selfVisible":0,"shareDate":1583591298000,"shareUser":"鸿洋","superChapterId":375,"superChapterName":"跨平台","tags":[],"title":"万字长文轻松彻底入门 Flutter，秒变大前端","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":135,"chapterName":"二维码","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12228,"link":"https://blog.csdn.net/yinhaide/article/details/104551458","niceDate":"2天前","niceShareDate":"2020-03-07 17:46","origin":"","prefix":"","projectLink":"","publishTime":1583665110000,"selfVisible":0,"shareDate":1583574388000,"shareUser":"鸿洋","superChapterId":135,"superChapterName":"项目必备","tags":[],"title":"Android二维码原理与优化方向","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":171,"chapterName":"binder","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12242,"link":"https://www.jianshu.com/p/4a135838da4a","niceDate":"2天前","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1583665072000,"selfVisible":0,"shareDate":1583663860000,"shareUser":"鸿洋","superChapterId":173,"superChapterName":"framework","tags":[],"title":"腾讯面试题&mdash;&mdash;谈一谈Binder的原理和实现一次拷贝的流程","type":0,"userId":2,"visible":1,"zan":0}]
         * offset : 0
         * over : false
         * pageCount : 404
         * size : 20
         * total : 8077
         */

        private int curPage;
        private int offset;
        private boolean over;
        private int pageCount;
        private int size;
        private int total;
        private List<DatasBean> datas;

        public int getCurPage() {
            return curPage;
        }

        public void setCurPage(int curPage) {
            this.curPage = curPage;
        }

        public int getOffset() {
            return offset;
        }

        public void setOffset(int offset) {
            this.offset = offset;
        }

        public boolean isOver() {
            return over;
        }

        public void setOver(boolean over) {
            this.over = over;
        }

        public int getPageCount() {
            return pageCount;
        }

        public void setPageCount(int pageCount) {
            this.pageCount = pageCount;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public List<DatasBean> getDatas() {
            return datas;
        }

        public void setDatas(List<DatasBean> datas) {
            this.datas = datas;
        }

        public static class DatasBean {
            /**
             * apkLink :
             * audit : 1
             * author :
             * canEdit : false
             * chapterId : 502
             * chapterName : 自助
             * collect : false
             * courseId : 13
             * desc :
             * descMd :
             * envelopePic :
             * fresh : true
             * id : 12327
             * link : https://juejin.im/post/5e66541bf265da5732553af2
             * niceDate : 1小时前
             * niceShareDate : 1小时前
             * origin :
             * prefix :
             * projectLink :
             * publishTime : 1583891078000
             * selfVisible : 0
             * shareDate : 1583890112000
             * shareUser : chs2018
             * superChapterId : 494
             * superChapterName : 广场Tab
             * tags : []
             * title : Android自动化测试入门(三)Espresso
             * type : 0
             * userId : 9180
             * visible : 1
             * zan : 0
             */

            private String apkLink;
            private int audit;
            private String author;
            private boolean canEdit;
            private int chapterId;
            private String chapterName;
            private boolean collect;
            private int courseId;
            private String desc;
            private String descMd;
            private String envelopePic;
            private boolean fresh;
            private int id;
            private String link;
            private String niceDate;
            private String niceShareDate;
            private String origin;
            private String prefix;
            private String projectLink;
            private long publishTime;
            private int selfVisible;
            private long shareDate;
            private String shareUser;
            private int superChapterId;
            private String superChapterName;
            private String title;
            private int type;
            private int userId;
            private int visible;
            private int zan;
            private List<?> tags;

            public String getApkLink() {
                return apkLink;
            }

            public void setApkLink(String apkLink) {
                this.apkLink = apkLink;
            }

            public int getAudit() {
                return audit;
            }

            public void setAudit(int audit) {
                this.audit = audit;
            }

            public String getAuthor() {
                return author;
            }

            public void setAuthor(String author) {
                this.author = author;
            }

            public boolean isCanEdit() {
                return canEdit;
            }

            public void setCanEdit(boolean canEdit) {
                this.canEdit = canEdit;
            }

            public int getChapterId() {
                return chapterId;
            }

            public void setChapterId(int chapterId) {
                this.chapterId = chapterId;
            }

            public String getChapterName() {
                return chapterName;
            }

            public void setChapterName(String chapterName) {
                this.chapterName = chapterName;
            }

            public boolean isCollect() {
                return collect;
            }

            public void setCollect(boolean collect) {
                this.collect = collect;
            }

            public int getCourseId() {
                return courseId;
            }

            public void setCourseId(int courseId) {
                this.courseId = courseId;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getDescMd() {
                return descMd;
            }

            public void setDescMd(String descMd) {
                this.descMd = descMd;
            }

            public String getEnvelopePic() {
                return envelopePic;
            }

            public void setEnvelopePic(String envelopePic) {
                this.envelopePic = envelopePic;
            }

            public boolean isFresh() {
                return fresh;
            }

            public void setFresh(boolean fresh) {
                this.fresh = fresh;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public String getNiceDate() {
                return niceDate;
            }

            public void setNiceDate(String niceDate) {
                this.niceDate = niceDate;
            }

            public String getNiceShareDate() {
                return niceShareDate;
            }

            public void setNiceShareDate(String niceShareDate) {
                this.niceShareDate = niceShareDate;
            }

            public String getOrigin() {
                return origin;
            }

            public void setOrigin(String origin) {
                this.origin = origin;
            }

            public String getPrefix() {
                return prefix;
            }

            public void setPrefix(String prefix) {
                this.prefix = prefix;
            }

            public String getProjectLink() {
                return projectLink;
            }

            public void setProjectLink(String projectLink) {
                this.projectLink = projectLink;
            }

            public long getPublishTime() {
                return publishTime;
            }

            public void setPublishTime(long publishTime) {
                this.publishTime = publishTime;
            }

            public int getSelfVisible() {
                return selfVisible;
            }

            public void setSelfVisible(int selfVisible) {
                this.selfVisible = selfVisible;
            }

            public long getShareDate() {
                return shareDate;
            }

            public void setShareDate(long shareDate) {
                this.shareDate = shareDate;
            }

            public String getShareUser() {
                return shareUser;
            }

            public void setShareUser(String shareUser) {
                this.shareUser = shareUser;
            }

            public int getSuperChapterId() {
                return superChapterId;
            }

            public void setSuperChapterId(int superChapterId) {
                this.superChapterId = superChapterId;
            }

            public String getSuperChapterName() {
                return superChapterName;
            }

            public void setSuperChapterName(String superChapterName) {
                this.superChapterName = superChapterName;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public int getUserId() {
                return userId;
            }

            public void setUserId(int userId) {
                this.userId = userId;
            }

            public int getVisible() {
                return visible;
            }

            public void setVisible(int visible) {
                this.visible = visible;
            }

            public int getZan() {
                return zan;
            }

            public void setZan(int zan) {
                this.zan = zan;
            }

            public List<?> getTags() {
                return tags;
            }

            public void setTags(List<?> tags) {
                this.tags = tags;
            }
        }
    }
}
