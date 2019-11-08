package com.example.animatioon;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class NewClass extends View {
    private float x=300;
    private float y;
    private float z=600;
    private float a;
    private float b=900;
    private float c;
    private boolean flag = true;

    public NewClass(Context context) {
        super(context);
    }
        @Override
        protected void onDraw (Canvas canvas){
            super.onDraw(canvas);
            Paint paint = new Paint();
            paint.setColor(Color.RED);
            paint.setStrokeWidth(23);
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(x, y, 60, paint);
            paint.setColor(Color.BLACK);
            canvas.drawCircle(b, c, 60, paint);
            paint.setColor(Color.GREEN);
            canvas.drawCircle(z, a, 60, paint);
            canvas.drawLine(getHeight()-10,getHeight()-10,getHeight()-10,getHeight()-10,paint);
            if (flag) {
                y += (int) (Math.random() * 5);
            } else {
                y -= (int) (Math.random() * 5);
            }
            if (flag) {
                a += (int) (Math.random() * 5);
            } else {
                a -= (int) (Math.random() * 5);
            }
            if (flag) {
                c += (int) (Math.random() * 5);
            } else {
                c -= (int) (Math.random() * 5);
            }
            if ((x > canvas.getWidth() ) || (y > canvas.getHeight() )) {
                flag = !flag;
            }
            if (x< 0 ||y < 0) {
                flag = !flag;
            }
            if ((z > canvas.getWidth() ) || (a > canvas.getHeight() )) {
                flag = !flag;
            }
            if (z < 0 || a < 0) {
                flag = !flag;
            }
            if ((b > canvas.getWidth() ) || (c > canvas.getHeight() )) {
                flag = !flag;
            }
            if (b < 0 || c < 0) {
                flag = !flag;
            }
            invalidate();
        }
    }