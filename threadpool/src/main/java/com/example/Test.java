package com.example;

/**
 * Created by Administrator on 2017/7/1.
 */

public class Test {
    public static void main(String args[]) {
        ThreadsQueue tq = new ThreadsQueue(10);// 10个"线程池,队列"
        Mytask r[] = new Mytask[20];// 20个任务

        for (int i = 0; i < 20; i++) {
            r[i] = new Mytask();
            tq.execute(r[i]);//多个线程池,队列 执行 多个任务
        }
    }
}
