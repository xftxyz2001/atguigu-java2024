package com.atguigu.c_overload;

public class Demo1OverLoad {
    public static void main(String[] args) {
        sum(10,20);
        sum(10,20,30);
        sum(10,20,30,40);

        sum(10,2.5);
    }

    public static void sum(int a,double b){
        System.out.println(a+b);
    }

/*    public static double sum(int a,double b){
       return a+b;
    }*/

    /*public static void sum(int x,double y){
        System.out.println(x+y);
    }*/


    //两个整数相加
    public static void sum(int a,int b){
        System.out.println(a+b);
    }

    //三个整数相加
    public static void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }

    //四个整数相加
    public static void sum(int a,int b,int c,int d){
        System.out.println(a+b+c+d);
    }

    public static void sum(double a,int b){
        System.out.println(a+b);
    }


}
