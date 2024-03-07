package com.atguigu.a_file;

import java.io.File;
import java.io.IOException;

public class Demo03File {
    public static void main(String[] args) throws IOException {
        //file01();
        //file02();
        //file03();
        //file04();
        file05();
    }

    private static void file05() {
        File file = new File("E:\\Idea\\io\\aa");
        //String[] list() -> 遍历指定的文件夹,返回的是String数组
        String[] list = file.list();
        for (String s : list) {
            System.out.println(s);
        }
        //File[] listFiles()-> 遍历指定的文件夹,返回的是File数组 ->这个推荐使用
        System.out.println("==============");
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1);
        }
    }

    private static void file04() {
        File file = new File("E:\\Idea\\io\\1.txt");
        // boolean isDirectory() -> 判断是否为文件夹
        System.out.println("file.isDirectory() = " + file.isDirectory());
       // boolean isFile()  -> 判断是否为文件
        System.out.println("file.isFile() = " + file.isFile());
       // boolean exists()  -> 判断文件或者文件夹是否存在
        System.out.println("file.exists() = " + file.exists());
    }

    private static void file03() {
        //boolean delete()->删除文件或者文件夹
        //File file1 = new File("E:\\Idea\\io\\1.txt");
        File file1 = new File("E:\\Idea\\io\\haha");
        System.out.println("file1.delete() = " + file1.delete());
    }

    private static void file02() throws IOException {
        /*boolean createNewFile()  -> 创建文件
        如果要创建的文件之前有,创建失败,返回false
        如果要创建的文件之前没有,创建成功,返回true*/
        File file1 = new File("E:\\Idea\\io\\1.txt");
        System.out.println("file1.createNewFile() = " + file1.createNewFile());

        /*boolean mkdirs() -> 创建文件夹(目录)既可以创建多级文件夹,还可以创建单级文件夹
        如果要创建的文件夹之前有,创建失败,返回false
        如果要创建的文件夹之前没有,创建成功,返回true*/
        File file2 = new File("E:\\Idea\\io\\haha\\heihei\\hehe");
        System.out.println("file2.mkdirs() = " + file2.mkdirs());
    }

    private static void file01() {
        //String getAbsolutePath() -> 获取File的绝对路径->带盘符的路径
        File file1 = new File("1.txt");
        System.out.println("file1.getAbsolutePath() = " + file1.getAbsolutePath());
        //String getPath() ->获取的是封装路径->new File对象的时候写的啥路径,获取的就是啥路径
        File file2 = new File("io\\1.txt");
        System.out.println("file2.getPath() = " + file2.getPath());
        //String getName()  -> 获取的是文件或者文件夹名称
        File file3 = new File("E:\\Idea\\io\\1.jpg");
        System.out.println("file3.getName() = " + file3.getName());
        //long length() -> 获取的是文件的长度 -> 文件的字节数
        File file4 = new File("E:\\Idea\\io\\1.txt");
        System.out.println("file4.length() = " + file4.length());
    }
}
