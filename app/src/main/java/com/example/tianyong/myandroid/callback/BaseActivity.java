package com.example.tianyong.myandroid.callback;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.tianyong.myandroid.R;

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
    }

    //2. B类定义一个公有方法c和一个抽象方法d,并且在共有方法c中调用抽象方法d
    public void save(){
        onSave();
    }
    protected abstract void onSave();
}
