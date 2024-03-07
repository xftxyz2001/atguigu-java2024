package com.atguigu.m_innerclass;

public class Test02 {
    public static void main(String[] args) {
        USB usb = method01();
        usb.open();

    }

    public static USB method01(){
        return new USB() {
            @Override
            public void open() {
                System.out.println("USB打开了");
            }
        };
    }
}
