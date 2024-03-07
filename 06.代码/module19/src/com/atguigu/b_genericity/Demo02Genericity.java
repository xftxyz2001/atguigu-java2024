package com.atguigu.b_genericity;

public class Demo02Genericity {
    public static void main(String[] args) {
        MyArrayList<String> list1 = new MyArrayList<>();
        list1.add("aaa");
        list1.add("bbb");
        System.out.println(list1);//直接输出对象名,默认调用toString

        System.out.println("===========");

        MyArrayList<Integer> list2 = new MyArrayList<>();
        list2.add(1);
        list2.add(2);
        Integer element = list2.get(0);
        System.out.println(element);
        System.out.println(list2);
    }
}
