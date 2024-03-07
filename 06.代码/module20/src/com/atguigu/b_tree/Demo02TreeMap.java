package com.atguigu.b_tree;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.Vector;

public class Demo02TreeMap {
    public static void main(String[] args) {
        TreeMap<String, String> map1 = new TreeMap<>();
        map1.put("c","白毛浮绿水");
        map1.put("a","鹅鹅鹅");
        map1.put("b","曲项向天歌");
        map1.put("d","红掌拨清波");
        System.out.println(map1);

        System.out.println("=============");

        TreeMap<Person, String> map2 = new TreeMap<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });

        map2.put(new Person("柳岩",18),"北京");
        map2.put(new Person("涛哥",12),"北京");
        map2.put(new Person("三上",20),"北京");
        System.out.println(map2);

        new Vector<>(10).add("");
    }
}
