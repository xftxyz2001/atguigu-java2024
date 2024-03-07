package com.atguigu.a_wait_notify;

public class Test01 {
    public static void main(String[] args) {
        BaoZiPu baoZiPu = new BaoZiPu();

        Product product = new Product(baoZiPu);
        Consumer consumer = new Consumer(baoZiPu);

        Thread t1 = new Thread(product);
        Thread t2 = new Thread(consumer);

        t1.start();
        t2.start();
    }
}
