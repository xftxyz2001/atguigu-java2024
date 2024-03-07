package com.atguigu.c_thread;

public class Test01 {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        t1.setName("金莲");

        MyThread1 t2 = new MyThread1();
        t2.setName("阿庆");

        /*
           获取两个线程的优先级
           MIN_PRIORITY = 1 最小优先级 1
           NORM_PRIORITY = 5 默认优先级 5
           MAX_PRIORITY = 10 最大优先级 10
         */
        //System.out.println(t1.getPriority());
        //System.out.println(t2.getPriority());

        //设置优先级
        t1.setPriority(1);
        t2.setPriority(10);

        t1.start();
        t2.start();
    }
}
