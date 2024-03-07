package com.atguigu.b_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Demo03Iterator {
    public static void main(String[] args) {
        //需求:定义一个集合,存储 唐僧,孙悟空,猪八戒,沙僧,遍历集合,如果遍历到猪八戒,往集合中添加一个白龙马
        ArrayList<String> list = new ArrayList<>();
        list.add("唐僧");
        list.add("孙悟空");
        list.add("猪八戒");
        list.add("沙僧");
        list.add("沙僧");
        list.add("沙僧");
        list.add("沙僧");
        list.add("沙僧");
        list.add("沙僧");
        list.add("沙僧");
        list.add("沙僧");

        //Iterator<String> iterator = list.iterator();
        ListIterator<String> listIterator = list.listIterator();
        while(listIterator.hasNext()){
            String element = listIterator.next();
            if ("猪八戒".equals(element)){
                listIterator.add("白龙马");
            }
        }
        System.out.println(list);
    }
}
