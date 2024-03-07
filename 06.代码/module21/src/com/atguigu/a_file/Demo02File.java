package com.atguigu.a_file;

import java.io.File;

public class Demo02File {
    public static void main(String[] args) {
        //File(String parent, String child) 根据所填写的路径创建File对象
        //parent:父路径
        //child:子路径
        File file1 = new File("E:\\Idea\\io", "1.jpg");
        System.out.println("file1 = " + file1);
        //File(File parent, String child)  根据所填写的路径创建File对象
        //parent:父路径,是一个File对象
        //child:子路径
        File parent = new File("E:\\Idea\\io");
        File file2 = new File(parent, "1.jpg");
        System.out.println("file2 = " + file2);
        //File(String pathname)  根据所填写的路径创建File对象
        //pathname:直接指定路径
        File file3 = new File("E:\\Idea\\io\\1.jpg");
        System.out.println("file3 = " + file3);
    }
}
