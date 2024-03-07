package com.atguigu.a_collections;

import java.util.ArrayList;
import java.util.Collections;

public class Demo03Collections {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("涛哥",100));
        list.add(new Student("柳岩",150));
        list.add(new Student("三上",80));
        Collections.sort(list);
        System.out.println(list);
    }
}
