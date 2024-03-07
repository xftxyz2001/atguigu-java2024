package com.atguigu.a_math;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Demo03BigDecimal {
    public static void main(String[] args) {
        //big01();
        //big02();
        //big03();
        big04();
    }

    private static void big04() {
        BigDecimal b1 = new BigDecimal("3.55");
        BigDecimal b2 = new BigDecimal("2.12");
        BigDecimal divide = b1.divide(b2, 2, RoundingMode.HALF_UP);
        System.out.println("divide = " + divide);
    }

    private static void big03() {
        BigDecimal b1 = new BigDecimal("3.55");
        BigDecimal b2 = new BigDecimal("2.12");
        BigDecimal divide = b1.divide(b2, 2, BigDecimal.ROUND_UP);
        System.out.println("divide = " + divide);
        double v = divide.doubleValue();
        System.out.println("v = " + v);
    }

    private static void big02() {
        BigDecimal b1 = new BigDecimal("3.55");
        //BigDecimal b2 = new BigDecimal("2.12");
        BigDecimal b2 = BigDecimal.valueOf(2.12);

        //BigDecimal add(BigDecimal val)  返回其值为 (this + val) 的 BigDecimal
        BigDecimal add = b1.add(b2);
        System.out.println("add = " + add);
        //BigDecimal subtract(BigDecimal val) 返回其值为 (this - val) 的 BigDecimal
        BigDecimal subtract = b1.subtract(b2);
        System.out.println("subtract = " + subtract);
        //BigDecimal multiply(BigDecimal val)  返回其值为 (this * val) 的 BigDecimal
        BigDecimal multiply = b1.multiply(b2);
        System.out.println("multiply = " + multiply);
        //BigDecimal divide(BigDecimal val)    返回其值为 (this / val) 的 BigDecimal
        BigDecimal divide = b1.divide(b2);
        System.out.println("divide = " + divide);

    }

    private static void big01() {
        float a = 3.55F;
        float b = 2.12F;

        float result = a-b;
        System.out.println("result = " + result);//1.4300001
    }
}
