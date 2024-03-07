package com.atguigu.b_method;

/*
  在main方法中定义一个数组,将数组传递到另外一个方法中,在此方法中遍历数组
 */
public class Demo04Method {
    public static void main(String[] args) {
       int[] arr1 = {1,2,3};
       method(arr1);
    }

    /*
       调用method方法,传递的实参时int[]数组
       所以形参也应该用int型数组来接收
     */
    public static void method(int[] arr2){//int[] arr2 = arr1
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }

}
