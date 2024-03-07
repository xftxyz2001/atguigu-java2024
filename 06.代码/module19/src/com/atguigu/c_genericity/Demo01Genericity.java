package com.atguigu.c_genericity;


import java.util.ArrayList;

public class Demo01Genericity {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("张三");
        list1.add("李四");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);

        method(list1);
        method(list2);
    }

    public static void method(ArrayList<?> list){
        for (Object o : list) {
            System.out.println(o);
        }
    }

}
