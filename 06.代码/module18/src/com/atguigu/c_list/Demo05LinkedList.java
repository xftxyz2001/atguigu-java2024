package com.atguigu.c_list;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo05LinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("吕布");
        linkedList.add("刘备");
        linkedList.add("关羽");
        linkedList.add("张飞");
        linkedList.add("貂蝉");
        System.out.println(linkedList);

        linkedList.addFirst("孙尚香");
        System.out.println(linkedList);

        linkedList.addLast("董卓");
        System.out.println(linkedList);

        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());

        linkedList.removeFirst();
        System.out.println(linkedList);

        linkedList.removeLast();
        System.out.println(linkedList);

        System.out.println("======================");

        Iterator<String> iterator = linkedList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("=======================");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
    }
}
