package com.atguigu.c_stream;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo03Stream {
    public static void main(String[] args) {
        //foreach();
        //count();
        //filter();
        //limit();
        //skip();
        //concat();
        //collect();
        //distinct();
        //map();
    }

    /**
     * 转换流中的类型
     */
    private static void map() {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6);
        stream.map(new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                return integer+"";
            }
        }).forEach(s -> System.out.println(s+1));
    }

    /**
     * 去重复元素
     * 被去重的元素底层需要重写hashCode和equals方法
     */
    private static void distinct() {
        //Stream<String> stream1 = Stream.of("金莲", "三上", "松下","柳岩","张无忌","张无忌");
        //stream1.distinct().forEach(s -> System.out.println(s));

        Stream<Person> stream = Stream.of(new Person("张三", 10), new Person("李四", 12), new Person("张三", 10));
        stream.distinct().forEach(person -> System.out.println(person));
    }

    /**
     * 流转集合
     */
    private static void collect() {
        Stream<String> stream1 = Stream.of("金莲", "三上", "松下","柳岩","张无忌");
        List<String> list = stream1.collect(Collectors.toList());
        System.out.println(list);
    }

    /**
     *  流合并,是一个静态方法
     */
    private static void concat() {
        Stream<String> stream1 = Stream.of("金莲", "三上", "松下","柳岩","张无忌");
        Stream<String> stream2 = Stream.of("涛哥", "涛哥1", "涛哥2","涛哥3");

        Stream.concat(stream1, stream2).forEach(s -> System.out.println(s));

    }

    /**
     * 跳过前n个元素
     */
    private static void skip() {
        Stream<String> stream1 = Stream.of("金莲", "三上", "松下","柳岩","张无忌");
        stream1.skip(2).forEach(s -> System.out.println(s));
    }

    /**
     * 获取前几个元素
     */
    private static void limit() {
        Stream<String> stream1 = Stream.of("金莲", "三上", "松下","柳岩","张无忌");
        stream1.limit(3).forEach(s -> System.out.println(s));
    }

    private static void filter() {
        Stream<String> stream1 = Stream.of("金莲", "三上", "松下","柳岩","张无忌");
        /*stream1.filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() == 2;
            }
        }).forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/

        System.out.println("============");

        stream1.filter(s -> s.length()==2).forEach(s -> System.out.println(s));


    }

    /**
     * 统计元素个数
     */
    private static void count() {
        Stream<String> stream1 = Stream.of("金莲", "三上", "松下","柳岩");
        long count = stream1.count();
        System.out.println("count = " + count);
    }

    /**
     * 逐一处理,可以用来遍历
     */
    private static void foreach() {
        Stream<String> stream1 = Stream.of("金莲", "三上", "松下");
       /* stream1.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/
        System.out.println("==============");

        stream1.forEach(s-> System.out.println(s));
    }
}
