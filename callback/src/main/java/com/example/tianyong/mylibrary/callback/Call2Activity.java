package com.example.tianyong.mylibrary.callback;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.example.tianyong.mylibrary.R;

/**
 * Created by Creaty 20170429
 * 回调方式二(常用方式-匿名内部类方式):
 * 1. A 类中使用内部匿名类的方式定义回调函数
 * 2. A 类中有B 类对象
 * 3. B 类中有带有CallBack参数的方法
 */
public class Call2Activity extends AppCompatActivity {
    //2. A 类中有B 类对象
    private MyButton myButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call2);

        myButton = new MyButton(this);
        myButton.setMyOnClickLisener(new MyButton.MyOnClickLisener() {//1. A 类中使用内部匿名类的方式定义回调函数
            @Override
            public void myOnClick() {
                Toast.makeText(Call2Activity.this, "call2", Toast.LENGTH_LONG).show();
            }
        });
    }

    public void call2(View view) {
        myButton.click();
    }
}
