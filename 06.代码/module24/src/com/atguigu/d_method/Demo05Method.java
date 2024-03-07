package com.atguigu.d_method;

import java.util.function.Function;

public class Demo05Method {
    public static void main(String[] args) {
        method(new Function<Integer, int[]>() {
            /*
              apply:重写的方法,参数为Integer型,返回值类型为int[]
              new int[integer]: [integer]看成参数,参数为Integer型,返回值int[]
             */
            @Override
            public int[] apply(Integer integer) {
                return new int[integer];
            }
        },10);

        System.out.println("=================");

        method(integer-> new int[integer],10);

        System.out.println("==================");

        method(int[]::new,10);
    }

    public static void method(Function<Integer,int[]> function,Integer len){
        int[] arr = function.apply(len);
        System.out.println(arr.length);
    }
}
