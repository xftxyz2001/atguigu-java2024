package com.atguigu.logic;

public class Demo02Logic {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        //boolean result01 = (++a>100)&(++b>10);
        //boolean result01 = (++a > 100) && (++b > 10);

        //boolean result01 = (++a<100)|(++b>10);
        boolean result01 = (++a<100)||(++b>10);
        System.out.println("result01 = " + result01);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
