package com.atguigu.a_map;

import java.util.LinkedHashMap;

public class Demo02LinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("八戒","嫦娥");
        map.put("涛哥","金莲");
        map.put("涛哥","三上");
        map.put("唐僧","女儿国国王");
        System.out.println(map);
    }
}
