package com.atguigu.d_method;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class Demo01Method {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("明日", "三上", "金莲", "松下", "有菜");

        /*
           accept是重写方法:  参数类型为String
                            无返回值

           accept方法里面有println方法:println参数类型为String,被引用的方法操作重写方法的参数值
                                    println没有返回值
         */
       /* stream.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/

        System.out.println("===================");
        //stream.forEach(s -> System.out.println(s));
        System.out.println("===================");
        stream.forEach(System.out::println);
    }
}
