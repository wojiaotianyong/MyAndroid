package com.example.tianyong.myandroid.callback;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.tianyong.myandroid.R;

/**
 * Created by Creaty 20170507
 * 回调方式三(特别方式 - 子父间回调 方式):
 * 1. A类继承 抽象的B类
 * 2. B类定义一个公有方法c和一个抽象方法d,并且在共有方法c中调用抽象方法d
 * 3. A类实现B类的抽象方法d,并且A类调用B类的共有方法c
 */
public class Call3Activity extends BaseActivity { //1. A类继承 抽象的B类

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call3);
    }

    //3. A类实现B类的抽象方法d,并且A类调用B类的共有方法c
    public void call3(View view) {
        save();
    }
    @Override
    protected void onSave() {
        Toast.makeText(Call3Activity.this, "call3", Toast.LENGTH_LONG).show();
    }
}
