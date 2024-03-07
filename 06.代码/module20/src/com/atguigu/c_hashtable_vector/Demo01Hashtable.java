package com.atguigu.c_hashtable_vector;

import java.util.Hashtable;

public class Demo01Hashtable {
    public static void main(String[] args) {
        Hashtable<String, String> table = new Hashtable<>();
        table.put("迪丽热巴","马尔扎哈");
        table.put("古力娜扎","涛哥思密达");
        table.put("古力娜扎","雷霆嘎巴");
        table.put("玛卡巴卡","哈哈哈哈");
        //table.put(null,null);
        System.out.println(table);
    }
}
