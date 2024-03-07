package com.atguigu.c_lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyTicket implements Runnable {
    //定义100张票
    int ticket = 100;

    //创建Lock对象
    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100L);

                //获取锁
                lock.lock();
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "买了第" + ticket + "张票");
                    ticket--;
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }finally {
                //释放锁
                lock.unlock();
            }

        }
    }
}
