package com.example.myblog.utils;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;

import androidx.annotation.Nullable;

/**
 * 1@auth
 * 2020-03-07 创建的系统天
 * 17:59 创建的系统时间
 * 2020 创建的年份
 * 03 创建的月份
 * com.example.boringday1.utils 所在包名
 * Administrator 当前用户系统登录名
 */
public class SplashView extends View {
    private Paint mPaint;
    private Paint mWavePaint;
    /**
     * 屏幕正中间坐标
     */
    private float mCenterX;
    private float mCenterY;
    /**
     * 转圈的起始半径
     */
    private float mBallStartCircleRadius = 30;

    /**
     * 转圈的当前半径
     */
    private float mBallCurrentCircleRadius = mBallStartCircleRadius;

    /**
     * 转圈的最终半径
     */
    private float mBallEndCircleRadius = 60;

    /**
     * 小球的半径
     */
    private float mBallRadius = 10;
    /**
     * 当前小球旋转角度
     */
    private float mCurrentRotateAngle;
    /**
     * 颜色值
     */
    private int[] Colors = {Color.parseColor("#FF9E4C4C"), Color.parseColor("#FFFF9800"),
            Color.parseColor("#FF4400FF"), Color.parseColor("#FF009688"),
            Color.parseColor("#FF8BC34A"), Color.parseColor("#FF22A591")};
    /**
     * 状态：旋转、扩散聚合、水波纹
     */
    private SplashState state;
    /**
     * 属性动画
     */
    private ValueAnimator mAnimator;
    /**
     * 动画时间
     */
    private int mDuration = 1200;

    /**
     * 屏幕的斜边长度
     */
    private float mDistance;
    /**
     * 水波纹的半径
     */
    private float mWaveRadius;

    public SplashView(Context context) {
        this(context, null);
        init();
    }

    public SplashView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
        init();
    }

    public SplashView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        mCenterX = w / 2;
        mCenterY = h / 2;
        mDistance = (float) (Math.hypot(w, h) / 2);
        super.onSizeChanged(w, h, oldw, oldh);
    }

    private void init() {
        mPaint = new Paint();
        mPaint.setAntiAlias(true);
        mWavePaint = new Paint();

        mWavePaint.setAntiAlias(true);
        mWavePaint.setStyle(Paint.Style.STROKE);
        mWavePaint.setColor(Color.WHITE);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (state == null) {
            state = new RotateState();
        }
        state.drawState(canvas);
    }

    private abstract class SplashState {
        abstract void drawState(Canvas canvas);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            //resetState();
        }
        return super.onTouchEvent(event);
    }

    /**
     * 重置状态
     */
    private void resetState() {
        mWaveRadius = 0;
        mBallCurrentCircleRadius = mBallStartCircleRadius;
        state = new RotateState();
    }

    //1. 旋转
    private class RotateState extends SplashState {
        RotateState() {
            mAnimator = ValueAnimator.ofFloat(0, (float) (Math.PI * 2));
            mAnimator.setRepeatCount(2);
            mAnimator.setDuration(mDuration);
            mAnimator.setInterpolator(new LinearInterpolator());
            mAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public void onAnimationUpdate(ValueAnimator animation) {
                    mCurrentRotateAngle = (float) animation.getAnimatedValue();
                    invalidate();
                }
            });
            mAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animation) {
                    new MergeState();
                }
            });
            mAnimator.start();
        }

        @Override
        void drawState(Canvas canvas) {
            drawBackground(canvas);
            drawBalls(canvas);
        }
    }

    //2. 扩散聚合
    private class MergeState extends SplashState {
        MergeState() {
            mAnimator = ValueAnimator.ofFloat(mBallRadius, mBallEndCircleRadius);
            mAnimator.setDuration(mDuration);
            mAnimator.setInterpolator(new OvershootInterpolator());
            mAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animation) {
                    new WaveState();
                }
            });
            mAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public void onAnimationUpdate(ValueAnimator animation) {
                    mBallCurrentCircleRadius = (float) animation.getAnimatedValue();
                    invalidate();
                }
            });
            mAnimator.reverse();
        }

        @Override
        void drawState(Canvas canvas) {
            drawBackground(canvas);
            drawBalls(canvas);
        }
    }

    //3. 扩散聚合
    private class WaveState extends SplashState {
        WaveState() {
            mAnimator = ValueAnimator.ofFloat(0, mDistance);
            mAnimator.setDuration(mDuration);
            mAnimator.setInterpolator(new LinearInterpolator());
            mAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public void onAnimationUpdate(ValueAnimator animation) {
                    mWaveRadius = (float) animation.getAnimatedValue();
                    invalidate();
                }
            });
            mAnimator.start();
        }

        @Override
        void drawState(Canvas canvas) {
            drawBackground(canvas);
        }
    }
    /**
     * 画六个小球
     */
    private void drawBalls(Canvas canvas) {
        double rotateAngle = Math.PI * 2 / Colors.length;
        for (int i = 0; i < Colors.length; i++) {
            mPaint.setColor(Colors[i]);
            double angle = rotateAngle * i + mCurrentRotateAngle;
            float cx = (float) (mBallCurrentCircleRadius * Math.cos(angle) + mCenterX);
            float cy = (float) (mBallCurrentCircleRadius * Math.sin(angle) + mCenterY);
            if (mBallCurrentCircleRadius != mBallRadius) {
                canvas.drawCircle(cx, cy, mBallRadius, mPaint);
            }
        }
    }

    /**
     * 画背景
     */
    private void drawBackground(Canvas canvas) {
        if (mWaveRadius > 0) {
            float stokeWidth = mDistance - mWaveRadius;
            float radius = stokeWidth / 2 + mWaveRadius;
            mWavePaint.setStrokeWidth(stokeWidth);
            canvas.drawCircle(mCenterX, mCenterY, radius, mWavePaint);
        } else {
            canvas.drawColor(Color.WHITE);
        }
    }

}
