package com.atguigu.e_thread;

public class Test01 {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        t1.setName("金莲");

        MyThread1 t2 = new MyThread1();
        t2.setName("阿庆");


        t1.start();
        t2.start();
    }
}
