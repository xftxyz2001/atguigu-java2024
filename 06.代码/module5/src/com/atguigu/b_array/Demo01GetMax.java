package com.atguigu.b_array;

public class Demo01GetMax {
    public static void main(String[] args) {
        int[] arr = {5,4,5,6,6,7,8,9};
        //1.定义一个max,接收两个元素比较之后的较大值
        int max = arr[0];
        //2.遍历数组,将每一个元素获取出来进行比较
        for (int i = 1; i < arr.length; i++) {
        //3.判断,如果max小于遍历出来的元素,证明遍历出来的元素大,就将大的重新赋值给max
            if (max<arr[i]){
                max = arr[i];
            }
        }
        //4.直接输出max
        System.out.println("max = " + max);
    }
}
