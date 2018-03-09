package com.example.tianyong.retrofitdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 使用Retrofit封装的方法
        getRequest();
        postRequest();
    }

    public void getRequest() {
        HttpManger.getMethod("http://japi.juhe.cn/", "http://japi.juhe.cn/qqevaluate/qq?key=4ad53125c92b36630595c8fd8ec7ecd7&qq=1558049609", new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                System.out.println("成功1--" + response.body());
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                System.out.println("失败1--" + t.getMessage());
            }
        });
    }

    public void postRequest() {
        Map<String, String> map = new HashMap<>();
        map.put("key", "4ad53125c92b36630595c8fd8ec7ecd7");
        map.put("qq", "1558049609");
        HttpManger.postMethod("http://japi.juhe.cn/", "qqevaluate/qq", map, new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                System.out.println("成功2--" + response.body());
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                System.out.println("失败2--" + t.getMessage());
            }
        });
    }

}
