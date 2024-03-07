package com.atguigu.c_stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Demo04Stream {
    public static void main(String[] args) {
        ArrayList<String> one = new ArrayList<>();
        one.add("迪丽热巴");
        one.add("宋远桥");
        one.add("苏星河");
        one.add("老子");
        one.add("庄子");
        one.add("孙子");
        one.add("洪七公");

        ArrayList<String> two = new ArrayList<>();
        two.add("古力娜扎");
        two.add("张无忌");
        two.add("张三丰");
        two.add("赵丽颖");
        two.add("张二狗");
        two.add("张天爱");
        two.add("张三");

        //将两个集合变成Stream流
        Stream<String> teamA = one.stream();
        Stream<String> teamB = two.stream();

        //Stream<String> listA = teamA.filter(s -> s.length() == 3).limit(3);
        //Stream<String> listB = teamB.filter(s -> s.startsWith("张")).skip(2);

        //合并
        Stream.concat(teamA.filter(s -> s.length() == 3).limit(3),teamB.filter(s -> s.startsWith("张")).skip(2)).forEach(s -> System.out.println(s));

    }
}
