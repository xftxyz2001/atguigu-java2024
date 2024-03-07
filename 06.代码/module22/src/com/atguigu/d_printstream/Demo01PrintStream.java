package com.atguigu.d_printstream;

import java.io.PrintStream;

public class Demo01PrintStream {
    public static void main(String[] args)throws Exception{
        PrintStream ps = new PrintStream("module22\\printstream.txt");
        ps.println("涛哥是一个大帅哥");
        ps.println("涛哥是一个小鲜肉");
        ps.println("涛哥和金莲不为人知的故事");
        ps.close();
    }
}
