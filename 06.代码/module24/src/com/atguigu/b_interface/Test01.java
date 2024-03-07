package com.atguigu.b_interface;

public class Test01 {
    public static void main(String[] args) {
       method(new USB() {
           @Override
           public void open(String s) {
               System.out.println(s+"开启了");
           }
       });
        System.out.println("=====Lambda====");
        method((String s)->{
                System.out.println(s+"开启了");
        });

        System.out.println("=====Lambda简化版====");
        method(s-> System.out.println(s+"开启了"));
    }
    public  static void method(USB usb){
        usb.open("鼠标");
    }
}
