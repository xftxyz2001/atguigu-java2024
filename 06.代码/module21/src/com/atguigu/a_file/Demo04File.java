package com.atguigu.a_file;

import java.io.File;

public class Demo04File {
    public static void main(String[] args) {
        // 1.创建File对象,指定要遍历的文件夹路径
        File file = new File("E:\\Idea\\io\\aa");
        method(file);
    }

    private static void method(File file) {
       // 2.调用listFiles(),遍历文件夹,返回File数组
        File[] files = file.listFiles();
        // 3.遍历File数组,在遍历的过程中判断,如果是文件,获取文件名,判断是否以.jpg结尾的 如果是,输出
        for (File file1 : files) {
            if (file1.isFile()){
                String name = file1.getName();
                if (name.endsWith(".jpg")){
                    System.out.println(name);
                }
            }else {
       // 4.否则证明是文件夹,继续调用listFiles,遍历文件夹,然后重复 2 3 4步骤 -> 递归
               method(file1);
            }
        }
    }
}
