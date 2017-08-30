package com.example;

public class TestClass {
    public static void main(String[] args) {

        int num = 1;

        switch (num) {
            case 0:
                System.out.println("0");
                break;
            case 1:
            case 2:
                System.out.println("1|2");
                break;
            default:
                System.out.println("default");
                break;
        }

    }
}
