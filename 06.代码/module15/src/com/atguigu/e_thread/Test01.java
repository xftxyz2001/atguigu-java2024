package com.atguigu.e_thread;

public class Test01 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.setName("张三");

        MyThread t2 = new MyThread();
        t2.setName("李四");

        /*
          MIN_PRIORITY = 1 最小为1
          NORM_PRIORITY = 5 默认为5
          MAX_PRIORITY = 10 最大为10

         */
        //System.out.println(t1.getPriority()+"...");//默认都为5,Thread底层源码决定
        //System.out.println(t2.getPriority()+"...");//默认都为5,Thread底层源码决定

        t1.setPriority(1);
        t1.setPriority(10);//先抢到CPU使用权的概率大,但不是每次都先抢到

        t1.start();
        t2.start();
    }
}
