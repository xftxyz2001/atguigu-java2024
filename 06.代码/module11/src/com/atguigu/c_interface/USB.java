package com.atguigu.c_interface;

public interface USB {
   //默认方法
    public default void methodDef(){
        System.out.println("我是默认方法");
    }

    //静态方法
    public static void methodSta(){
        System.out.println("我是接口中的静态方法");
    }
}
