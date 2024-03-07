package com.atguigu.a_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo02Collections {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("柳岩",18));
        list.add(new Person("涛哥",16));
        list.add(new Person("金莲",20));

        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });

        System.out.println(list);
    }
}
