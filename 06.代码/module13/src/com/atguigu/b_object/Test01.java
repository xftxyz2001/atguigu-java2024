package com.atguigu.b_object;

import java.util.ArrayList;

public class Test01 {
    public static void main(String[] args) {
        Person p1 = new Person("金莲", 26);
        System.out.println(p1);//com.atguigu.b_object.Person@4eec7777
        System.out.println(p1.toString());//com.atguigu.b_object.Person@4eec7777

        System.out.println("==============");

        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        System.out.println(list);//[张三, 李四, 王五]
        System.out.println(list.toString());//[张三, 李四, 王五]
    }
}
