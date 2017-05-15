package com.example.tianyong.mylibrary.callback;

import android.content.Context;

/**
 * Created by Creaty on 2017/4/29.
 */

public class MyButton {

    private Context mContext;
    private MyOnClickLisener myOnClickLisener;

    public MyButton(Context mContext) {
        this.mContext = mContext;
    }

    //3. B 类中有带有CallBack参数的方法
    public interface MyOnClickLisener {
        void myOnClick();
    }

    public void setMyOnClickLisener(MyOnClickLisener myOnClickLisener) {
        this.myOnClickLisener = myOnClickLisener;
    }

    public void click() {
        myOnClickLisener.myOnClick();
    }

}
