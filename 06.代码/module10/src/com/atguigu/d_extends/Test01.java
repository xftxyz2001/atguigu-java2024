package com.atguigu.d_extends;

public class Test01 {
    public static void main(String[] args) {
        Fu fu = new Fu();
        fu.methodFu();//自己的methodFu方法
        fu.method();//new的是父类对象,那么调用的就是父类中的method

        System.out.println("================");

        Zi zi = new Zi();
        zi.methodZi();
        zi.methodFu();
        zi.method();//子类中的method方法
    }
}
