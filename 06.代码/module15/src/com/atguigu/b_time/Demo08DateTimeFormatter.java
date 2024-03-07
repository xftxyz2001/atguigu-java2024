package com.atguigu.b_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

public class Demo08DateTimeFormatter {
    public static void main(String[] args) {
        //format();
        parse();
    }

    private static void parse() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String time = "2000-10-10 10:10:10";
        TemporalAccessor temporalAccessor = dtf.parse(time);
        //System.out.println(temporalAccessor);
        LocalDateTime localDateTime = LocalDateTime.from(temporalAccessor);
        System.out.println("localDateTime = " + localDateTime);
    }

    private static void format() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.now();
        String time = dtf.format(localDateTime);
        System.out.println("time = " + time);
    }
}
