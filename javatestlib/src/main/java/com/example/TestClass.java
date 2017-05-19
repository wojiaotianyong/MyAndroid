package com.example;

import com.google.gson.JsonArray;

public class TestClass {
    public static void main(String[] args) {
//        System.out.print("hello world1");
        JsonArray jsonArray = new JsonArray();
        jsonArray.add("a");
        jsonArray.add("b");
        jsonArray.add("c");
        for (int i = 0; i < jsonArray.size(); i++) {
            System.out.println(jsonArray.get(i).getAsString());
        }
    }
}
