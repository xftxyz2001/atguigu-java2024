package com.atguigu.g_super_this;

public class Fu {
    int num = 10;
    public Fu(){
        System.out.println("我是父类中的无参构造");
    }

    public Fu(int data){
        System.out.println("我是父类中的有参构造");
    }

    public void method(){
        System.out.println("我是父类中的method方法");
    }
}
