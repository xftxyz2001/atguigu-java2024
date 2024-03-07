package com.atguigu.e_pool;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"...执行了");
    }
}
