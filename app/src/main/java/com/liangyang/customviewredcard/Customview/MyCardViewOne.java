package com.liangyang.customviewredcard.Customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * 创建日期：2017/1/19 on 15:19
 * 作者:杨亮 liangyang
 * 描述:自定义View---边缘凹凸的红包卡券效果01
 */
public class MyCardViewOne extends LinearLayout {
    //圆的半径
    private int radius = 8;
    //圆之间的距离
    private int gap = 8;
    private Paint mPaint;

    public MyCardViewOne(Context context) {
        super(context);
        init();
    }

    public MyCardViewOne(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyCardViewOne(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    /**
     * 初始化
     */
    private void init() {
        //初始化画布
        mPaint = new Paint();
        mPaint.setColor(Color.WHITE);
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setDither(true);
    }

    /**
     * 画布绘画
     *
     * @param canvas
     */
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //圆的个数
        int roundNum = getWidth() / (radius * 2 + gap * 2);
        for (int i = 1; i <= roundNum; i++) {
            canvas.drawCircle((gap + radius) * (2 * i - 1), 0, radius, mPaint);
            canvas.drawCircle((gap + radius) * (2 * i - 1), getHeight(), radius, mPaint);
        }
    }
}
