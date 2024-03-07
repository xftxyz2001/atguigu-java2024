package com.atguigu.b_method;

public class Demo05Method {
    public static void main(String[] args) {
        int[] arr2 = method();//int[] arr2 = arr1
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }

    public static int[] method(){
        int a = 10;
        int b = 20;
        int sum = a+b;

        int sub = a-b;

        int[] arr1 = {sum,sub};
        return arr1;//返回的是一个int[],那么返回值类型也应该是int[]
    }
}
