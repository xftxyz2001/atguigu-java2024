package com.atguigu.c_staticutils;

public class Test02 {
    public static void main(String[] args) {
        int[] arr = {5,4,5,7,8,9};
        int max = ArraysUtils.getMax(arr);
        System.out.println("max = " + max);
    }
}
