package com.atguigu.d_method;

import java.util.function.Supplier;

public class Demo03Method {
    public static void main(String[] args) {
        method(new Supplier<Double>() {
            /*
               get:无参,返回值类型为double
               random():无参,返回值类型为double
             */
            @Override
            public Double get() {
                return Math.random();
            }
        });
        System.out.println("==================");

        method(()->Math.random());

        System.out.println("==================");

        method(Math::random);
    }
    public static void method(Supplier<Double> supplier){
        Double aDouble = supplier.get();
        System.out.println("aDouble = " + aDouble);
    }
}
