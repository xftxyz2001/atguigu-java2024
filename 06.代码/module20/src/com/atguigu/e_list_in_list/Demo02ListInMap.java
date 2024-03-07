package com.atguigu.e_list_in_list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *   1班级有第三名同学，
 *   学号和姓名分别为：1=张三，2=李四，3=王五，
 *   2班有三名同学，
 *   学号和姓名分别为：1=黄晓明，2=杨颖，3=刘德华,
 *   请将同学的信息以键值对的形式存储到2个Map集合中，在将2个Map集合存储到List集合中。
 */
public class Demo02ListInMap {
    public static void main(String[] args) {
        //1.创建两个map集合
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1,"张三");
        map1.put(2,"李四");
        map1.put(3,"王五");

        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(1,"黄晓明");
        map2.put(2,"杨颖");
        map2.put(3,"刘德华");

        //2.创建一个存储map集合的list集合
        ArrayList<HashMap<Integer, String>> list = new ArrayList<>();
        list.add(map1);
        list.add(map2);

        //3.先遍历list集合,再遍历map集合
        for (HashMap<Integer, String> map : list) {
            Set<Map.Entry<Integer, String>> set = map.entrySet();
            for (Map.Entry<Integer, String> entry : set) {
                System.out.println(entry.getKey()+"..."+entry.getValue());
            }
        }
    }
}
