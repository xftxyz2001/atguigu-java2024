package com.atguigu.d_thread;

public class MyThread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"执行了..."+i);
        }
    }
}
