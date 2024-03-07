package com.atguigu.a_map;

import java.util.HashMap;

public class Demo05HashMap {
    public static void main(String[] args) {
        HashMap<Person, String> map = new HashMap<>();
        map.put(new Person("涛哥",18),"河北省");
        map.put(new Person("三上",26),"日本");
        map.put(new Person("涛哥",18),"北京市");
        System.out.println(map);
    }
}
