package com.atguigu.e_interface;

public interface InterfaceA {
    public abstract void method();

    public default void methodDef(){
        System.out.println("我是接口A中的默认方法");
    }
}
