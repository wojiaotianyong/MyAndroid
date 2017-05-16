package com.example.tianyong.myandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


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

}
