package com.atguigu.e_recursion;

public class Demo03Recursion {
    public static void main(String[] args) {
        int method = method(3);
        System.out.println("method = " + method);
    }

    public static int method(int n){
       if (n==1){
           return 1;
       }
       return n*method(n-1);
    }
}
