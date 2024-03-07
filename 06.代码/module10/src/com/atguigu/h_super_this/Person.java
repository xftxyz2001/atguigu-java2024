package com.atguigu.h_super_this;

public class Person {
    int num = 10;
    public Person(){
        //this(10);
        System.out.println("我是Person中的无参构造");
    }

    public Person(int data){
        //super();super和this不能同时再构造中出现
        this();
        System.out.println("我是Person中的有参构造");
    }

    public void method(){
        int num = 20;
        System.out.println(num);//20
        System.out.println(this.num);//10
        this.method01();
        System.out.println("我是Person类中的method方法");
    }

    public void method01(){
        System.out.println("我是Person类中的method01方法");
    }
}
