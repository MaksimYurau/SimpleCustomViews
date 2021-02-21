package com.example.simplecustomviews;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

public class RectangleActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new RectangleActivityView(this));
    }

    static class RectangleActivityView extends View {
        public RectangleActivityView(Context context) {
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            final Paint paint = new Paint();
            int width = getWidth();
            int height = getHeight();
            paint.setColor(Color.GREEN);
            final int size = 300;
            for (int x = 0; x < width; x += size) {
                for (int y = 0; y < height; y += size) {
                    paint.setColor(0x00ffffff & (1257823419 * x + 2118746214 * y) | 0xff000000);
                    canvas.drawRect(x, y, x + size, y + size, paint);
                }
            }
        }
    }
}
