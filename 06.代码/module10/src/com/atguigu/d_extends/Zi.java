package com.atguigu.d_extends;

public class Zi extends Fu{
    public void methodZi(){
        System.out.println("我是子类中的methodZi方法");
    }

    @Override
    public void method(){
        System.out.println("我是子类中的method方法");
    }

    @Override
   public void method01(){

    }

   /* public static void method02(){

    }*/

    @Override
    public Zi method03(){
return null;
    }
}
