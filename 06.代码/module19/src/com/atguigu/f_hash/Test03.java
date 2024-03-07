package com.atguigu.f_hash;

import java.util.HashSet;

public class Test03 {
    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<>();
        set.add(new Person("涛哥",16));
        set.add(new Person("金莲",24));
        set.add(new Person("涛哥",16));
        System.out.println(set);
    }
}
