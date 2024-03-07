package com.atguigu.c_extends;

public class Test01 {
    public static void main(String[] args) {
        Fu fu = new Fu();
        fu.methodFu();
       // fu.methodZi(); 不能直接调用子类特有的方法
        fu.method();//父类中的method方法

        System.out.println("=====================");
        Zi zi = new Zi();
        zi.methodZi();
        zi.methodFu();//继承父类之后,能调用父类非私有成员
        zi.method();//子类中的method方法

        System.out.println("===================");

        Fu fu1 = new Zi();
        fu1.method();//调用的是子类中的method方法
    }
}
