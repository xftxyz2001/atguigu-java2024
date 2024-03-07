package com.atguigu.a_buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Demo02BufferedWriter {
    public static void main(String[] args)throws Exception {
        BufferedWriter bw = new BufferedWriter(new FileWriter("module22\\1.txt",true));
        bw.write("床前明月光");
        bw.newLine();
        bw.write("疑是地上霜");
        bw.newLine();
        bw.write("举头望明月");
        bw.newLine();
        bw.write("低头思故乡");
        bw.newLine();
        bw.close();
    }
}
