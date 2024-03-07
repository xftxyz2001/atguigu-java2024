package com.atguigu.b_time;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Demo02Calendar {
    public static void main(String[] args) {
        //calendar01();
        //calendar02();
        calendar03();
    }

    private static void calendar03() {
        //1.创建Calendar对象
        Calendar calendar = Calendar.getInstance();
        //2.创建Scanner对象,键盘录入一个年份
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        //3.调用set方法,传递年,月,日
        //set(年,2,1) -> 国外是0-11,所以设置成2月就是代表3月
        calendar.set(year,2,1);
        //4.将day减1天(3月1日减1天,就是2月最后一天,知道2月最后一天了,就知道是平年还是闰年了)
        calendar.add(Calendar.DATE,-1);
        int day = calendar.get(Calendar.DATE);
        //5.获取day判断平年还是闰年,输出结果
        if (day==29){
            System.out.println("闰年");
        }else{
            System.out.println("平年");
        }

    }

    private static void calendar02() {
        Calendar calendar = Calendar.getInstance();//多态
        //int get(int field) ->返回给定日历字段的值
        int year = calendar.get(Calendar.YEAR);
        System.out.println("year = " + year);
        //void set(int field, int value)  :将给定的日历字段设置为指定的值
        //calendar.set(Calendar.YEAR,2028);
        //System.out.println(calendar.get(Calendar.YEAR));
        //void add(int field, int amount) :根据日历的规则,为给定的日历字段添加或者减去指定的时间量
        calendar.add(Calendar.YEAR,-1);
        System.out.println(calendar.get(Calendar.YEAR));
        //Date getTime():将Calendar转成Date对象
        Date date = calendar.getTime();
        System.out.println("date = " + date);
    }

    private static void calendar01() {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
    }
}
