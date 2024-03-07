package com.atguigu.a_method;

public class Demo06Method {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        method(a,b);//a代表的10以及b代表的20传递过去了

        System.out.println("=====================");
        int result = sum(10, 20);
        System.out.println("result = " + result);
    }

    public static int sum(int a,int b){
        int result = a+b;
        return result;
    }

    public static void method(int a,int b){//a = 10  b = 20
        System.out.println(a+"..."+b);
    }
}
