package com.atguigu.k_innerclass;

public class Test01 {
    public static void main(String[] args) {
        USB usb = method();//USB usb = new Mouse()
        usb.open();
    }

    public static USB method(){
        //局部内部类
        class Mouse implements USB{

            @Override
            public void open() {

                System.out.println("鼠标打开");
            }
        }

        return new Mouse();
    }
}
