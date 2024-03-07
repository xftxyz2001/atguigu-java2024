package com.atguigu.b_tree;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo01TreeSet {
    public static void main(String[] args) {
        TreeSet<String> set1 = new TreeSet<>();
        set1.add("c.白毛浮绿水");
        set1.add("a.鹅鹅鹅");
        set1.add("b.曲项向天歌");
        set1.add("d.红掌拨清波");
        System.out.println(set1);

        System.out.println("=====================");
        TreeSet<Person> set2 = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        set2.add(new Person("柳岩",18));
        set2.add(new Person("涛哥",12));
        set2.add(new Person("三上",20));
        System.out.println(set2);
    }
}
