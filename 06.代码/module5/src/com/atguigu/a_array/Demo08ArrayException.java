package com.atguigu.a_array;

public class Demo08ArrayException {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;
       // arr[3] = 400;  索引3超出了arr的索引范围
       // arr[-1] = 400; 索引-1超出了arr的索引范围

        for (int i = 0; i <= 3; i++) {
            System.out.println(arr[i]);//索引3超出了arr的索引范围
        }
    }
}
