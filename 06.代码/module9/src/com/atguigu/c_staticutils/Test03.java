package com.atguigu.c_staticutils;

public class Test03 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        method(arr);
    }
    public static void method(int...arr){
        System.out.println(arr);
    }
}
