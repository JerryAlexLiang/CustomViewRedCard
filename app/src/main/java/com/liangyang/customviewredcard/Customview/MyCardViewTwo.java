package com.liangyang.customviewredcard.Customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * 创建日期：2017/1/19 on 16:49
 * 作者:杨亮 liangyang
 * 描述:自定义View---边缘凹凸的红包卡券效果02
 */
public class MyCardViewTwo extends LinearLayout {

    //圆的半径
    private int radius = 8;
    //圆之间的距离
    private int gap = 8;
    private Paint mPaint;

    public MyCardViewTwo(Context context) {
        super(context);
        init();
    }

    public MyCardViewTwo(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyCardViewTwo(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    /**
     * 初始化
     */
    private void init() {
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
        int roundNum = getWidth() / (radius * 2 + gap * 2);
        for (int i = 0; i < roundNum; i++) {
            canvas.drawCircle((gap + radius) * (2 * i - 1), radius * 2, radius, mPaint);
        }
    }
}
