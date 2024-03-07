package com.atguigu.d_array;

public class Demo05Array {
    public static void main(String[] args) {
        String[][] arr = new String[2][2];
        arr[0][0] = "张飞";
        arr[0][1] = "李逵";
        arr[1][0] = "刘备";
        arr[1][1] = "宋江";

       //遍历二维数组
        for (int i = 0; i < arr.length; i++) {
            /*
               arr[i]代表的就是每一个一维数组
             */
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}
