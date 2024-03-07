package com.atguigu.c_utils;

import java.util.Arrays;

public class Demo02Arrays {
    public static void main(String[] args) {
        int[] arr = {5,3,4,6,5,4,7};
        System.out.println(Arrays.toString(arr));

        System.out.println("==============");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("==============");
        int[] arr1 = {1,2,3,4,5,6,7};
        int index = Arrays.binarySearch(arr1, 3);
        System.out.println("index = " + index);

        System.out.println("==============");
        int[] arr2 = {1,2,3,4,5};
        int[] newArr = Arrays.copyOf(arr2, 10);
        System.out.println(Arrays.toString(newArr));

        arr2 = newArr;
        System.out.println(Arrays.toString(arr2));
    }
}
