package com.atguigu.a_collections;

import java.util.ArrayList;
import java.util.Collections;

public class Demo01Collections {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //static <T> boolean addAll(Collection<? super T> c, T... elements)->批量添加元素
        Collections.addAll(list,"张三","李四","王五","赵六","田七","朱八");
        System.out.println(list);
        //static void shuffle(List<?> list) ->将集合中的元素顺序打乱
        Collections.shuffle(list);
        System.out.println(list);
        //static <T> void sort(List<T> list) ->将集合中的元素按照默认规则排序-> ASCII码表
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("c.举头望明月");
        list1.add("a.床前明月光");
        list1.add("d.低头思故乡");
        list1.add("b.疑是地上霜");
        Collections.sort(list1);
        System.out.println(list1);
    }
}
