package com.atguigu.c_stream;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Demo01Stream {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("张三丰");
        list.add("张大彪");
        list.add("吕不韦");
        list.add("张三");
        list.add("赵姬");
        list.add("张翠山");
        list.add("嫪毐");

        //需求1:筛选出姓张的人
       /* ArrayList<String> listZhang = new ArrayList<>();
        for (String s : list) {
            if (s.startsWith("张")){
                listZhang.add(s);
            }
        }
        System.out.println(listZhang);*/

        //需求2:筛选出三个字的张姓人物
       /* ArrayList<String> listThree = new ArrayList<>();
        for (String s : listZhang) {
            if (s.length()==3){
                listThree.add(s);
            }
        }
        System.out.println(listThree);*/

        //需求3.遍历集合,将三个字姓张的打印出来
        /*for (String s : listThree) {
            System.out.println(s);
        }

        System.out.println("================");*/

        //将list转成Stream流对象
        Stream<String> stream = list.stream();
        /*stream.filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("张");
            }
        }).filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length()==3;
            }
        }).forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/

        System.out.println("======================");

        stream.filter(s -> s.startsWith("张")).filter(s -> s.length()==3).forEach(s -> System.out.println(s));
    }
}
