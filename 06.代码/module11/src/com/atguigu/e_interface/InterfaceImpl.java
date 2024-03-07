package com.atguigu.e_interface;

public class InterfaceImpl implements InterfaceA,InterfaceB{
    @Override
    public void method() {
        System.out.println("重写的method方法");
    }

/*    @Override
    public void methodDef() {
        System.out.println("重写后的默认方法");
    }*/
}
