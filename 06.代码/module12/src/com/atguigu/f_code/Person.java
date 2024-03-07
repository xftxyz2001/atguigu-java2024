package com.atguigu.f_code;

public class Person {
    public Person(){
        System.out.println("我是无参构造方法");
    }

    //构造代码块
    {
        System.out.println("我是构造代码块");
    }

    //静态代码块
    static{
        System.out.println("我是静态代码块");
    }
}
