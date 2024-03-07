package com.atguigu.b_array;

public class Demo07Array {
    public static void main(String[] args) {
        int[] oldArr = {1,2,3,4,5};
        //创建新数组
        int[] newArr = new int[10];

        //将老数组中的元素复制到新数组中
        for (int i = 0; i < oldArr.length; i++) {
            newArr[i] = oldArr[i];
        }

        //将新数组的地址值给老数组
        oldArr = newArr;

       // System.out.println(oldArr.length);

        for (int i = 0; i < oldArr.length; i++) {
            System.out.println(oldArr[i]);
        }
    }
}
