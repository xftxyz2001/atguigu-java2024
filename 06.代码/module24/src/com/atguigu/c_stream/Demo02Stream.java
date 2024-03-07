package com.atguigu.c_stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Demo02Stream {
    public static void main(String[] args) {
        //1.针对集合:Collection中的方法
        //Stream<E> stream()
        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        Stream<String> stream = list.stream();
        System.out.println(stream);

        //2.针对数组:Stream接口中的静态方法:
        //static <T> Stream<T> of(T... values)
        Stream<String> stream1 = Stream.of("金莲", "三上", "松下");
        System.out.println(stream1);
    }
}
