package com.atguigu.h_param;

public class Demo04Param {
    //形参：String[] args
    public static void main(String[] args){
       method(args[0],args[1]);
    }

    public static void method(String s1,String s2){
        System.out.println(s1+s2);
    }
}
