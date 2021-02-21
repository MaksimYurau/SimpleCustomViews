package com.example.simplecustomviews;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

public class BlueActivity extends Activity {
    private final Paint paint = new Paint();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new DemoDrawingView(this));
    }

    static class DemoDrawingView extends View {
        public DemoDrawingView(Context context) {
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            canvas.drawColor(Color.BLUE);
        }
    }
}
