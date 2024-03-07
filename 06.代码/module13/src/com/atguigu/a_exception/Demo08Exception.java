package com.atguigu.a_exception;

import java.io.FileNotFoundException;

public class Demo08Exception {
    public static void main(String[] args){
        String s = "a.txt";
        try {
            add(s);//添加功能
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            System.out.println("我必须滴执行");
        }
    }


    private static void add(String s)throws FileNotFoundException {
        if (!s.endsWith(".txt")) {
            //故意创建异常
            throw new FileNotFoundException("文件找不到");
        }
        System.out.println("我要执行了");
    }
}
