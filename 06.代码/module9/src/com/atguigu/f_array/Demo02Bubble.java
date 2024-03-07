package com.atguigu.f_array;

public class Demo02Bubble {
    public static void main(String[] args) {
        //定义一个数组,长度为5,最大索引为4
        int[] arr = {5,4,3,2,1};

        /*
           第一圈
             越界原因:当i变化到4的时候-> arr[4]>arr[5] -> 直接操作了5索引,所以越界了
             越界解决:我们可以让arr.length-1
                     如果arr.length-1-> 比较就是i<4 -> 此时i最大可以变化到3
                     当i变化到3时 -> arr[3]>arr[4] -> 正好是最后两个元素进行比较
         */
        /*for (int i = 0; i < arr.length-1-0; i++) {
            if (arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }*/

        //第二圈
        /*for (int i = 0; i < arr.length-1-1; i++) {
            if (arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }*/

        //第三圈
        /*for (int i = 0; i < arr.length-1-2; i++) {
            if (arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }*/

        //第四圈
        /*for (int i = 0; i < arr.length-1-3; i++) {
            if (arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }*/


        /*
           外层循环代表比较了几圈
           n-1圈
         */
        for (int j = 0; j < arr.length-1; j++) {
            /*
              内层循环代表每一圈比较的次数
              每圈都少比较一次
             */
            for (int i = 0; i < arr.length-1-j; i++) {
                if (arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
