package com.atguigu.b_genericity;

import java.util.ArrayList;

public class ListUtils {
    //定义一个静态方法addAll,添加多个集合的元素
    public static <E> void addAll(ArrayList<E> list,E...e){
        for (E element : e) {
            list.add(element);
        }
    }

}
