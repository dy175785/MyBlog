package com.example.myblog.entity;

import java.util.List;

/**
 * dy@auth
 * 2020-03-13 创建的系统天
 * 14:29 创建的系统时间
 * 2020 创建的年份
 * 03 创建的月份
 * com.example.myblog.entity 所在包名
 * Administrator 当前用户系统登录名
 */
public class BlogTop {

    /**
     * data : {"curPage":1,"datas":[{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>第一个 API 是：<\/p>\r\n<pre><code>FragmentManager.executePendingTransactions()\r\n<\/code><\/pre><p>第二个 API 是：<\/p>\r\n<pre><code>FragmentTransaction.commitNow();\r\n<\/code><\/pre><p>大家都清楚 Fragment很多 API 都是\u201c异步\u201d的，即并非是立即生效的.<\/p>\r\n<p>那么这两个 API 有点\u201c同步\u201d的感觉。<\/p>\r\n<p>请问：<\/p>\r\n<ol>\r\n<li>这两个 API 有何作用？<\/li>\r\n<li>这两个 API 有啥区别？<\/li>\r\n<li>这两个 API 有什么使用场景么？<\/li>\r\n<\/ol>\r\n<p>一些提示，两个 API 的一个使用场景。<\/p>\r\n<p>你在 LifeCycle 的源码中可以看到：<\/p>\r\n<pre><code>public class ReportFragment extends Fragment {\r\n    private static final String REPORT_FRAGMENT_TAG = &quot;androidx.lifecycle&quot;\r\n            + &quot;.LifecycleDispatcher.report_fragment_tag&quot;;\r\n\r\n    public static void injectIfNeededIn(Activity activity) {\r\n        // ProcessLifecycleOwner should always correctly work and some activities may not extend\r\n        // FragmentActivity from support lib, so we use framework fragments for activities\r\n        android.app.FragmentManager manager = activity.getFragmentManager();\r\n        if (manager.findFragmentByTag(REPORT_FRAGMENT_TAG) == null) {\r\n            manager.beginTransaction().add(new ReportFragment(), REPORT_FRAGMENT_TAG).commit();\r\n            // Hopefully, we are the first to make a transaction.\r\n            manager.executePendingTransactions();\r\n        }\r\n    }\r\n<\/code><\/pre><p>你在 RxPermission 可以看到以下使用：<\/p>\r\n<pre><code>rivate RxPermissionsFragment getRxPermissionsFragment(@NonNull final FragmentManager fragmentManager) {\r\n        RxPermissionsFragment rxPermissionsFragment = findRxPermissionsFragment(fragmentManager);\r\n        boolean isNewInstance = rxPermissionsFragment == null;\r\n        if (isNewInstance) {\r\n            rxPermissionsFragment = new RxPermissionsFragment();\r\n            fragmentManager\r\n                    .beginTransaction()\r\n                    .add(rxPermissionsFragment, TAG)\r\n                    .commitNow();\r\n        }\r\n        return rxPermissionsFragment;\r\n    }\r\n<\/code><\/pre>","descMd":"","envelopePic":"","fresh":false,"id":12229,"link":"https://wanandroid.com/wenda/show/12229","niceDate":"2天前","niceShareDate":"2020-03-07 22:19","origin":"","prefix":"","projectLink":"","publishTime":1583852285000,"selfVisible":0,"shareDate":1583590788000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问  今天考察下 Fragment 相关两个不常见 API","type":1,"userId":2,"visible":1,"zan":1},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>很久以前有Activity.onResume就是界面可见的说法，这种说法毫无疑问是不准确的。<\/p>\r\n<p>问题是：<\/p>\r\n<ol>\r\n<li>Activity.onCreate 和 Activity.onResume，在调用时间上有差别么？可以从Message调度去考虑。<\/li>\r\n<li>有没有一个合理的时机，让我们认为Activity 界面可见了？<\/li>\r\n<\/ol>","descMd":"","envelopePic":"","fresh":false,"id":12175,"link":"https://wanandroid.com/wenda/show/12175","niceDate":"2天前","niceShareDate":"2020-03-03 18:49","origin":"","prefix":"","projectLink":"","publishTime":1583852283000,"selfVisible":0,"shareDate":1583232546000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 | 很久以前有Activity.onResume就是界面可见的说法，这种说法错了多少？","type":1,"userId":2,"visible":1,"zan":11},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>之前我们讨论过 <a href=\"https://wanandroid.com/wenda/show/8488\">View的onAttachedToWindow ,onDetachedFromWindow 调用时机<\/a> 。<\/p>\r\n<p>这个机制在RecyclerView卡片中还适用吗？<\/p>\r\n<p>例如我们在RecyclerView的Item的onBindViewHolder时，利用一个CountDownTimer去做一个倒计时显示 / 或者是有一个属性动画效果？<\/p>\r\n<ol>\r\n<li>到底在什么时候可以cancel掉这个倒计时/ 动画，而不影响功能了（滑动到用户可见范围内，倒计时/动画 运作正常）?<\/li>\r\n<li>有什么方法可以和onBindViewHolder 对应吗？就像onAttachedToWindow ,onDetachedFromWindow这样 。<\/li>\r\n<\/ol>","descMd":"","envelopePic":"","fresh":false,"id":12148,"link":"https://wanandroid.com/wenda/show/12148","niceDate":"2天前","niceShareDate":"2020-03-01 15:14","origin":"","prefix":"","projectLink":"","publishTime":1583845880000,"selfVisible":0,"shareDate":1583046877000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 RecyclerView卡片中持有的资源，到底该什么时候释放？","type":0,"userId":2,"visible":1,"zan":20},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>早上看到事件分发的一个讨论：<\/p>\r\n<p><img src=\"https://wanandroid.com/blogimgs/9bfb6411-6262-4d59-884f-3e868e5493cd.jpg\" alt><\/p>\r\n<p>那么事件到底是先到DecorView还是先到Window(Activity，Dialog)的。<\/p>\r\n<ol>\r\n<li>touch相关事件在DecorView，PhoneWindow，Activity/Dialog之间传递的顺序是什么样子的？<\/li>\r\n<li>为什么要按照1这么设计？<\/li>\r\n<\/ol>","descMd":"","envelopePic":"","fresh":false,"id":12119,"link":"https://wanandroid.com/wenda/show/12119","niceDate":"2020-03-03 23:25","niceShareDate":"2020-02-27 19:07","origin":"","prefix":"","projectLink":"","publishTime":1583249132000,"selfVisible":0,"shareDate":1582801649000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 | 事件到底是先到DecorView还是先到Window的？","type":0,"userId":2,"visible":1,"zan":16},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>这个题目起源于一位同事问我：\u201c怎么优雅的监听双击\u201d这个行为？<\/p>\r\n<p>想到好像一直没看过GestureDetector的源码实现？<\/p>\r\n<p>那么问题就是：<\/p>\r\n<p>GestureDetector关于支持的手势是如何检测的？分析源码哈<\/p>","descMd":"","envelopePic":"","fresh":false,"id":12018,"link":"https://www.wanandroid.com/wenda/show/12018","niceDate":"2020-03-02 23:56","niceShareDate":"2020-02-20 23:50","origin":"","prefix":"","projectLink":"","publishTime":1583164598000,"selfVisible":0,"shareDate":1582213826000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 Android有个GestureDetector很好用？那么你知道它内部是如何实现的吗？","type":0,"userId":2,"visible":1,"zan":9},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>单例的实现有很多种，面对：<\/p>\r\n<p>\u201c枚举底层是如何实现的呢？\u201d<\/p>\r\n<p>如何解答呢？<\/p>\n\n<p>开工大吉，不能再刷微博了，该学习啦！今天正式网站、公众号都开始更新。<\/p>","descMd":"","envelopePic":"","fresh":false,"id":11689,"link":"https://www.wanandroid.com/wenda/show/11689","niceDate":"2020-02-23 22:18","niceShareDate":"2020-02-02 17:21","origin":"","prefix":"","projectLink":"","publishTime":1582467480000,"selfVisible":0,"shareDate":1580635265000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问  很多时候我们说单例实现方式会提到「枚举实现」，那么枚举底层是如何实现的呢？","type":0,"userId":2,"visible":1,"zan":3},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>马上过年啦，每日一问也要停止更新一段时间了，很荣幸我们提出了大概 70 个问题，每个问题都非常值得大家去深入思考，也可以拨正了一些表达不够严谨的观点。<\/p>\r\n<p>过节期间会先专注与问答的编辑功能，文章会不定期更新，因为我有更新文章插件，所以看到好文，点一下就更新了，操作还是比较方便的。<\/p>\r\n<p>这里祝大家新年快乐，我们来年见。<\/p>\r\n<p>当然如果大家有收获，也欢迎大家<a href=\"https://www.wanandroid.com/blog/show/2030\">赞助本站<\/a>，毕竟饭还是要吃的，各位么么哒，来年继续加油。<\/p>","descMd":"","envelopePic":"","fresh":false,"id":11552,"link":"https://www.wanandroid.com/wenda/show/11552","niceDate":"2020-02-02 17:17","niceShareDate":"2020-01-18 12:59","origin":"","prefix":"","projectLink":"","publishTime":1580635056000,"selfVisible":0,"shareDate":1579323552000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问  2019年终致辞 支持编辑啦","type":0,"userId":2,"visible":0,"zan":1},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>经常我们在开发过程中，遇到 UI 滚动失效，宽高获取不到等，有经验的程序员可能会指导你说：<\/p>\r\n<p>你 post 一个 Runnable，在\u201c下一帧\u201d就可以拿到了。<\/p>\r\n<p>很多我们我们一试，果然可以，崇拜之情涌上心头。<\/p>\r\n<p>那么今天我们要问<\/p>\r\n<ol>\r\n<li>handler. postRunnable 和 \u201c下一帧\u201d的说法有关系吗？<\/li>\r\n<li>如果你在一个方法中，for 循环 handler.post 多个 Runnable，如果有问题1 中帧的说法，那么这些 Runnable 执行应该有个固定的间隔，你可以实测一下，有这样一个间隔吗？ 如果没有，为什么？<\/li>\r\n<\/ol>\r\n<p>年前倒计时了~<\/p>","descMd":"","envelopePic":"","fresh":false,"id":11506,"link":"https://www.wanandroid.com/wenda/show/11506","niceDate":"2020-01-20 01:05","niceShareDate":"2020-01-14 23:37","origin":"","prefix":"","projectLink":"","publishTime":1579453533000,"selfVisible":0,"shareDate":1579016234000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问  &ldquo;别慌，你 post 一个 Runnable ，在下一帧就可以拿到了。&rdquo;这种说法对吗？","type":0,"userId":2,"visible":1,"zan":20},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>很多时候，我们核心页面打开速度会成为一项性能指标，这时候你可能会听到老鸟告诉你一个比较屌的方案：<\/p>\r\n<p>View提前在异步线程预加载。<\/p>\r\n<p>具体就是可能在使用之前，在某个时机，在某个子线程中，提前inflate某个布局文件，大家都知道inflate文件需要一个LayoutInflater，中间会使用到一个参数是Context，由于你需要提前预加载，那么被迫就得使用Application作为这个Context，而且在大多时候，确实可行。<\/p>\r\n<p>那么问题来了：<\/p>\r\n<p>使用applicationContext初始化View会有什么潜在的风险吗？或者哪些View的能力会失效？<\/p>","descMd":"","envelopePic":"","fresh":false,"id":11521,"link":"https://www.wanandroid.com/wenda/show/11521","niceDate":"2020-01-20 01:05","niceShareDate":"2020-01-15 16:21","origin":"","prefix":"","projectLink":"","publishTime":1579453529000,"selfVisible":0,"shareDate":1579076500000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问  &ldquo;你这个布局可以在进入这个页面之前预加载，这样页面渲染就快了&rdquo;可能有什么潜在的问题吗？","type":0,"userId":2,"visible":1,"zan":4},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>这个问题其实不算一个太好的问题，但是也能考察事件的分发流程，搞清楚 Window,Activity,DecorView 在事件分发环节的调用流程。<\/p>","descMd":"","envelopePic":"","fresh":false,"id":11363,"link":"https://www.wanandroid.com/wenda/show/11363","niceDate":"2020-01-15 19:24","niceShareDate":"2020-01-04 20:53","origin":"","prefix":"","projectLink":"","publishTime":1579087495000,"selfVisible":0,"shareDate":1578142403000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问  为什么 Dialog 默认弹出后 Activity 就无法响应用户事件了？","type":0,"userId":2,"visible":1,"zan":23},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>今天的问题很有意思，yyyy-MM-dd 与 YYYY-MM-dd 的区别是什么？<\/p>\r\n<p>使用错误会造成什么 bug 吗？<\/p>","descMd":"","envelopePic":"","fresh":false,"id":11387,"link":"https://www.wanandroid.com/wenda/show/11387","niceDate":"2020-01-14 20:33","niceShareDate":"2020-01-07 00:07","origin":"","prefix":"","projectLink":"","publishTime":1579005203000,"selfVisible":0,"shareDate":1578326866000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问  据说很多 app 在 2019 年最后一周都出现了日期上的 bug ?","type":0,"userId":2,"visible":1,"zan":15},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>在 Android 7.0了，引入了「Network Security Configuration」，当时默认配置为信任系统内置证书以及用户安装证书，并且允许访问 HTTP 请求。<\/p>\r\n<p>而在 Android 9.0上，默认只信任系统证书了，并且默认不再允许访问 HTTP 请求，所以在很多适配P文章中，因为无法访问 HTTP 了，无法抓包了，所以我们要引入如下配置：<\/p>\r\n<pre><code>&lt;base-config cleartextTrafficPermitted=&quot;true&quot;&gt; // 允许 http 请求访问\r\n    &lt;trust-anchors&gt;\r\n        &lt;certificates src=&quot;system&quot; /&gt;\r\n                 &lt;certificates src=&quot;user&quot; /&gt; // 信任用户安装证书\r\n    &lt;/trust-anchors&gt;\r\n&lt;/base-config&gt;\r\n<\/code><\/pre><p>当然了，配置还有很多，甚至可以配置自签名的证书。<\/p>\r\n<p>不过我们的问题是：<\/p>\r\n<p>在 P之前，我们其实已经做了一些 https 的安全验证，比如通过 okhttp 的相关配置，设置 https 相关参数。<\/p>\r\n<p>注意问题是：<\/p>\r\n<ol>\r\n<li>现在已经有了「Network Security Configuration」，类似\u201c通过 okhttp 的相关配置，设置 https 相关参数\u201d还需要做吗？<\/li>\r\n<li>如果 1 中我们两种方式都做了，那么系统的验证流程到底是怎么样的？是Network Security Configuration验证一遍，&quot;okhttp&quot;再验证一遍吗？<\/li>\r\n<li>关于「Network Security Configuration」，系统到底是在哪里验证的，比如抛出\u201cHTTP 禁止访问的异常\u201d是在哪？<\/li>\r\n<\/ol>","descMd":"","envelopePic":"","fresh":false,"id":11476,"link":"https://www.wanandroid.com/wenda/show/11476","niceDate":"2020-01-14 20:33","niceShareDate":"2020-01-12 14:52","origin":"","prefix":"","projectLink":"","publishTime":1579005200000,"selfVisible":0,"shareDate":1578811923000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问  系统帮我们做了网络安全校验，那么还需要我们手动去做吗？","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p> 事件分发大家应该都不陌生，陌生的请直接本站搜索关键词学习。<\/p>\r\n<p> 很多时候，我们都会说：<\/p>\r\n<p> \u201c事件分发是针对一次手势的过程，这个手势包含一次 ACTION_DOWN，多次 ACTION_MOVE，和一次 ACTION_UP\u201d，在 ACTION_DOWN 的时候来决定 TargetView，即决定了这次事件分发的事件流向。<\/p>\r\n<p> 今天的问题是：<\/p>\r\n<ol>\r\n<li>在一次事件分发中有可能有多次 ACTION_POINT_DOWN 吗？<\/li>\r\n<li>在一次事件分发中有可能有多次 ACTION_DOWN 吗？<\/li>\r\n<li>如果 2 成立，是在什么样的场景下会出现？<\/li>\r\n<li>基于 3 的场景，我们可能在编写有交互的自定义 View的时候有哪些地方需要注意？<\/li>\r\n<\/ol>\r\n<p>给个测试 Demo: FrameLayout 里面放两个自定义的 Button，复写事件分发相关方法，然后第一个手指触摸Button1，第一个手指不抬起的情况下，第二个手指触摸 Button2，观察日志输出。<\/p>","descMd":"","envelopePic":"","fresh":false,"id":11287,"link":"https://www.wanandroid.com/wenda/show/11287","niceDate":"2020-01-07 00:08","niceShareDate":"2019-12-29 23:47","origin":"","prefix":"","projectLink":"","publishTime":1578326891000,"selfVisible":0,"shareDate":1577634454000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 很多书籍上写：&ldquo;事件分发只有一次 ACTION_DOWN，一次 ACTION_UP&rdquo;严谨吗？","type":0,"userId":2,"visible":1,"zan":42},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>考虑一个场景 ViewPager 嵌套 ViewPager，不做任何处理的情况下，正常滑动非边界区域，默认会滑动内层 ViewPager。<\/p>\r\n<p>那么问题来了，讲道理事件分发会先走「外层 ViewPager」 的 onInterceptTouchEvent，内外都是 ViewPager，代码都一样。<\/p>\r\n<p>怎么事件没有被「外层 ViewPager」拦截掉，反而交给了「内层 ViewPager」呢？<\/p>\r\n","descMd":"","envelopePic":"","fresh":false,"id":11159,"link":"https://www.wanandroid.com/wenda/show/11159","niceDate":"2019-12-29 23:52","niceShareDate":"2019-12-23 23:19","origin":"","prefix":"","projectLink":"","publishTime":1577634766000,"selfVisible":0,"shareDate":1577114362000,"shareUser":"鸿洋","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 ViewPager 嵌套，&ldquo;老子&rdquo;怎么就没拦住你？","type":0,"userId":2,"visible":1,"zan":14},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>在上一问，我们问了：<\/p>\r\n<p>假设我这个 Activity 内部有一个异步线程正在下载东西，并不支持暂停恢复，断开就需要重新下载，但是 Activity 本身支持横竖屏切换显示。<\/p>\r\n<p>在 Activity 旋转重建的前提下，如果让这个异步线程继续下载，不会受到牵连呢？<\/p>\r\n<p>有同学回答使用：<\/p>\r\n<pre><code>Fragment.setRetainInstance(true)\r\n<\/code><\/pre><p>好了，那么问题来了：<\/p>\r\n<ol>\r\n<li>设置了setRetainInstance的 Fragment，当 Activity 发生旋转重建时，Fragment 对象会发生变化吗？<\/li>\r\n<li>如果不会，Activity 都销毁重建了，Fragment 怎么活下来的？<\/li>\r\n<li>如果活下来，那么肯定脱离于 Activity 存储在某个声明生命周期更长的对象中，具体的源码是如何实现的？ <\/li>\r\n<\/ol>","descMd":"","envelopePic":"","fresh":false,"id":11077,"link":"https://www.wanandroid.com/wenda/show/11077","niceDate":"2019-12-23 23:19","niceShareDate":"2019-12-20 00:08","origin":"","prefix":"","projectLink":"","publishTime":1577114379000,"selfVisible":0,"shareDate":1576771725000,"shareUser":"鸿洋","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问  Activity 都重建了，你 Fragment凭什么活着？","type":0,"userId":2,"visible":1,"zan":27},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>众所周知，Activity 旋转会造成 Activity 重建，非常多的 View 等状态都需要恢复。<\/p>\r\n<p>现在有一个问题：<\/p>\r\n<p>假设我这个 Activity 内部有一个异步线程正在下载东西，并不支持暂停恢复，断开就需要重新下载，但是 Activity 本身支持横竖屏切换显示。<\/p>\r\n<p>在 <strong>Activity 旋转重建<\/strong>的前提下，如果让这个异步线程继续下载，不会受到牵连呢？<\/p>","descMd":"","envelopePic":"","fresh":false,"id":10892,"link":"https://www.wanandroid.com/wenda/show/10892","niceDate":"2019-12-20 00:08","niceShareDate":"2019-12-16 00:01","origin":"","prefix":"","projectLink":"","publishTime":1576771735000,"selfVisible":0,"shareDate":1576425697000,"shareUser":"鸿洋","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 |  Activity 旋转啦，重新下载怪我咯？","type":0,"userId":2,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>很多时候，我们为了保证项目中线程数量不会乱飙升，不好管理，我们会使用线程池，保证线程在我们的管理之下。<\/p>\r\n<p>我们也经常说：使用线程池复用线程。<\/p>\r\n<p>那么问题是：<\/p>\r\n<ol>\r\n<li>线程池中的线程是如何复用的？是执行完成后销毁，再新建几个放那；还是始终是那几个线程（针对 coreSize 线程）。<\/li>\r\n<li>问题 1 的结论具体实现细节（说清楚流程即可）？<\/li>\r\n<\/ol>","descMd":"","envelopePic":"","fresh":false,"id":10811,"link":"https://www.wanandroid.com/wenda/show/10811","niceDate":"2019-12-15 23:55","niceShareDate":"2019-12-12 00:39","origin":"","prefix":"","projectLink":"","publishTime":1576425338000,"selfVisible":0,"shareDate":1576082391000,"shareUser":"鸿洋","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问  | 线程池中的线程是如何复用的？","type":0,"userId":2,"visible":1,"zan":13},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>技术的演进都是有原因的，带着好奇的思路，所以今天的问题是：<\/p>\r\n<ol>\r\n<li>Android v1 v2 v3 签名机制是什么样子的，或者说各自是如何保证 apk 的防篡改的？<\/li>\r\n<li>v1 -&gt; v2 -&gt; v3 主要是为了解决什么问题，或者带来了什么好处？<\/li>\r\n<li>对于快速的多渠道打包，针对 v1,v2,v3 都可以怎么做，有哪些开源库可以考虑？<\/li>\r\n<\/ol>","descMd":"","envelopePic":"","fresh":false,"id":10669,"link":"https://www.wanandroid.com/wenda/show/10669","niceDate":"2019-12-09 23:52","niceShareDate":"2019-12-04 00:17","origin":"","prefix":"","projectLink":"","publishTime":1575906771000,"selfVisible":0,"shareDate":1575389866000,"shareUser":"鸿洋","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 Android 签名机制 v1 v2 v3 ， 卧槽都 v3 了？","type":0,"userId":2,"visible":1,"zan":9},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>上周几个小伙伴聊到一个比较有意思的问题，大家都知道浮点数相加，会丢失精度：<\/p>\r\n<p>看这个例子：<\/p>\r\n<pre><code>    public static void main(String[] args){\r\n        System.out.println(0.3f + 0.6f);\r\n        System.out.println(0.3 + 0.6);\r\n        System.out.println(0.9);\r\n    }\r\n<\/code><\/pre><pre><code>输出:\r\n\r\n0.90000004\r\n0.8999999999999999\r\n0.9\r\n<\/code><\/pre><p>问题是：<\/p>\r\n<p>精度为什么会丢失，计算机能存那么多数字，一个0.3+0.6怎么就丢精度了呢？<\/p>\r\n<p>附加题：为何 float 和 double 的计算输出结果差异还挺大的呢？<\/p>\r\n<blockquote>\r\n<p>jdk 1.8.0<\/p>\r\n<\/blockquote>","descMd":"","envelopePic":"","fresh":false,"id":10574,"link":"https://www.wanandroid.com/wenda/show/10574","niceDate":"2019-12-04 00:18","niceShareDate":"2019-11-30 19:27","origin":"","prefix":"","projectLink":"","publishTime":1575389887000,"selfVisible":0,"shareDate":1575113261000,"shareUser":"鸿洋","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问  精度到底是哪里丢失了？","type":0,"userId":2,"visible":1,"zan":17},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>RT，挺有意思的问题，为什么呢？<\/p>\r\n\r\n<p>这是星球里面一位朋友的提问，<a style=\"font-size:14px;\" href=\"https://wanandroid.com/blog/show/2701\">想加入可以点这里<\/a>。<\/p>\r\n","descMd":"","envelopePic":"","fresh":false,"id":10482,"link":"https://www.wanandroid.com/wenda/show/10482","niceDate":"2019-11-30 20:49","niceShareDate":"2019-11-26 00:10","origin":"","prefix":"","projectLink":"","publishTime":1575118168000,"selfVisible":0,"shareDate":1574698219000,"shareUser":"鸿洋","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 | Activity启动流程中，大部分都是用Binder通讯，为啥跟Zygote通信的时候要用socket呢？","type":0,"userId":2,"visible":1,"zan":19},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>很多时候，大家在讲解butterknife原理的时候，很多时候会跟别的 ioc 库做对比，会说：<\/p>\r\n<p>\u201cbutterknife性能更好，基于编译时注解，不需要反射\u201d<\/p>\r\n<p>那么，今天的问题是：<\/p>\r\n<ol>\r\n<li>butterknife 的原理是？<\/li>\r\n<li>butterknife 中有用到反射吗？<\/li>\r\n<li>如果用到，在哪里用到？<\/li>\r\n<\/ol>","descMd":"","envelopePic":"","fresh":false,"id":10427,"link":"https://www.wanandroid.com/wenda/show/10427","niceDate":"2019-11-26 00:12","niceShareDate":"2019-11-22 00:09","origin":"","prefix":"","projectLink":"","publishTime":1574698321000,"selfVisible":0,"shareDate":1574352578000,"shareUser":"鸿洋","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 | butterknife 中真的没有反射吗？","type":0,"userId":2,"visible":1,"zan":25},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>如题，在 Kotlin 中，基本上不需要用到\u201c；\u201d，哪个场景下必须要用\u201c；\u201d，为什么？<\/p>","descMd":"","envelopePic":"","fresh":false,"id":10243,"link":"https://wanandroid.com/wenda/show/10243","niceDate":"2019-11-22 00:12","niceShareDate":"2019-11-13 01:03","origin":"","prefix":"","projectLink":"","publishTime":1574352765000,"selfVisible":0,"shareDate":1573578224000,"shareUser":"鸿洋","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 | Kotlin 中不需要写&ldquo; ; &rdquo;，但是有个场景意外？","type":0,"userId":2,"visible":1,"zan":17}],"offset":0,"over":false,"pageCount":4,"size":22,"total":82}
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

    public static class DataBean {
        /**
         * curPage : 1
         * datas : [{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>第一个 API 是：<\/p>\r\n<pre><code>FragmentManager.executePendingTransactions()\r\n<\/code><\/pre><p>第二个 API 是：<\/p>\r\n<pre><code>FragmentTransaction.commitNow();\r\n<\/code><\/pre><p>大家都清楚 Fragment很多 API 都是\u201c异步\u201d的，即并非是立即生效的.<\/p>\r\n<p>那么这两个 API 有点\u201c同步\u201d的感觉。<\/p>\r\n<p>请问：<\/p>\r\n<ol>\r\n<li>这两个 API 有何作用？<\/li>\r\n<li>这两个 API 有啥区别？<\/li>\r\n<li>这两个 API 有什么使用场景么？<\/li>\r\n<\/ol>\r\n<p>一些提示，两个 API 的一个使用场景。<\/p>\r\n<p>你在 LifeCycle 的源码中可以看到：<\/p>\r\n<pre><code>public class ReportFragment extends Fragment {\r\n    private static final String REPORT_FRAGMENT_TAG = &quot;androidx.lifecycle&quot;\r\n            + &quot;.LifecycleDispatcher.report_fragment_tag&quot;;\r\n\r\n    public static void injectIfNeededIn(Activity activity) {\r\n        // ProcessLifecycleOwner should always correctly work and some activities may not extend\r\n        // FragmentActivity from support lib, so we use framework fragments for activities\r\n        android.app.FragmentManager manager = activity.getFragmentManager();\r\n        if (manager.findFragmentByTag(REPORT_FRAGMENT_TAG) == null) {\r\n            manager.beginTransaction().add(new ReportFragment(), REPORT_FRAGMENT_TAG).commit();\r\n            // Hopefully, we are the first to make a transaction.\r\n            manager.executePendingTransactions();\r\n        }\r\n    }\r\n<\/code><\/pre><p>你在 RxPermission 可以看到以下使用：<\/p>\r\n<pre><code>rivate RxPermissionsFragment getRxPermissionsFragment(@NonNull final FragmentManager fragmentManager) {\r\n        RxPermissionsFragment rxPermissionsFragment = findRxPermissionsFragment(fragmentManager);\r\n        boolean isNewInstance = rxPermissionsFragment == null;\r\n        if (isNewInstance) {\r\n            rxPermissionsFragment = new RxPermissionsFragment();\r\n            fragmentManager\r\n                    .beginTransaction()\r\n                    .add(rxPermissionsFragment, TAG)\r\n                    .commitNow();\r\n        }\r\n        return rxPermissionsFragment;\r\n    }\r\n<\/code><\/pre>","descMd":"","envelopePic":"","fresh":false,"id":12229,"link":"https://wanandroid.com/wenda/show/12229","niceDate":"2天前","niceShareDate":"2020-03-07 22:19","origin":"","prefix":"","projectLink":"","publishTime":1583852285000,"selfVisible":0,"shareDate":1583590788000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问  今天考察下 Fragment 相关两个不常见 API","type":1,"userId":2,"visible":1,"zan":1},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>很久以前有Activity.onResume就是界面可见的说法，这种说法毫无疑问是不准确的。<\/p>\r\n<p>问题是：<\/p>\r\n<ol>\r\n<li>Activity.onCreate 和 Activity.onResume，在调用时间上有差别么？可以从Message调度去考虑。<\/li>\r\n<li>有没有一个合理的时机，让我们认为Activity 界面可见了？<\/li>\r\n<\/ol>","descMd":"","envelopePic":"","fresh":false,"id":12175,"link":"https://wanandroid.com/wenda/show/12175","niceDate":"2天前","niceShareDate":"2020-03-03 18:49","origin":"","prefix":"","projectLink":"","publishTime":1583852283000,"selfVisible":0,"shareDate":1583232546000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 | 很久以前有Activity.onResume就是界面可见的说法，这种说法错了多少？","type":1,"userId":2,"visible":1,"zan":11},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>之前我们讨论过 <a href=\"https://wanandroid.com/wenda/show/8488\">View的onAttachedToWindow ,onDetachedFromWindow 调用时机<\/a> 。<\/p>\r\n<p>这个机制在RecyclerView卡片中还适用吗？<\/p>\r\n<p>例如我们在RecyclerView的Item的onBindViewHolder时，利用一个CountDownTimer去做一个倒计时显示 / 或者是有一个属性动画效果？<\/p>\r\n<ol>\r\n<li>到底在什么时候可以cancel掉这个倒计时/ 动画，而不影响功能了（滑动到用户可见范围内，倒计时/动画 运作正常）?<\/li>\r\n<li>有什么方法可以和onBindViewHolder 对应吗？就像onAttachedToWindow ,onDetachedFromWindow这样 。<\/li>\r\n<\/ol>","descMd":"","envelopePic":"","fresh":false,"id":12148,"link":"https://wanandroid.com/wenda/show/12148","niceDate":"2天前","niceShareDate":"2020-03-01 15:14","origin":"","prefix":"","projectLink":"","publishTime":1583845880000,"selfVisible":0,"shareDate":1583046877000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 RecyclerView卡片中持有的资源，到底该什么时候释放？","type":0,"userId":2,"visible":1,"zan":20},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>早上看到事件分发的一个讨论：<\/p>\r\n<p><img src=\"https://wanandroid.com/blogimgs/9bfb6411-6262-4d59-884f-3e868e5493cd.jpg\" alt><\/p>\r\n<p>那么事件到底是先到DecorView还是先到Window(Activity，Dialog)的。<\/p>\r\n<ol>\r\n<li>touch相关事件在DecorView，PhoneWindow，Activity/Dialog之间传递的顺序是什么样子的？<\/li>\r\n<li>为什么要按照1这么设计？<\/li>\r\n<\/ol>","descMd":"","envelopePic":"","fresh":false,"id":12119,"link":"https://wanandroid.com/wenda/show/12119","niceDate":"2020-03-03 23:25","niceShareDate":"2020-02-27 19:07","origin":"","prefix":"","projectLink":"","publishTime":1583249132000,"selfVisible":0,"shareDate":1582801649000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 | 事件到底是先到DecorView还是先到Window的？","type":0,"userId":2,"visible":1,"zan":16},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>这个题目起源于一位同事问我：\u201c怎么优雅的监听双击\u201d这个行为？<\/p>\r\n<p>想到好像一直没看过GestureDetector的源码实现？<\/p>\r\n<p>那么问题就是：<\/p>\r\n<p>GestureDetector关于支持的手势是如何检测的？分析源码哈<\/p>","descMd":"","envelopePic":"","fresh":false,"id":12018,"link":"https://www.wanandroid.com/wenda/show/12018","niceDate":"2020-03-02 23:56","niceShareDate":"2020-02-20 23:50","origin":"","prefix":"","projectLink":"","publishTime":1583164598000,"selfVisible":0,"shareDate":1582213826000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 Android有个GestureDetector很好用？那么你知道它内部是如何实现的吗？","type":0,"userId":2,"visible":1,"zan":9},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>单例的实现有很多种，面对：<\/p>\r\n<p>\u201c枚举底层是如何实现的呢？\u201d<\/p>\r\n<p>如何解答呢？<\/p>\n\n<p>开工大吉，不能再刷微博了，该学习啦！今天正式网站、公众号都开始更新。<\/p>","descMd":"","envelopePic":"","fresh":false,"id":11689,"link":"https://www.wanandroid.com/wenda/show/11689","niceDate":"2020-02-23 22:18","niceShareDate":"2020-02-02 17:21","origin":"","prefix":"","projectLink":"","publishTime":1582467480000,"selfVisible":0,"shareDate":1580635265000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问  很多时候我们说单例实现方式会提到「枚举实现」，那么枚举底层是如何实现的呢？","type":0,"userId":2,"visible":1,"zan":3},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>马上过年啦，每日一问也要停止更新一段时间了，很荣幸我们提出了大概 70 个问题，每个问题都非常值得大家去深入思考，也可以拨正了一些表达不够严谨的观点。<\/p>\r\n<p>过节期间会先专注与问答的编辑功能，文章会不定期更新，因为我有更新文章插件，所以看到好文，点一下就更新了，操作还是比较方便的。<\/p>\r\n<p>这里祝大家新年快乐，我们来年见。<\/p>\r\n<p>当然如果大家有收获，也欢迎大家<a href=\"https://www.wanandroid.com/blog/show/2030\">赞助本站<\/a>，毕竟饭还是要吃的，各位么么哒，来年继续加油。<\/p>","descMd":"","envelopePic":"","fresh":false,"id":11552,"link":"https://www.wanandroid.com/wenda/show/11552","niceDate":"2020-02-02 17:17","niceShareDate":"2020-01-18 12:59","origin":"","prefix":"","projectLink":"","publishTime":1580635056000,"selfVisible":0,"shareDate":1579323552000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问  2019年终致辞 支持编辑啦","type":0,"userId":2,"visible":0,"zan":1},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>经常我们在开发过程中，遇到 UI 滚动失效，宽高获取不到等，有经验的程序员可能会指导你说：<\/p>\r\n<p>你 post 一个 Runnable，在\u201c下一帧\u201d就可以拿到了。<\/p>\r\n<p>很多我们我们一试，果然可以，崇拜之情涌上心头。<\/p>\r\n<p>那么今天我们要问<\/p>\r\n<ol>\r\n<li>handler. postRunnable 和 \u201c下一帧\u201d的说法有关系吗？<\/li>\r\n<li>如果你在一个方法中，for 循环 handler.post 多个 Runnable，如果有问题1 中帧的说法，那么这些 Runnable 执行应该有个固定的间隔，你可以实测一下，有这样一个间隔吗？ 如果没有，为什么？<\/li>\r\n<\/ol>\r\n<p>年前倒计时了~<\/p>","descMd":"","envelopePic":"","fresh":false,"id":11506,"link":"https://www.wanandroid.com/wenda/show/11506","niceDate":"2020-01-20 01:05","niceShareDate":"2020-01-14 23:37","origin":"","prefix":"","projectLink":"","publishTime":1579453533000,"selfVisible":0,"shareDate":1579016234000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问  &ldquo;别慌，你 post 一个 Runnable ，在下一帧就可以拿到了。&rdquo;这种说法对吗？","type":0,"userId":2,"visible":1,"zan":20},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>很多时候，我们核心页面打开速度会成为一项性能指标，这时候你可能会听到老鸟告诉你一个比较屌的方案：<\/p>\r\n<p>View提前在异步线程预加载。<\/p>\r\n<p>具体就是可能在使用之前，在某个时机，在某个子线程中，提前inflate某个布局文件，大家都知道inflate文件需要一个LayoutInflater，中间会使用到一个参数是Context，由于你需要提前预加载，那么被迫就得使用Application作为这个Context，而且在大多时候，确实可行。<\/p>\r\n<p>那么问题来了：<\/p>\r\n<p>使用applicationContext初始化View会有什么潜在的风险吗？或者哪些View的能力会失效？<\/p>","descMd":"","envelopePic":"","fresh":false,"id":11521,"link":"https://www.wanandroid.com/wenda/show/11521","niceDate":"2020-01-20 01:05","niceShareDate":"2020-01-15 16:21","origin":"","prefix":"","projectLink":"","publishTime":1579453529000,"selfVisible":0,"shareDate":1579076500000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问  &ldquo;你这个布局可以在进入这个页面之前预加载，这样页面渲染就快了&rdquo;可能有什么潜在的问题吗？","type":0,"userId":2,"visible":1,"zan":4},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>这个问题其实不算一个太好的问题，但是也能考察事件的分发流程，搞清楚 Window,Activity,DecorView 在事件分发环节的调用流程。<\/p>","descMd":"","envelopePic":"","fresh":false,"id":11363,"link":"https://www.wanandroid.com/wenda/show/11363","niceDate":"2020-01-15 19:24","niceShareDate":"2020-01-04 20:53","origin":"","prefix":"","projectLink":"","publishTime":1579087495000,"selfVisible":0,"shareDate":1578142403000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问  为什么 Dialog 默认弹出后 Activity 就无法响应用户事件了？","type":0,"userId":2,"visible":1,"zan":23},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>今天的问题很有意思，yyyy-MM-dd 与 YYYY-MM-dd 的区别是什么？<\/p>\r\n<p>使用错误会造成什么 bug 吗？<\/p>","descMd":"","envelopePic":"","fresh":false,"id":11387,"link":"https://www.wanandroid.com/wenda/show/11387","niceDate":"2020-01-14 20:33","niceShareDate":"2020-01-07 00:07","origin":"","prefix":"","projectLink":"","publishTime":1579005203000,"selfVisible":0,"shareDate":1578326866000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问  据说很多 app 在 2019 年最后一周都出现了日期上的 bug ?","type":0,"userId":2,"visible":1,"zan":15},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>在 Android 7.0了，引入了「Network Security Configuration」，当时默认配置为信任系统内置证书以及用户安装证书，并且允许访问 HTTP 请求。<\/p>\r\n<p>而在 Android 9.0上，默认只信任系统证书了，并且默认不再允许访问 HTTP 请求，所以在很多适配P文章中，因为无法访问 HTTP 了，无法抓包了，所以我们要引入如下配置：<\/p>\r\n<pre><code>&lt;base-config cleartextTrafficPermitted=&quot;true&quot;&gt; // 允许 http 请求访问\r\n    &lt;trust-anchors&gt;\r\n        &lt;certificates src=&quot;system&quot; /&gt;\r\n                 &lt;certificates src=&quot;user&quot; /&gt; // 信任用户安装证书\r\n    &lt;/trust-anchors&gt;\r\n&lt;/base-config&gt;\r\n<\/code><\/pre><p>当然了，配置还有很多，甚至可以配置自签名的证书。<\/p>\r\n<p>不过我们的问题是：<\/p>\r\n<p>在 P之前，我们其实已经做了一些 https 的安全验证，比如通过 okhttp 的相关配置，设置 https 相关参数。<\/p>\r\n<p>注意问题是：<\/p>\r\n<ol>\r\n<li>现在已经有了「Network Security Configuration」，类似\u201c通过 okhttp 的相关配置，设置 https 相关参数\u201d还需要做吗？<\/li>\r\n<li>如果 1 中我们两种方式都做了，那么系统的验证流程到底是怎么样的？是Network Security Configuration验证一遍，&quot;okhttp&quot;再验证一遍吗？<\/li>\r\n<li>关于「Network Security Configuration」，系统到底是在哪里验证的，比如抛出\u201cHTTP 禁止访问的异常\u201d是在哪？<\/li>\r\n<\/ol>","descMd":"","envelopePic":"","fresh":false,"id":11476,"link":"https://www.wanandroid.com/wenda/show/11476","niceDate":"2020-01-14 20:33","niceShareDate":"2020-01-12 14:52","origin":"","prefix":"","projectLink":"","publishTime":1579005200000,"selfVisible":0,"shareDate":1578811923000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问  系统帮我们做了网络安全校验，那么还需要我们手动去做吗？","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p> 事件分发大家应该都不陌生，陌生的请直接本站搜索关键词学习。<\/p>\r\n<p> 很多时候，我们都会说：<\/p>\r\n<p> \u201c事件分发是针对一次手势的过程，这个手势包含一次 ACTION_DOWN，多次 ACTION_MOVE，和一次 ACTION_UP\u201d，在 ACTION_DOWN 的时候来决定 TargetView，即决定了这次事件分发的事件流向。<\/p>\r\n<p> 今天的问题是：<\/p>\r\n<ol>\r\n<li>在一次事件分发中有可能有多次 ACTION_POINT_DOWN 吗？<\/li>\r\n<li>在一次事件分发中有可能有多次 ACTION_DOWN 吗？<\/li>\r\n<li>如果 2 成立，是在什么样的场景下会出现？<\/li>\r\n<li>基于 3 的场景，我们可能在编写有交互的自定义 View的时候有哪些地方需要注意？<\/li>\r\n<\/ol>\r\n<p>给个测试 Demo: FrameLayout 里面放两个自定义的 Button，复写事件分发相关方法，然后第一个手指触摸Button1，第一个手指不抬起的情况下，第二个手指触摸 Button2，观察日志输出。<\/p>","descMd":"","envelopePic":"","fresh":false,"id":11287,"link":"https://www.wanandroid.com/wenda/show/11287","niceDate":"2020-01-07 00:08","niceShareDate":"2019-12-29 23:47","origin":"","prefix":"","projectLink":"","publishTime":1578326891000,"selfVisible":0,"shareDate":1577634454000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 很多书籍上写：&ldquo;事件分发只有一次 ACTION_DOWN，一次 ACTION_UP&rdquo;严谨吗？","type":0,"userId":2,"visible":1,"zan":42},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>考虑一个场景 ViewPager 嵌套 ViewPager，不做任何处理的情况下，正常滑动非边界区域，默认会滑动内层 ViewPager。<\/p>\r\n<p>那么问题来了，讲道理事件分发会先走「外层 ViewPager」 的 onInterceptTouchEvent，内外都是 ViewPager，代码都一样。<\/p>\r\n<p>怎么事件没有被「外层 ViewPager」拦截掉，反而交给了「内层 ViewPager」呢？<\/p>\r\n","descMd":"","envelopePic":"","fresh":false,"id":11159,"link":"https://www.wanandroid.com/wenda/show/11159","niceDate":"2019-12-29 23:52","niceShareDate":"2019-12-23 23:19","origin":"","prefix":"","projectLink":"","publishTime":1577634766000,"selfVisible":0,"shareDate":1577114362000,"shareUser":"鸿洋","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 ViewPager 嵌套，&ldquo;老子&rdquo;怎么就没拦住你？","type":0,"userId":2,"visible":1,"zan":14},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>在上一问，我们问了：<\/p>\r\n<p>假设我这个 Activity 内部有一个异步线程正在下载东西，并不支持暂停恢复，断开就需要重新下载，但是 Activity 本身支持横竖屏切换显示。<\/p>\r\n<p>在 Activity 旋转重建的前提下，如果让这个异步线程继续下载，不会受到牵连呢？<\/p>\r\n<p>有同学回答使用：<\/p>\r\n<pre><code>Fragment.setRetainInstance(true)\r\n<\/code><\/pre><p>好了，那么问题来了：<\/p>\r\n<ol>\r\n<li>设置了setRetainInstance的 Fragment，当 Activity 发生旋转重建时，Fragment 对象会发生变化吗？<\/li>\r\n<li>如果不会，Activity 都销毁重建了，Fragment 怎么活下来的？<\/li>\r\n<li>如果活下来，那么肯定脱离于 Activity 存储在某个声明生命周期更长的对象中，具体的源码是如何实现的？ <\/li>\r\n<\/ol>","descMd":"","envelopePic":"","fresh":false,"id":11077,"link":"https://www.wanandroid.com/wenda/show/11077","niceDate":"2019-12-23 23:19","niceShareDate":"2019-12-20 00:08","origin":"","prefix":"","projectLink":"","publishTime":1577114379000,"selfVisible":0,"shareDate":1576771725000,"shareUser":"鸿洋","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问  Activity 都重建了，你 Fragment凭什么活着？","type":0,"userId":2,"visible":1,"zan":27},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>众所周知，Activity 旋转会造成 Activity 重建，非常多的 View 等状态都需要恢复。<\/p>\r\n<p>现在有一个问题：<\/p>\r\n<p>假设我这个 Activity 内部有一个异步线程正在下载东西，并不支持暂停恢复，断开就需要重新下载，但是 Activity 本身支持横竖屏切换显示。<\/p>\r\n<p>在 <strong>Activity 旋转重建<\/strong>的前提下，如果让这个异步线程继续下载，不会受到牵连呢？<\/p>","descMd":"","envelopePic":"","fresh":false,"id":10892,"link":"https://www.wanandroid.com/wenda/show/10892","niceDate":"2019-12-20 00:08","niceShareDate":"2019-12-16 00:01","origin":"","prefix":"","projectLink":"","publishTime":1576771735000,"selfVisible":0,"shareDate":1576425697000,"shareUser":"鸿洋","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 |  Activity 旋转啦，重新下载怪我咯？","type":0,"userId":2,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>很多时候，我们为了保证项目中线程数量不会乱飙升，不好管理，我们会使用线程池，保证线程在我们的管理之下。<\/p>\r\n<p>我们也经常说：使用线程池复用线程。<\/p>\r\n<p>那么问题是：<\/p>\r\n<ol>\r\n<li>线程池中的线程是如何复用的？是执行完成后销毁，再新建几个放那；还是始终是那几个线程（针对 coreSize 线程）。<\/li>\r\n<li>问题 1 的结论具体实现细节（说清楚流程即可）？<\/li>\r\n<\/ol>","descMd":"","envelopePic":"","fresh":false,"id":10811,"link":"https://www.wanandroid.com/wenda/show/10811","niceDate":"2019-12-15 23:55","niceShareDate":"2019-12-12 00:39","origin":"","prefix":"","projectLink":"","publishTime":1576425338000,"selfVisible":0,"shareDate":1576082391000,"shareUser":"鸿洋","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问  | 线程池中的线程是如何复用的？","type":0,"userId":2,"visible":1,"zan":13},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>技术的演进都是有原因的，带着好奇的思路，所以今天的问题是：<\/p>\r\n<ol>\r\n<li>Android v1 v2 v3 签名机制是什么样子的，或者说各自是如何保证 apk 的防篡改的？<\/li>\r\n<li>v1 -&gt; v2 -&gt; v3 主要是为了解决什么问题，或者带来了什么好处？<\/li>\r\n<li>对于快速的多渠道打包，针对 v1,v2,v3 都可以怎么做，有哪些开源库可以考虑？<\/li>\r\n<\/ol>","descMd":"","envelopePic":"","fresh":false,"id":10669,"link":"https://www.wanandroid.com/wenda/show/10669","niceDate":"2019-12-09 23:52","niceShareDate":"2019-12-04 00:17","origin":"","prefix":"","projectLink":"","publishTime":1575906771000,"selfVisible":0,"shareDate":1575389866000,"shareUser":"鸿洋","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 Android 签名机制 v1 v2 v3 ， 卧槽都 v3 了？","type":0,"userId":2,"visible":1,"zan":9},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>上周几个小伙伴聊到一个比较有意思的问题，大家都知道浮点数相加，会丢失精度：<\/p>\r\n<p>看这个例子：<\/p>\r\n<pre><code>    public static void main(String[] args){\r\n        System.out.println(0.3f + 0.6f);\r\n        System.out.println(0.3 + 0.6);\r\n        System.out.println(0.9);\r\n    }\r\n<\/code><\/pre><pre><code>输出:\r\n\r\n0.90000004\r\n0.8999999999999999\r\n0.9\r\n<\/code><\/pre><p>问题是：<\/p>\r\n<p>精度为什么会丢失，计算机能存那么多数字，一个0.3+0.6怎么就丢精度了呢？<\/p>\r\n<p>附加题：为何 float 和 double 的计算输出结果差异还挺大的呢？<\/p>\r\n<blockquote>\r\n<p>jdk 1.8.0<\/p>\r\n<\/blockquote>","descMd":"","envelopePic":"","fresh":false,"id":10574,"link":"https://www.wanandroid.com/wenda/show/10574","niceDate":"2019-12-04 00:18","niceShareDate":"2019-11-30 19:27","origin":"","prefix":"","projectLink":"","publishTime":1575389887000,"selfVisible":0,"shareDate":1575113261000,"shareUser":"鸿洋","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问  精度到底是哪里丢失了？","type":0,"userId":2,"visible":1,"zan":17},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>RT，挺有意思的问题，为什么呢？<\/p>\r\n\r\n<p>这是星球里面一位朋友的提问，<a style=\"font-size:14px;\" href=\"https://wanandroid.com/blog/show/2701\">想加入可以点这里<\/a>。<\/p>\r\n","descMd":"","envelopePic":"","fresh":false,"id":10482,"link":"https://www.wanandroid.com/wenda/show/10482","niceDate":"2019-11-30 20:49","niceShareDate":"2019-11-26 00:10","origin":"","prefix":"","projectLink":"","publishTime":1575118168000,"selfVisible":0,"shareDate":1574698219000,"shareUser":"鸿洋","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 | Activity启动流程中，大部分都是用Binder通讯，为啥跟Zygote通信的时候要用socket呢？","type":0,"userId":2,"visible":1,"zan":19},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>很多时候，大家在讲解butterknife原理的时候，很多时候会跟别的 ioc 库做对比，会说：<\/p>\r\n<p>\u201cbutterknife性能更好，基于编译时注解，不需要反射\u201d<\/p>\r\n<p>那么，今天的问题是：<\/p>\r\n<ol>\r\n<li>butterknife 的原理是？<\/li>\r\n<li>butterknife 中有用到反射吗？<\/li>\r\n<li>如果用到，在哪里用到？<\/li>\r\n<\/ol>","descMd":"","envelopePic":"","fresh":false,"id":10427,"link":"https://www.wanandroid.com/wenda/show/10427","niceDate":"2019-11-26 00:12","niceShareDate":"2019-11-22 00:09","origin":"","prefix":"","projectLink":"","publishTime":1574698321000,"selfVisible":0,"shareDate":1574352578000,"shareUser":"鸿洋","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 | butterknife 中真的没有反射吗？","type":0,"userId":2,"visible":1,"zan":25},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>如题，在 Kotlin 中，基本上不需要用到\u201c；\u201d，哪个场景下必须要用\u201c；\u201d，为什么？<\/p>","descMd":"","envelopePic":"","fresh":false,"id":10243,"link":"https://wanandroid.com/wenda/show/10243","niceDate":"2019-11-22 00:12","niceShareDate":"2019-11-13 01:03","origin":"","prefix":"","projectLink":"","publishTime":1574352765000,"selfVisible":0,"shareDate":1573578224000,"shareUser":"鸿洋","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 | Kotlin 中不需要写&ldquo; ; &rdquo;，但是有个场景意外？","type":0,"userId":2,"visible":1,"zan":17}]
         * offset : 0
         * over : false
         * pageCount : 4
         * size : 22
         * total : 82
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
             * author : xiaoyang
             * canEdit : false
             * chapterId : 440
             * chapterName : 官方
             * collect : false
             * courseId : 13
             * desc : <p>第一个 API 是：</p>
             <pre><code>FragmentManager.executePendingTransactions()
             </code></pre><p>第二个 API 是：</p>
             <pre><code>FragmentTransaction.commitNow();
             </code></pre><p>大家都清楚 Fragment很多 API 都是“异步”的，即并非是立即生效的.</p>
             <p>那么这两个 API 有点“同步”的感觉。</p>
             <p>请问：</p>
             <ol>
             <li>这两个 API 有何作用？</li>
             <li>这两个 API 有啥区别？</li>
             <li>这两个 API 有什么使用场景么？</li>
             </ol>
             <p>一些提示，两个 API 的一个使用场景。</p>
             <p>你在 LifeCycle 的源码中可以看到：</p>
             <pre><code>public class ReportFragment extends Fragment {
             private static final String REPORT_FRAGMENT_TAG = &quot;androidx.lifecycle&quot;
             + &quot;.LifecycleDispatcher.report_fragment_tag&quot;;

             public static void injectIfNeededIn(Activity activity) {
             // ProcessLifecycleOwner should always correctly work and some activities may not extend
             // FragmentActivity from support lib, so we use framework fragments for activities
             android.app.FragmentManager manager = activity.getFragmentManager();
             if (manager.findFragmentByTag(REPORT_FRAGMENT_TAG) == null) {
             manager.beginTransaction().add(new ReportFragment(), REPORT_FRAGMENT_TAG).commit();
             // Hopefully, we are the first to make a transaction.
             manager.executePendingTransactions();
             }
             }
             </code></pre><p>你在 RxPermission 可以看到以下使用：</p>
             <pre><code>rivate RxPermissionsFragment getRxPermissionsFragment(@NonNull final FragmentManager fragmentManager) {
             RxPermissionsFragment rxPermissionsFragment = findRxPermissionsFragment(fragmentManager);
             boolean isNewInstance = rxPermissionsFragment == null;
             if (isNewInstance) {
             rxPermissionsFragment = new RxPermissionsFragment();
             fragmentManager
             .beginTransaction()
             .add(rxPermissionsFragment, TAG)
             .commitNow();
             }
             return rxPermissionsFragment;
             }
             </code></pre>
             * descMd :
             * envelopePic :
             * fresh : false
             * id : 12229
             * link : https://wanandroid.com/wenda/show/12229
             * niceDate : 2天前
             * niceShareDate : 2020-03-07 22:19
             * origin :
             * prefix :
             * projectLink :
             * publishTime : 1583852285000
             * selfVisible : 0
             * shareDate : 1583590788000
             * shareUser :
             * superChapterId : 440
             * superChapterName : 问答
             * tags : [{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}]
             * title : 每日一问  今天考察下 Fragment 相关两个不常见 API
             * type : 1
             * userId : 2
             * visible : 1
             * zan : 1
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
            private List<TagsBean> tags;

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

            public List<TagsBean> getTags() {
                return tags;
            }

            public void setTags(List<TagsBean> tags) {
                this.tags = tags;
            }

            public static class TagsBean {
                /**
                 * name : 本站发布
                 * url : /article/list/0?cid=440
                 */

                private String name;
                private String url;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }
            }
        }
    }
}
