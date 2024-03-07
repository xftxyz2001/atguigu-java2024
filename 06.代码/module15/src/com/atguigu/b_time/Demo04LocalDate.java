package com.atguigu.b_time;

import java.time.LocalDate;

public class Demo04LocalDate {
    public static void main(String[] args) {
        //static LocalDate now()  -> 创建LocalDate对象
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate = " + localDate);
        //static LocalDate of(int year, int month, int dayOfMonth)  -> 创建LocalDate对象,设置年月日
        LocalDate localDate1 = LocalDate.of(2000, 10, 10);
        System.out.println("localDate1 = " + localDate1);
    }
}
