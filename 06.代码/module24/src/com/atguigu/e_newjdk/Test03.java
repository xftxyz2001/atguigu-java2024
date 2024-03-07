package com.atguigu.e_newjdk;

import java.io.FileWriter;
import java.io.IOException;

public class Test03 {
    public static void main(String[] args) throws IOException {
        //method01();
        method02();
    }

    /**
     * jdk9开始
     * 为了减轻try的压力,可以将对象放到外面去new,然后将对象名,放到 try中
     * 而且依然能自动刷新和关流
     */
    private static void method02() throws IOException {
        FileWriter fw = new FileWriter("module24\\io.txt");
        try(fw){
            fw.write("你好");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * jdk8之前
     */
    private static void method01() {
        try(FileWriter fw = new FileWriter("module24\\io.txt")){
            fw.write("你好");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
