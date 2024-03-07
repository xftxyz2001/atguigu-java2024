package com.atguigu.h_ticket;

public class MyTicket implements Runnable{
    //定义100张票
    int ticket = 100;

    @Override
    public void run() {
        while(true){
            if (ticket>0){
                System.out.println(Thread.currentThread().getName()+"买了第"+ticket+"张票");
                ticket--;
            }
        }
    }
}
