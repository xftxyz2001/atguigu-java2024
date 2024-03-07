package com.atguigu.f_thread;

public class Test01 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.setName("张三");

        MyThread2 t2 = new MyThread2();
        t2.setName("李四");

        //设置t2为守护线程
        t2.setDaemon(true);

        t1.start();
        t2.start();
    }
}
