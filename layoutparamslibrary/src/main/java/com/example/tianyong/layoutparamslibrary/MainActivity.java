package com.example.tianyong.layoutparamslibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private FrameLayout mContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_layoutparms);

        mContainer = (FrameLayout) findViewById(R.id.flContainer);

    }

    public void leftUp(View view) {
        TextView textView = new TextView(this);
        textView.setText("text");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        layoutParams.gravity = Gravity.LEFT | Gravity.TOP;
        mContainer.addView(textView, layoutParams);
    }

    public void rightUp(View view) {
        TextView textView = new TextView(this);
        textView.setText("text");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        layoutParams.gravity = Gravity.RIGHT | Gravity.TOP;
        mContainer.addView(textView, layoutParams);
    }

    public void leftDown(View view) {
        TextView textView = new TextView(this);
        textView.setText("text");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        layoutParams.gravity = Gravity.LEFT | Gravity.BOTTOM;
        mContainer.addView(textView, layoutParams);
    }

    public void rightDown(View view) {
        TextView textView = new TextView(this);
        textView.setText("text");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        layoutParams.gravity = Gravity.RIGHT | Gravity.BOTTOM;
        mContainer.addView(textView, layoutParams);
    }

    public void center(View view) {
        TextView textView = new TextView(this);
        textView.setText("text");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        layoutParams.gravity = Gravity.CENTER;
        mContainer.addView(textView, layoutParams);
    }
}
