package com.atguigu.a_thread;

import java.util.Arrays;

public class Test02 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 4, 0, 2, 0, 5};//1425000
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
        }
        for (int i = j; i < arr.length; i++) {
            arr[i] = 0;
        }

        System.out.println(Arrays.toString(arr));
    }
}
