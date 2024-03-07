package com.atguigu.b_threadmethod;

public class Test01 {
    public static void main(String[] args) throws InterruptedException {
        //创建线程对象
        MyThread t1 = new MyThread();

        //给线程设置名字
        t1.setName("金莲");

        //调用start方法,开启线程,jvm自动调用run方法
        t1.start();

        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000L);
            System.out.println(Thread.currentThread().getName()+"线程..........执行了"+i);
        }
    }
}
