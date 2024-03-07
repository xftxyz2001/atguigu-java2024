package com.atguigu.b_method;

import java.util.Scanner;

public class Demo02Method {
    public static void main(String[] args) {
        int result = method();
        System.out.println("result = " + result);
    }

    public static int method() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum+=i;
        }
        return sum;
    }
}
