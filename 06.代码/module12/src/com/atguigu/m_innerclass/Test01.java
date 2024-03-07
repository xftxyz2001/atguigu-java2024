package com.atguigu.m_innerclass;

public class Test01 {
    public static void main(String[] args) {
        method01(new USB() {
            @Override
            public void open() {
                System.out.println("usb打开了");
            }
        });
    }
    public static void method01(USB usb){
        usb.open();
    }
}
