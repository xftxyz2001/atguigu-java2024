package com.atguigu.a_exception;

import java.io.FileNotFoundException;

public class Demo04Exception {
    public static void main(String[] args)throws FileNotFoundException {
        String s = "a.txt1";
        add(s);//添加功能
        delete();//删除功能
        update();//修改功能
        find();//查询功能
    }


    private static void add(String s)throws FileNotFoundException {
        if (!s.endsWith(".txt")) {
            //故意创建异常
            throw new FileNotFoundException("文件找不到");
        }
        System.out.println("我要执行了");
    }

    private static void find() {
        System.out.println("查询功能");
    }

    private static void update() {
        System.out.println("修改功能");
    }

    private static void delete() {
        System.out.println("删除功能");
    }

}
