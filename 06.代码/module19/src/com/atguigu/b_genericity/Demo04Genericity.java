package com.atguigu.b_genericity;

import java.util.ArrayList;

public class Demo04Genericity {
    public static void main(String[] args) {
        MyArrayList1<String> list1 = new MyArrayList1<>();
        list1.add("张三");
        list1.add("李四");
        System.out.println(list1.get(0));

    }
}
