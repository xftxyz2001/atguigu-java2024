package com.atguigu.d_array;

public class Demo04Array {
    public static void main(String[] args) {
        String[][] arr = new String[2][2];
        arr[0][0] = "张飞";
        arr[0][1] = "李逵";
        arr[1][0] = "刘备";
        arr[1][1] = "宋江";

        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);
    }
}
