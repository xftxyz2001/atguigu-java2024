package com.atguigu.f_array;

public class Demo03Binary {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int index = binary(arr, 60);
        System.out.println(index);
    }

    public static int binary(int[] arr,int data){
        //定义一个变量,此变量用来表示是否有要查找的数据
        int flag = 0;

        //3.遍历数组,在遍历的过程中判断是否和录入的数相等,如果相等,输出索引
        for (int i = 0; i < arr.length; i++) {
            if (data==arr[i]){
                flag++;
                return i;
            }
        }
        return -1;
    }
}
