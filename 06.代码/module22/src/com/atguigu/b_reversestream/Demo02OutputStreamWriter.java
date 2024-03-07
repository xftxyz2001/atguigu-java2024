package com.atguigu.b_reversestream;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Demo02OutputStreamWriter {
    public static void main(String[] args)throws Exception {
        OutputStreamWriter osw =
                new OutputStreamWriter(new FileOutputStream("E:\\Idea\\io\\1.txt"),"gbk");
        osw.write("你好");
        osw.close();
    }
}
