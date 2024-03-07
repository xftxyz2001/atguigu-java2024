package com.atguigu.b_time;

import java.time.LocalDate;

public class Demo06LocalDate {
    public static void main(String[] args) {
        //get();
        //with();
        plusAndMinus();
    }

    /*
      向后偏移 -> plus开头方法
      向前偏移 -> minus开头方法
     */
    private static void plusAndMinus() {
        LocalDate localDate = LocalDate.now();
       // LocalDate localDate1 = localDate.plusYears(1L);
       // System.out.println("localDate1 = " + localDate1);
        LocalDate localDate1 = localDate.minusYears(1L);
        System.out.println("localDate1 = " + localDate1);

    }

    private static void with() {
        LocalDate localDate = LocalDate.now();
        //LocalDate withYear(int year):设置年份
        //LocalDate localDate1 = localDate.withYear(2000);
        //System.out.println(localDate1);

        //LocalDate withMonth(int month):设置月份
        //LocalDate localDate2 = localDate1.withMonth(10);
        //System.out.println("localDate2 = " + localDate2);
        //LocalDate withDayOfMonth(int day):设置月中的天数

        //LocalDate localDate3 = localDate2.withDayOfMonth(10);
        //System.out.println("localDate3 = " + localDate3);

        LocalDate localDate1 = localDate.withYear(2000).withMonth(10).withDayOfMonth(10);
        System.out.println("localDate1 = " + localDate1);
    }

    private static void get() {
        LocalDate localDate = LocalDate.now();
        //int getYear()->获取年份
        System.out.println(localDate.getYear());
        //int getMonthValue()->获取月份
        System.out.println(localDate.getMonthValue());
        //int getDayOfMonth()->获取月中的第几天
        System.out.println(localDate.getDayOfMonth());
    }
}
