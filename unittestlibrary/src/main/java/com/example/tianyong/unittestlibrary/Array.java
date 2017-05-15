package com.example.tianyong.unittestlibrary;

/**
 * Created by Creaty on 2017/5/15.
 */

public class Array {

    //获取最大子数组
    public int list(int[] list) {
        int summax = max(list);
        int i, j, k;
        for (i = 0; i < list.length; i++)
            for (j = i; j < list.length; j++) {
                int temp = 0;
                for (k = i; k <= j; k++)
                    temp += list[k];
                if (temp > summax) {
                    summax = temp;
                }
            }
        return summax;

    }

    //获取数组的最大值
    public int max(int[] list) {
        int max = list[0];
        for (int i = 0; i < list.length; i++) {
            if (max < list[i]) {
                max = list[i];
            }
        }
        return max;
    }

}
