package com.example.myblog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myblog.adapter.ViewPageAdapter;
import com.example.myblog.base.BaseActivity;
import com.example.myblog.fragment.AnswerFragment;
import com.example.myblog.fragment.ClassificationFragment;
import com.example.myblog.fragment.HomeFragment;
import com.example.myblog.fragment.NavigationFragment;
import com.example.myblog.fragment.ProjectsFragment;
import com.example.myblog.fragment.PublicFragment;
import com.example.myblog.fragment.SquareFragment;
import com.example.myblog.fragment.SysFragment;
import com.example.myblog.fragment.ToolFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {
    @BindView(R.id.main_btn_homepage)
    Button mainBtnHomepage;
    @BindView(R.id.main_btn_square)
    Button mainBtnSquare;
    @BindView(R.id.main_btn_answer)
    Button mainBtnAnswer;
    @BindView(R.id.main_btn_navigation)
    Button mainBtnNavigation;
    @BindView(R.id.main_btn_sys)
    Button mainBtnSys;
    @BindView(R.id.main_btn_projects)
    Button mainBtnProjects;
    @BindView(R.id.main_btn_public)
    Button mainBtnPublic;
    @BindView(R.id.main_btn_classification)
    Button mainBtnClassification;
    @BindView(R.id.main_btn_tool)
    Button mainBtnTool;
    @BindView(R.id.main_viewpage)
    ViewPager mViewPager;
    private List<Button> mButtons = new ArrayList<>();
    private List<Fragment> mFragments = new ArrayList<>();
    private HomeFragment mHomeFragment;
    private SquareFragment mSquareFragment;
    private AnswerFragment mAnswerFragment;
    private NavigationFragment mNavigationFragment;
    private SysFragment mSysFragment;
    private ProjectsFragment mProjectsFragment;
    private PublicFragment mPublicFragment;
    private ClassificationFragment mClassificationFragment;
    private ToolFragment mToolFragment;
    private ViewPageAdapter mAdapter;
    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initViews() {
        mHomeFragment = new HomeFragment();
        mSquareFragment = new SquareFragment();
        mAnswerFragment = new AnswerFragment();
        mNavigationFragment = new NavigationFragment();
        mSysFragment = new SysFragment();
        mProjectsFragment = new ProjectsFragment();
        mPublicFragment = new PublicFragment();
        mClassificationFragment = new ClassificationFragment();
        mToolFragment = new ToolFragment();
    }

    @Override
    protected void initData() {
        mButtons.add(mainBtnHomepage);
        mButtons.add(mainBtnSquare);
        mButtons.add(mainBtnAnswer);
        mButtons.add(mainBtnNavigation);
        mButtons.add(mainBtnSys);
        mButtons.add(mainBtnProjects);
        mButtons.add(mainBtnPublic);
        mButtons.add(mainBtnClassification);
        mButtons.add(mainBtnTool);
        mFragments.add(mHomeFragment);
        mFragments.add(mSquareFragment);
        mFragments.add(mAnswerFragment);
        mFragments.add(mNavigationFragment);
        mFragments.add(mSysFragment);
        mFragments.add(mProjectsFragment);
        mFragments.add(mPublicFragment);
        mFragments.add(mClassificationFragment);
        mFragments.add(mToolFragment);
        mAdapter = new ViewPageAdapter(getSupportFragmentManager(),mFragments,getApplicationContext());
        mViewPager.setAdapter(mAdapter);
        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                setBg(mButtons);
                mButtons.get(position).setBackgroundResource(R.drawable.btn_bg);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
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

    @OnClick({R.id.main_btn_answer,R.id.main_btn_classification,R.id.main_btn_homepage,
            R.id.main_btn_navigation,R.id.main_btn_projects,R.id.main_btn_public,
            R.id.main_btn_square,R.id.main_btn_tool,R.id.main_btn_sys})
    public void onClick(View view){
        setBg(mButtons);
        switch (view.getId()){
            case R.id.main_btn_answer:
                //问答
                mainBtnAnswer.setBackgroundResource(R.drawable.btn_bg);
                mViewPager.setCurrentItem(2);
                break;
            case R.id.main_btn_classification:
                mainBtnClassification.setBackgroundResource(R.drawable.btn_bg);
                mViewPager.setCurrentItem(7);
                break;
            case R.id.main_btn_homepage:
                mainBtnHomepage.setBackgroundResource(R.drawable.btn_bg);
                mViewPager.setCurrentItem(0);
                break;
            case R.id.main_btn_navigation:
                mainBtnNavigation.setBackgroundResource(R.drawable.btn_bg);
                mViewPager.setCurrentItem(3);
                break;
            case R.id.main_btn_projects:
                mainBtnProjects.setBackgroundResource(R.drawable.btn_bg);
                mViewPager.setCurrentItem(5);
                break;
            case R.id.main_btn_public:
                mainBtnPublic.setBackgroundResource(R.drawable.btn_bg);
                mViewPager.setCurrentItem(6);
                break;
            case R.id.main_btn_square:
                mainBtnSquare.setBackgroundResource(R.drawable.btn_bg);
                mViewPager.setCurrentItem(1);
                break;
            case R.id.main_btn_tool:
                mainBtnTool.setBackgroundResource(R.drawable.btn_bg);
                mViewPager.setCurrentItem(8);
                break;
            case R.id.main_btn_sys:
                mainBtnSys.setBackgroundResource(R.drawable.btn_bg);
                mViewPager.setCurrentItem(4);
                break;
            default:
        }
    }

    /**
     * 设置按钮颜色
     * @param list
     */
    public void setBg(List<Button> list){
        for (Button b:list) {
            b.setBackgroundResource(R.drawable.btn_bg1);
        }
    }
}
