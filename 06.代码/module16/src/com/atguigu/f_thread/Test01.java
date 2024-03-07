package com.atguigu.f_thread;

public class Test01 {
    public static void main(String[] args) throws InterruptedException {
        MyThread1 t1 = new MyThread1();
        t1.setName("金莲");
        t1.start();

        /*
          表示把t1插入到当前线程之前,t1要插到main线程之前,所以当前线程就是main线程
         */
        t1.join();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"执行了......"+i);
        }
    }
}
