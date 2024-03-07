package com.atguigu.d_if;

import java.util.Scanner;

public class Demo02IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data1 = sc.nextInt();
        int data2 = sc.nextInt();
        if (data1==data2){
            System.out.println("两个整数相等");
        }else{
            System.out.println("两个整数不相等");
        }
    }
}
