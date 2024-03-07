package com.atguigu.a_array;

public class Demo07Array {
    public static void main(String[] args) {
        int[] arr = new int[3];
        System.out.println(arr);//地址值
        System.out.println(arr[0]);//默认值0
        System.out.println(arr[1]);//默认值0
        System.out.println(arr[2]);//默认值0

        //存数据
        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;

        System.out.println(arr[0]);//100
        System.out.println(arr[1]);//200
        System.out.println(arr[2]);//300

        System.out.println("======================");

        String[] arr2 = new String[3];
        System.out.println(arr2);
        System.out.println(arr2[0]);//默认值null
        System.out.println(arr2[1]);//默认值null
        System.out.println(arr2[2]);//默认值null

        arr2[0] = "张无忌";
        arr2[1] = "张三丰";
        arr2[2] = "张翠山";
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);

        System.out.println("==========遍历arr数组========");

        //数组多长,就循环多少次
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("=========遍历arr2数组=======");
        /*
          快捷键
            数组名.fori
         */

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
