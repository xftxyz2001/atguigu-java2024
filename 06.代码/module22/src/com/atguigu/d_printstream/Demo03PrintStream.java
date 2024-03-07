package com.atguigu.d_printstream;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class Demo03PrintStream {
    public static void main(String[] args)throws Exception{
        PrintStream ps = new PrintStream(new FileOutputStream("module22\\log.txt",true));

        //改变流向
        System.setOut(ps);

        System.out.println("这个错误是今天下午2点出现的");
        System.out.println("这个错误是文件意外到达结尾异常");
        System.out.println("出现的原因是循环反序列化次数不对");
        ps.close();
    }
}
