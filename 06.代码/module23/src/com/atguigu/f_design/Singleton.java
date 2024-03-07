package com.atguigu.f_design;

public class Singleton {
    /*
      防止外界随意使用构造方法new对象,我们需要将构造私有化
     */
    private Singleton(){

    }

    /*
       为了赶紧new对象,我们new对象的时候变成静态的,让其随着类的加载而加载
       为了不让外界随便使用类名调用此静态对象,我们将其变成private
     */
    private static Singleton singleton = new Singleton();

    /*
       为了将内部new出来的对象给外界
       我们可以定义 一个方法,将内部的对象返回给外界
     */
    public static Singleton getSingleton(){
        return singleton;
    }
}
