package com.atguigu.a_array;

public class Demo03Array {
    public static void main(String[] args) {
        //定义一个数组
        int[] arr = new int[3];
        arr[0] = 100;//将100存到了arr这个数组的0索引上
        arr[1] = 200;//将200存到了arr这个数组的1索引上
        arr[2] = 300;//将300存到了arr这个数组的2索引上
        //arr[3] = 400;  上面的数组长度为3,最大索引为2,没有3索引,所以不能操作不存在的索引

        System.out.println("=======================");

        String[] arr2 = new String[3];
        arr2[0] = "张三";
        arr2[1] = "李四";
        arr2[2] = "王五";
    }
}
