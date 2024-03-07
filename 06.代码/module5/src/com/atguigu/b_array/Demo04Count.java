package com.atguigu.b_array;

import java.util.Random;

public class Demo04Count {
    public static void main(String[] args) {
        //1.创建Random对象
        Random rd = new Random();
        //2.定义长度为50的数组
        int[] arr = new int[50];
        //3.随机50个存储到数组中
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100)+1;
        }
        //4.定义count,用于统计
        int count = 0;
        //5.遍历数组,判断,如果是偶数,count++
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0){
                count++;
            }
        }
        //6.输出count
        System.out.println("count = " + count);
    }
}
