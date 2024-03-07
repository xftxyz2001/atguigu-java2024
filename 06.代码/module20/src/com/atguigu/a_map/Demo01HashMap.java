package com.atguigu.a_map;

import java.util.Collection;
import java.util.HashMap;

public class Demo01HashMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        //V put(K key, V value)  -> 添加元素,返回的是被覆盖的value
        String value1 = map.put("猪八", "嫦娥");
        System.out.println(value1);
        String value2 = map.put("猪八", "高翠兰");
        System.out.println(value2);
        System.out.println(map);

        map.put("后裔","嫦娥");
        map.put("二郎神","嫦娥");
        map.put("唐僧","女儿国国王");
        map.put("涛哥","金莲");
        map.put(null,null);
        System.out.println(map);

        //V remove(Object key)  ->根据key删除键值对,返回的是被删除的value
        String value3 = map.remove("涛哥");
        System.out.println(value3);
        System.out.println(map);
        //V get(Object key) -> 根据key获取value
        System.out.println(map.get("唐僧"));
        //boolean containsKey(Object key)  -> 判断集合中是否包含指定的key
        System.out.println(map.containsKey("二郎神"));
        //Collection<V> values() -> 获取集合中所有的value,转存到Collection集合中
        Collection<String> collection = map.values();
        System.out.println(collection);
    }
}
