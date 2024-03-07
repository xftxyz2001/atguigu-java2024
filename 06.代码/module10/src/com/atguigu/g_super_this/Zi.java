package com.atguigu.g_super_this;

public class Zi extends Fu{
    int num = 100;
    public Zi(){
        super();//调用父类中的无参构造
        System.out.println("我是子类中的无参构造");
    }

    public Zi(int num){
        super(10);//调用父类的有参构造
        System.out.println("我是子类中的有参构造");
    }

    public void method(){
        super.method();//调用父类的method方法
        System.out.println("我是子类中的method方法");
        System.out.println(num);//子类自己的
        System.out.println(super.num);//调用父类的num
    }
}
