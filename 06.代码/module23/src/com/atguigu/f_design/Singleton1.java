package com.atguigu.f_design;

public class Singleton1 {
    /*
      防止外界随意使用构造方法new对象,我们需要将构造私有化
    */
    private Singleton1() {

    }

    /*
       懒汉式,不着急new对象
     */
    private static Singleton1 singleton1 = null;

    /*
       为了将内部new出来的对给外界
       定义一个方法,将内部new出来的对返回
     */
    public static Singleton1 getSingleton1() {
        //如果singleton1不是null就没必要抢锁了,直接返回,是null再抢锁
        if (singleton1==null){
            synchronized (Singleton1.class){
                if (singleton1 == null) {
                    singleton1 = new Singleton1();
                }
            }
        }
        return singleton1;
    }
}
