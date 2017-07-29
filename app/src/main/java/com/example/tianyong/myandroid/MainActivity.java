package com.example.tianyong.myandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.tianyong.tablayoutdemo.TabLayoutBottomActivity;
import com.example.tianyong.tablayoutdemo.TabLayoutTopActivity;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void callBack(View view) {
        startActivity(new Intent(this, com.example.tianyong.mylibrary.MainActivity.class));
    }

    public void imageClip(View view) {
        startActivity(new Intent(this, evan.wang.MainActivity.class));
    }

    public void layoutParams(View view) {
        startActivity(new Intent(this, com.example.tianyong.layoutparamslibrary.MainActivity.class));
    }

    public void tabLayoutTop(View view) {
        startActivity(new Intent(this, TabLayoutTopActivity.class));
    }

    public void tabLayoutBottom(View view) {
        startActivity(new Intent(this, TabLayoutBottomActivity.class));
    }

}
