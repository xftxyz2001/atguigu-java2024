package com.atguigu.a_private;

import java.util.Arrays;

public class Test01 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        /*
           找来了Arrays这个对象,调用了toString的方法,实现功能-> 这种编程思想(面向对象)

           将实现toString功能的细节代码封装到了toString方法中,外界不能直接使用这些细节了

           但是对外提供了一个公共的接口,供外界间接使用封装起来的细节-> toString方法名

         */
        System.out.println(Arrays.toString(arr));
    }
}
