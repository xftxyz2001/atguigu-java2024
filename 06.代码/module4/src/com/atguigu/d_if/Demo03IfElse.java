package com.atguigu.d_if;

import java.util.Scanner;

public class Demo03IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        if (data%2==0){
            System.out.println("偶数");
        }else{
            System.out.println("奇数");
        }
    }
}
