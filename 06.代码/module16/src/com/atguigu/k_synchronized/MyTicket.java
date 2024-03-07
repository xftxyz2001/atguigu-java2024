package com.atguigu.k_synchronized;

public class MyTicket implements Runnable{
    //定义100张票
    static int ticket = 100;

    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
           //method01();
            method02();
        }
    }

    /*public static synchronized void method01(){
        if (ticket>0){
            System.out.println(Thread.currentThread().getName()+"买了第"+ticket+"张票");
            ticket--;
        }
    }*/
   public static void method02(){
       synchronized(MyTicket.class){
           if (ticket>0){
               System.out.println(Thread.currentThread().getName()+"买了第"+ticket+"张票");
               ticket--;
           }
       }

   }
}
