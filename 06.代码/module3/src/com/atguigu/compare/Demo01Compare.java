package com.atguigu.compare;

public class Demo01Compare {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;

        boolean result01 = i == j;
        System.out.println("result01 = " + result01);//false
        System.out.println(i>j);//false
        System.out.println(i<j);//true
        System.out.println(i>=j);//false
        System.out.println(i<=j);//true
        System.out.println(i!=j);//true

    }
}
