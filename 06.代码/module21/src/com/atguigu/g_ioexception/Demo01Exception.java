package com.atguigu.g_ioexception;

import java.io.FileWriter;
import java.io.IOException;

public class Demo01Exception {
    public static void main(String[] args) {
        FileWriter fw = null;
        try{
            fw = new FileWriter("module21\\3.txt");
            fw.write("你好");

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //如果fw不为null,证明new出来了所以需要close;相反不需要close
            if (fw!=null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
