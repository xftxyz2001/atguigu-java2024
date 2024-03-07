package com.atguigu.e_interface;

public class Test01 {
    public static void main(String[] args) {
        InterfaceImpl anInterface = new InterfaceImpl();
        anInterface.methodDef();
        anInterface.methodDef(10);
    }
}
