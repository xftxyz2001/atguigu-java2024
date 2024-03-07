package com.atguigu.a_math;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Demo02BigInteger {
    public static void main(String[] args) {
        BigInteger b1 = new BigInteger("121212121212121212121212121212121212121");
        BigInteger b2 = new BigInteger("121212121212121212121212121212121212121");
        //BigInteger add(BigInteger val)  返回其值为 (this + val) 的 BigInteger
        System.out.println(b1.add(b2));
        //BigInteger subtract(BigInteger val) 返回其值为 (this - val) 的 BigInteger
        System.out.println(b1.subtract(b2));
        //BigInteger multiply(BigInteger val)  返回其值为 (this * val) 的 BigInteger
        System.out.println(b1.multiply(b2));
        //BigInteger divide(BigInteger val)    返回其值为 (this / val) 的 BigInteger
        System.out.println(b1.divide(b2));

    }
}
