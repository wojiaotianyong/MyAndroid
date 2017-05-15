package com.example.tianyong.mylibrary.callback;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.example.tianyong.mylibrary.R;

/**
 * Created by Creaty 20170429
 * 回调方式一(经典方式):
 * 1. A 类实现CallBack接口
 * 2. A 类中有B 类对象
 * 3. B 类中有带有CallBack参数的方法
 */
public class CallActivity extends AppCompatActivity implements MyButton.MyOnClickLisener {//1. A 类实现CallBack接口
    //2. A 类中有B 类对象
    private MyButton myButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);

        myButton = new MyButton(this);
        myButton.setMyOnClickLisener(this);
    }

    public void call(View view) {
        myButton.click();
    }

    @Override
    public void myOnClick() {
        Toast.makeText(this, "call", Toast.LENGTH_LONG).show();
    }
}
