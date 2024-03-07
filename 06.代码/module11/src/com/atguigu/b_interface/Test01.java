package com.atguigu.b_interface;

public class Test01 {
    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        mouse.open();
        String result = mouse.close();
        System.out.println("result = " + result);
    }
}
