package com.atguigu.m_abstract;

public class Test01 {
    public static void main(String[] args) {
        JavaEE javaEE = new JavaEE();
        javaEE.setId(1);
        javaEE.setName("涛哥");
        javaEE.work();
        System.out.println("===============");
        Android android = new Android();
        android.setId(2);
        android.setName("金莲");
        android.work();
    }
}
