package com.atguigu.a_exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo07Exception {
    public static void main(String[] args) {
        String s = null;
       /* try {
            add(s);//添加功能
        }catch (FileNotFoundException e){
            System.out.println(e);
        }catch (IOException e){
            System.out.println(e);
        }*/

        /*try {
            add(s);//添加功能
        }catch (IOException e){
            System.out.println(e);
        }*/

        try {
            add(s);//添加功能
        }catch (Exception e){
            e.printStackTrace();//将详细的异常信息打印到控制台上
        }
        delete();//删除功能
        update();//修改功能
        find();//查询功能
    }


    private static void add(String s) throws FileNotFoundException, IOException {
        if (s == null) {
            //故意造异常
            throw new IOException("IO异常");
        }
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
