package com.atguigu.g_ioexception;

import java.io.FileWriter;

public class Demo02Exception {
    public static void main(String[] args) {
        try(FileWriter fw = new FileWriter("module21\\4.txt");){
            fw.write("你好");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
