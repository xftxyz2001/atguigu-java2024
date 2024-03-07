package com.atguigu.b_genericity;

import java.util.ArrayList;

public class Demo03Genericity {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ListUtils.addAll(list1,"a","b","c");
        System.out.println(list1);

        System.out.println("================");

        ArrayList<Integer> list2 = new ArrayList<>();
        ListUtils.addAll(list2,1,2,3,4,5);
        System.out.println(list2);
    }
}
