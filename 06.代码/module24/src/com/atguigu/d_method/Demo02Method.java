package com.atguigu.d_method;

import java.util.function.Supplier;

public class Demo02Method {
    public static void main(String[] args) {
        method(new Supplier<String>() {
            /*
               get为重写方法:无参的,返回值为String
               trim方法在get中:无参的,返回值为String
               考虑使用方法引用
             */
            @Override
            public String get() {
                return " abc ".trim();
            }
        });

        System.out.println("================");

        method(()->" abc ".trim());

        System.out.println("================");
        method(" abc "::trim);
    }

    public static void method(Supplier<String> supplier){
        String s = supplier.get();
        System.out.println("s = " + s);
    }
}
