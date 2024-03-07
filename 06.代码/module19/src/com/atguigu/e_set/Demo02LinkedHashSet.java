package com.atguigu.e_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Demo02LinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("张三");
        set.add("李四");
        set.add("王五");
        set.add("赵六");
        set.add("田七");
        set.add("张三");
        System.out.println(set);

        //迭代器
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("============");

        //增强for
        for (String s : set) {
            System.out.println(s);
        }
    }
}
