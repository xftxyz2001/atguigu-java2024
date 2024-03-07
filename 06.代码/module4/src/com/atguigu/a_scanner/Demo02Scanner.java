package com.atguigu.a_scanner;

import java.util.Scanner;

public class Demo02Scanner {
    public static void main(String[] args) {
        //创建对象
        Scanner sc = new Scanner(System.in);
        //录入int型整数
        int old1 = sc.nextInt();
        int old2 = sc.nextInt();
        int old3 = sc.nextInt();

        int temp = old1>old2?old1:old2;
        int max = temp>old3?temp:old3;
        System.out.println(max);
    }
}
