package com.atguigu.a_scanner;

import java.util.Scanner;

public class Demo01Scanner {
    public static void main(String[] args) {
        //创建对象
        Scanner sc = new Scanner(System.in);
        //录入int型整数
        int data1 = sc.nextInt();
        System.out.println("data1 = " + data1);

        //录入String型字符串
        String data2 = sc.next();
        System.out.println("data2 = " + data2);
    }
}
