package com.atguigu.h_param;

public class Demo02Param {
    public static void main(String[] args) {
        int[] arr = {10,20};
        method(arr);
        System.out.println(arr[0]);//20
        System.out.println(arr[1]);//40
    }

    public static void method(int[] arr){
        arr[0]+=10;
        arr[1]+=20;
        System.out.println(arr[0]);//20
        System.out.println(arr[1]);//40
    }
}
