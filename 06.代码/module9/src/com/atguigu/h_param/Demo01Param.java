package com.atguigu.h_param;

public class Demo01Param {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        method(a,b);
        System.out.println(a);//10
        System.out.println(b);//20
    }
    public static void method(int a,int b){
        a+=10;
        b+=20;
        System.out.println(a);//20
        System.out.println(b);//40
    }
}
