package com.atguigu.b_output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01FileOutputStream {
    public static void main(String[] args) throws IOException {
        //method01();
        //method02();
        //method03();
        //method04();
        method05();
    }

    /*
      FileOutputStream(String name, boolean append)
                   append:true -> 会实现续写追加,文件不覆盖了
     */
    private static void method05()throws IOException {
        FileOutputStream fos = new FileOutputStream("module21\\1.txt",true);
        fos.write("床前明月光\r\n".getBytes());
        fos.write("疑是地上霜\n".getBytes());
        fos.write("举头望明月\n".getBytes());
        fos.write("低头思故乡\n".getBytes());
        fos.close();
    }

    /*
       void write(byte[] b)  一次写一个字节数组
     */
    private static void method04()throws IOException {
        FileOutputStream fos = new FileOutputStream("module21\\1.txt");
        //byte[] bytes = "abc".getBytes();
        fos.write("abcde".getBytes());
        fos.close();
    }

    /*
         void write(byte[] b, int off, int len)  一次写一个字节数组一部分
             b:写的数组
             off:从数组的哪个索引开始写
             len:写多少个
     */
    private static void method03()throws IOException {
        FileOutputStream fos = new FileOutputStream("module21\\1.txt");
        byte[] bytes = {97,98,99,100,101,102,103};
        fos.write(bytes,0,2);
        fos.close();
    }

    /*
       void write(byte[] b)  一次写一个字节数组
     */
    private static void method02()throws IOException {
        FileOutputStream fos = new FileOutputStream("module21\\1.txt");
        byte[] bytes = {97,98,99,100,101,102,103};
        fos.write(bytes);
        fos.close();
    }

    /*
       void write(int b)  一次写一个字节
     */
    private static void method01() throws IOException {
        FileOutputStream fos = new FileOutputStream("module21\\1.txt");
        fos.write(98);
        fos.close();
    }
}
