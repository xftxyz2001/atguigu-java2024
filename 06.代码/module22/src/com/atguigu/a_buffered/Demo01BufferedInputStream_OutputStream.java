package com.atguigu.a_buffered;

import java.io.*;

public class Demo01BufferedInputStream_OutputStream {
    public static void main(String[] args)throws Exception {
        //method01();
        method02();
    }

    //使用字节缓冲流复制文件
    private static void method02()throws Exception {
        long start = System.currentTimeMillis();

        FileInputStream fis = new FileInputStream("E:\\Idea\\io\\1.avi");
        FileOutputStream fos = new FileOutputStream("E:\\Idea\\io\\2.avi");

        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        //边读编写
        int len;
        while((len = bis.read())!=-1){
            bos.write(len);
        }

        long end = System.currentTimeMillis();

        System.out.println(end-start);
        new BufferedWriter(new FileWriter("")).close();
        bos.close();
        bis.close();
    }

    //用基本流复制文件
    private static void method01()throws Exception {
        long start = System.currentTimeMillis();

        FileInputStream fis = new FileInputStream("E:\\Idea\\io\\1.avi");
        FileOutputStream fos = new FileOutputStream("E:\\Idea\\io\\2.avi");
        //边读编写
        int len;
        while((len = fis.read())!=-1){
            fos.write(len);
        }

        long end = System.currentTimeMillis();

        System.out.println(end-start);

        fos.close();
        fis.close();
    }
}
