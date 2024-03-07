package com.atguigu.arithmetic;

public class Demo01Arithmetic {
    public static void main(String[] args) {
        int i = 10;
        int j = 3;
        int add = i+j;//推荐使用
        System.out.println(add);//13
        System.out.println(i+j);//13

        int sub = i-j;
        System.out.println(sub);//7

        int mul = i*j;
        System.out.println(mul);//30

        int div = i/j;
        System.out.println(div);//3

        int mo = i%j;
        System.out.println(mo);//1
    }
}
