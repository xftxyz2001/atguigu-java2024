package com.atguigu.d_integer;

public class Demo03Integer {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(10);
        System.out.println("i1 = " + i1);

        int i = i1.intValue();
        System.out.println("(i+10) = " + (i + 10));
    }
}
