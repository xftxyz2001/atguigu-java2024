package com.atguigu.a_array;

import java.util.Scanner;

public class Demo04Array {
    public static void main(String[] args) {
        //定义数组,长度为3
        int[] arr = new int[3];
        //创建Scanner对象
        Scanner sc = new Scanner(System.in);
        //键盘录入,将数据存到数组中
        //arr[0] = sc.nextInt();
        //arr[1] = sc.nextInt();
        //arr[2] = sc.nextInt();

        /*for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }*/


        //数组长度是多少,我们就循环多少次
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }
}
