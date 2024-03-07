package com.atguigu.a_exception;

public class Demo03Exception {
    public static void main(String[] args) {
        String s = "a.tx1t";
        method(s);
    }
    public static void method(String s){
        if (!s.endsWith(".txt")){
            //故意创建异常对象,用throw说明此处有异常
            throw new NullPointerException();
        }
        System.out.println("我要执行了");
    }
}
