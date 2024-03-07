package com.atguigu.b_random;

import java.util.Random;

public class Demo02Random {
    public static void main(String[] args) {
        //创建对象
        Random rd = new Random();
        //在1-100之间随机
        int data1 = rd.nextInt(100)+1;
        System.out.println("data1 = " + data1);

        System.out.println("=====================");

        //在100-999之间随机一个数
        int data2 = rd.nextInt(900)+100;
        System.out.println("data2 = " + data2);
    }
}
