package com.example.simplecustomviews;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_blue).setOnClickListener(this);
        findViewById(R.id.btn_rectangle).setOnClickListener(this);
        findViewById(R.id.btn_circles).setOnClickListener(this);
        findViewById(R.id.btn_arbitrary_figures).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_blue) {
            startActivity(new Intent(this, BlueActivity.class));
        } else if (v.getId() == R.id.btn_rectangle) {
            startActivity(new Intent(this, RectangleActivity.class));
        } else if (v.getId() == R.id.btn_circles) {
            startActivity(new Intent(this, CirclesActivity.class));
        } else if (v.getId() == R.id.btn_arbitrary_figures) {
            startActivity(new Intent(this, ArbitraryFiguresActivity.class));
        }
    }
}
