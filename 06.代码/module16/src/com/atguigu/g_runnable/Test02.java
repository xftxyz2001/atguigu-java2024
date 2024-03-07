package com.atguigu.g_runnable;

public class Test02 {
    public static void main(String[] args) {
        /*
          Thread(Runnable r)
          Thread(Runnable target, String name) :name指的是给线程设置名字
         */

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName()+"...执行了"+i);
                }
            }
        },"阿庆").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName()+"...执行了"+i);
                }
            }
        },"金莲").start();
    }
}
