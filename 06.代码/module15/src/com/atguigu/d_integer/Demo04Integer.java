package com.atguigu.d_integer;

public class Demo04Integer {
    public static void main(String[] args) {
        Integer i = 10;//发生了自动装箱了
        Integer sum = i+10;//发生了自动拆箱装箱
        System.out.println("sum = " + sum);
    }
}
