package com.example.simplecustomviews;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.view.View;

public class ArbitraryFiguresActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new ArbitraryFiguresActivityView(this));
    }

    static class ArbitraryFiguresActivityView extends View {
        public ArbitraryFiguresActivityView(Context context) {
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            int height = getHeight();
            int width = getWidth();
            final Paint paint = new Paint();
            int centerX = width / 2;
            int centerY = height / 2;
            int padding = 50;
            int minSide = Math.min(width, height);
            int contentSize = minSide - 2 * padding;

            float segmentSize = contentSize / 3;

            canvas.drawColor(Color.BLACK);
            Path path = new Path();
            path.moveTo(segmentSize, 0);
            path.lineTo(2 * segmentSize, 0);
            path.lineTo(2 * segmentSize, segmentSize);
            path.lineTo(3 * segmentSize, segmentSize);
            path.lineTo(3 * segmentSize, 3 * segmentSize);
            path.lineTo(2 * segmentSize, 3 * segmentSize);
            path.lineTo(2 * segmentSize, 2 * segmentSize);
            path.lineTo(segmentSize, 2 * segmentSize);
            path.lineTo(segmentSize, 3 * segmentSize);
            path.lineTo(0, 3 * segmentSize);
            path.lineTo(0, segmentSize);
            path.lineTo(segmentSize, segmentSize);
            path.lineTo(segmentSize, 0);

            path.offset(centerX - 1.5f * segmentSize, centerY - 1.5f * segmentSize);

            paint.setColor(Color.WHITE);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setStrokeWidth(20);

            canvas.drawPath(path, paint);
        }
    }
}
