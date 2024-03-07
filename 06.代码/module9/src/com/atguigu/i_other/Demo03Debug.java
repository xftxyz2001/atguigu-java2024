package com.atguigu.i_other;

public class Demo03Debug {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;

        for (int i = 0; i < 5; i++) {
            method(arr);
        }
    }

    private static void method(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
