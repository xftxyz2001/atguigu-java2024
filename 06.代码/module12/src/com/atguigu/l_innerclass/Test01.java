package com.atguigu.l_innerclass;

public class Test01 {
    public static void main(String[] args) {
        new USB(){

            @Override
            public void open() {
                System.out.println("usb打开了");
            }

            @Override
            public void close() {
                System.out.println("usb关闭了");
            }
        }.open();

        System.out.println("===================");

        USB usb = new USB() {
            @Override
            public void open() {
                System.out.println("USB打开了");
            }

            @Override
            public void close() {
                System.out.println("USB关闭了");
            }
        };
        usb.open();
        usb.close();
    }
}
