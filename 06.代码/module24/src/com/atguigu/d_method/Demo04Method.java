package com.atguigu.d_method;

import java.util.function.Function;

public class Demo04Method {
    public static void main(String[] args) {
        method(new Function<String, Person>() {
            /*
              apply为重写方法:  有一个String的参数,返回值类型为Person对象
              new Person(s) : 一个String参数的构造,类型为String,返回值类型Person类型
             */
            @Override
            public Person apply(String s) {
                return new Person(s);
            }
        },"涛哥");

        method(s -> new Person(s),"金莲");

        method(Person::new,"三上");
    }
    public static void method(Function<String,Person> function,String name){
        Person person = function.apply(name);
        System.out.println(person);
    }
}
