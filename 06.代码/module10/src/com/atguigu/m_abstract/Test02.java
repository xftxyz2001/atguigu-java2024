package com.atguigu.m_abstract;

public class Test02 {
    public static void main(String[] args) {
        JavaEE javaEE = new JavaEE(1, "涛哥");
        javaEE.work();
        System.out.println("===============");
        Android android = new Android(2, "金莲");
        android.work();
    }
}
