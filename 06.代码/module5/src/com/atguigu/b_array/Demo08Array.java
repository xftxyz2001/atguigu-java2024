package com.atguigu.b_array;

public class Demo08Array {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};

        //创建新数组
        int[] newArr = new int[arr1.length+arr2.length];

        //先将arr1的元素放到newArr中
        for (int i = 0; i < arr1.length; i++) {
            newArr[i] = arr1[i];
        }

        /*
           由于已经保存了arr1的三个元素
           所以我们保存arr2元素时,就不能从newArr的索引0开始了,不然从arr1中保存的元素会被arr2的元素
           覆盖

           arr2的元素需要从newArr的索引3开始保存
         */

        //先获取arr1的长度为3
        int len = arr1.length;//3

        for (int i = 0; i < arr2.length; i++) {
            /*
               i = 0时    newArr[3+0] = arr2[0]
               i = 1时    newArr[3+1] = arr2[1]
               i = 2时    newArr[3+2] = arr2[2]

             */
            newArr[len+i] = arr2[i];
        }

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]+" ");
        }
    }
}
