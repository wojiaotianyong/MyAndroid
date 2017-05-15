package com.example.tianyong.mylibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.tianyong.mylibrary.callback.Call2Activity;
import com.example.tianyong.mylibrary.callback.Call3Activity;
import com.example.tianyong.mylibrary.callback.CallActivity;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_callback);
    }

    public void goCall(View view) {
        startActivity(new Intent(this, CallActivity.class));
    }

    public void goCall2(View view) {
        startActivity(new Intent(this, Call2Activity.class));
    }

    public void goCall3(View view) {
        startActivity(new Intent(this, Call3Activity.class));
    }

}
