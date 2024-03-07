package com.atguigu.h_thread;

public class Test01 {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        t1.setName("张三");
        t1.start();

        //表示把t1,插入到当前线程之前,t1要插入到main线程之前,所以当前线程为main线程
        t1.join();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"执行了......."+i);
        }
    }
}
