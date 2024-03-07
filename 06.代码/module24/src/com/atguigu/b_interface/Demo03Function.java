package com.atguigu.b_interface;

import java.util.function.Function;

public class Demo03Function {
    public static void main(String[] args) {
        method(new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                return integer+"";
            }
        },100);

        System.out.println("===================");
        method(integer -> integer+"",200);
    }

    public static void method(Function<Integer,String> function,Integer number){
        String s = function.apply(number);
        System.out.println("s = " + (s+1));
    }
}
