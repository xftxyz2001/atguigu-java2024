package com.atguigu.b_time;

import java.util.Calendar;
import java.util.Date;

public class Demo01Date {
    public static void main(String[] args) {
        date01();
        //date02();
    }

        private static void date02() {
            Date date = new Date();
            //1.void setTime(long time) -> 设置时间,传递毫秒值-> 从时间原点开始算
            date.setTime(1000L);
            //2.long getTime()->获取时间,返回毫秒值
            System.out.println(date.getTime());
        }

    private static void date01() {
        //Date() -> 获取当前系统时间
        Date date1 = new Date();
        System.out.println("date1 = " + date1);
        //Date(long time) -> 获取指定时间,传递毫秒值 -> 从时间原点开始算
        Date date2 = new Date(1000L);
        System.out.println("date2 = " + date2);
    }
}
