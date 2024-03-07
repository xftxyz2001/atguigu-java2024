package com.atguigu.a_file;

import java.io.File;
import java.io.IOException;

public class Demo05File {
    public static void main(String[] args) throws IOException {
        //File file1 = new File("module21\\2.txt");
        File file1 = new File("3.txt");
        System.out.println(file1.createNewFile());
    }
}
