package com.atguigu.g_runnable;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"...执行了"+i);
        }
    }
}
