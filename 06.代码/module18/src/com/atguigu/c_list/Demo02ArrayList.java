package com.atguigu.c_list;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo02ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("铁胆火车侠");
        list.add("喜洋洋");
        list.add("火影忍者");
        list.add("灌篮高手");
        list.add("网球王子");

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("=====================");

        for (int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        System.out.println("=====================");
        /*
           遍历带有索引集合的快捷键
             集合名.fori
         */
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
