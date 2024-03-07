package com.atguigu.a_map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Demo03HashMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("猪八", "嫦娥");
        map.put("猪八", "高翠兰");
        map.put("后裔","嫦娥");
        map.put("二郎神","嫦娥");
        map.put("唐僧","女儿国国王");
        map.put("涛哥","金莲");

        Set<String> set = map.keySet();//获取所有的key,保存到set集合中
        for (String key : set) {
            //根据key获取value
            System.out.println(key+".."+map.get(key));
        }

    }
}
