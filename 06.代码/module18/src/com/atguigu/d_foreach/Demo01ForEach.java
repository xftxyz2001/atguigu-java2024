package com.atguigu.d_foreach;

import java.util.ArrayList;

public class Demo01ForEach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("=====================");

        int[] arr = {1,2,3,4,5};
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
