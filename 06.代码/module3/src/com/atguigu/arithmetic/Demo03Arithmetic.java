package com.atguigu.arithmetic;

public class Demo03Arithmetic {
    public static void main(String[] args) {
        int i = 10;
        //i++;
        ++i;
        System.out.println("i = " + i);

        System.out.println("==================");

        int j = 100;
        int result01 = ++j;
        System.out.println("result01 = " + result01);//101
        System.out.println(j);//101

        System.out.println("==================");
        int k = 10;
        int result02 = k++;
        System.out.println("result02 = " + result02);
        System.out.println(k);

        System.out.println("==================");

        int z = 100;
        System.out.println(z++);
        System.out.println(z);

        System.out.println("==================");

        int x = 10;
        int y = 20;

        /*
           10+19 = 29
           29+12 = 41

           以后开发肯定不会这么写
         */

        int result03 = x++ + --y + ++x;
        System.out.println("result03 = " + result03);

        System.out.println("=======================");

        int c = 10;
        c = c++;
        System.out.println(c);//10
        System.out.println(c);//10

    }
}
