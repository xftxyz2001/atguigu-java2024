package com.atguigu.c_staticutils;

public class ArraysUtils {
    /*
       构造方法用private修饰

       工具类中的成员都是静态的,静态成员都是类名调用,不需要new对象
       所以工具类中的构造方法都是用private修饰

       如果构造方法被private修饰,那么在别的类中,就不能利用构造方法new对象
     */
    private ArraysUtils(){

    }


    //定义一个方法,实现获取int数组最大值
    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max<arr[i]){
                max = arr[i];
            }
        }

        return max;
    }
}
