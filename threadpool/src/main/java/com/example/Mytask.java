package com.example;

/**
 * Created by Administrator on 2017/7/1.
 */

class Mytask implements Runnable {// 任务接口
    public void run() {
        String name = Thread.currentThread().getName();
        try {
            Thread.sleep(100);// 模拟任务执行的时间
        } catch (InterruptedException e) {
        }
        System.out.println(name + " executed OK");
    }
}
