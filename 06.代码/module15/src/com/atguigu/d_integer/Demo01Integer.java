package com.atguigu.d_integer;

public class Demo01Integer {
    public static void main(String[] args) {
        Integer i1 = new Integer(10);
        System.out.println("i1 = " + i1);

        Integer i2 = new Integer("10");
        System.out.println("i2 = " + i2);

        System.out.println("================");

        Boolean b1 = new Boolean("true");
        System.out.println("b1 = " + b1);

        Boolean b2 = new Boolean("false");
        System.out.println("b2 = " + b2);

        Boolean b3 = new Boolean("True");
        System.out.println("b3 = " + b3);
    }
}
