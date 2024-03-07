package com.atguigu.g_thread;

public class Test01 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.setName("张三");

        MyThread t2 = new MyThread();
        t2.setName("李四");

        t1.start();
        t2.start();
    }
}
