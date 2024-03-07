package com.atguigu.c_staticutils;

public class Test01 {
    public static void main(String[] args) {
        int[] arr = {5,3,4,6,7,54,8};
        int max = ArraysUtils.getMax(arr);
        System.out.println("max = " + max);
    }
}
