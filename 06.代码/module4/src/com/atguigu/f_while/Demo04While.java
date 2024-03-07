package com.atguigu.f_while;

public class Demo04While {
    public static void main(String[] args) {
        int count = 0;
        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0) {
                count++;
            }
            i++;
        }
        System.out.println("count = " + count);
    }
}
