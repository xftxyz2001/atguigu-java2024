package com.atguigu.a_thread;

public class Test01 {
    public static void main(String[] args) {
        //创建线程对象
        MyThread t1 = new MyThread();
        //调用start方法,开启线程,jvm自动调用run方法
        t1.start();

        //MyThread t2 = new MyThread();
        //t2.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("main线程..........执行了"+i);
        }
    }
}
