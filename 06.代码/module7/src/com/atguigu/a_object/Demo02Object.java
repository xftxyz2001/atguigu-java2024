package com.atguigu.a_object;

public class Demo02Object {

    public static void main(String[] args) {
        int a = 10;//只作用于当前自己的方法内部
        System.out.println(a);
    }

    public static void method(){
        //System.out.println(a);
    }
}
