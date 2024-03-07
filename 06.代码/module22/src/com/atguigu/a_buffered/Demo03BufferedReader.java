package com.atguigu.a_buffered;

import java.io.BufferedReader;
import java.io.FileReader;

public class Demo03BufferedReader {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("module22\\1.txt"));
        /*String s = br.readLine();
        System.out.println(s);

        String s1 = br.readLine();
        System.out.println(s1);

        String s2 = br.readLine();
        System.out.println(s2);

        String s3 = br.readLine();
        System.out.println(s3);

        String s4 = br.readLine();
        System.out.println(s4);*/

        //定义一个字符串,接收读取的内容
        String line = null;
        while((line = br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
    }
}
