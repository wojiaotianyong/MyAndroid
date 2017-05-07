package com.example.tianyong.myandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.tianyong.myandroid.callback.Call2Activity;
import com.example.tianyong.myandroid.callback.CallActivity;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goCall(View view){
        startActivity(new Intent(this, CallActivity.class));
    }

    public void goCall2(View view){
        startActivity(new Intent(this, Call2Activity.class));
    }

}
