package com.atguigu.b_time;

import java.time.LocalDateTime;

public class Demo05LocalDateTime {
    public static void main(String[] args) {
        //static LocalDateTime now()  创建LocalDateTime对象
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime = " + localDateTime);
        //static LocalDateTime of(int year, Month month, int dayOfMonth, int hour, int minute, int second) 创建LocalDateTime对象,设置年月日时分秒
        LocalDateTime localDateTime1 = LocalDateTime.of(2000, 10, 10, 10, 10, 10);
        System.out.println("localDateTime1 = " + localDateTime1);
    }
}
