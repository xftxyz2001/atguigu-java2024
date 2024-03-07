package com.atguigu.b_interface;

import java.util.function.Predicate;

public class Demo04Predicate {
    public static void main(String[] args) {
        method(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length()==7;
            }
        },"abcdefg");

        System.out.println("===================");

        method(s -> s.length()==7,"abcd");
    }
    public static void method(Predicate<String> predicate,String s){
        boolean test = predicate.test(s);
        System.out.println("test = " + test);
    }
}
