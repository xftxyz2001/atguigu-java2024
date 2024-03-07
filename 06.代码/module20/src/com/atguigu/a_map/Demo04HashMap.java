package com.atguigu.a_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo04HashMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("猪八", "嫦娥");
        map.put("猪八", "高翠兰");
        map.put("后裔","嫦娥");
        map.put("二郎神","嫦娥");
        map.put("唐僧","女儿国国王");
        map.put("涛哥","金莲");

        /*
          Set集合中保存的都是"结婚证"-> Map.Entry
          我们需要将"结婚证"从set集合中遍历出来
         */
        Set<Map.Entry<String, String>> set = map.entrySet();
        for (Map.Entry<String, String> entry : set) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"..."+value);
        }
    }
}
