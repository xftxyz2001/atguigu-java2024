package com.atguigu.e_thread;

public class MyThread1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"执行了......"+i);
            Thread.yield();
        }
    }
}
