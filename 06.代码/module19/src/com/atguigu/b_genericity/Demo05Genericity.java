package com.atguigu.b_genericity;

public class Demo05Genericity {
    public static void main(String[] args) {
        MyScanner myScanner = new MyScanner();
        String result = myScanner.next();
        System.out.println("result = " + result);
    }
}
