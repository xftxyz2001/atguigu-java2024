package com.atguigu.c_list;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo06LinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("吕布");
        linkedList.add("刘备");
        linkedList.add("关羽");
        linkedList.add("张飞");
        linkedList.add("貂蝉");

        //public E pop():从此列表所表示的堆栈处弹出一个元素。
        linkedList.pop();
        System.out.println(linkedList);
        //public void push(E e):将元素推入此列表所表示的堆栈。
        linkedList.push("涛哥");
        System.out.println(linkedList);
    }
}
