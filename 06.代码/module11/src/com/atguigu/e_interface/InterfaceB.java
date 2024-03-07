package com.atguigu.e_interface;

public interface InterfaceB {
    public abstract void method();

    /*    public default void methodDef(){
            System.out.println("我是接口B中的默认方法");
        }*/
    public default void methodDef(int a) {
        System.out.println("我是接口B中的默认方法");
    }
}
