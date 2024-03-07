package com.atguigu.g_timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Demo01Timer {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("金莲对涛哥说:涛哥,快起床了~~~");
            }
        },new Date(),2000L);
    }
}
