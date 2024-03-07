package com.atguigu.e_list_in_list;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * - JavaSE  集合 存储的是 学号 键，值学生姓名
 *   - 1  张三
 *   - 2  李四
 * - JavaEE 集合 存储的是 学号 键，值学生姓名
 *   - 1  王五
 *   - 2  赵六
 */
public class Demo03MapInMap {
    public static void main(String[] args) {
        //1.创建两个map集合
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1,"张三");
        map1.put(2,"李四");

        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(1,"王五");
        map2.put(2,"赵六");

        HashMap<String, HashMap<Integer, String>> map = new HashMap<>();
        map.put("javase",map1);
        map.put("javaee",map2);

        Set<Map.Entry<String, HashMap<Integer, String>>> set = map.entrySet();
        for (Map.Entry<String, HashMap<Integer, String>> entry : set) {
            HashMap<Integer, String> hashMap = entry.getValue();
            Set<Integer> set1 = hashMap.keySet();
            for (Integer key : set1) {
                System.out.println(key+"..."+hashMap.get(key));
            }
        }

    }
}
