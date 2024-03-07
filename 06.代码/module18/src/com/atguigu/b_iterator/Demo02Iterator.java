package com.atguigu.b_iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo02Iterator {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("楚雨荨");
        list.add("慕容云海");
        list.add("端木磊");
        list.add("上官瑞谦");
        list.add("叶烁");
        //获取迭代器对象
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
            //String element2 = iterator.next();
            //System.out.println(element2);
        }
    }
}
