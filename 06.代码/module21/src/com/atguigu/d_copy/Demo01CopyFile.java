package com.atguigu.d_copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Demo01CopyFile {
    public static void main(String[] args)throws Exception {
        //1.创建FileInputStream
        FileInputStream fis = new FileInputStream("E:\\Idea\\io\\24.jpg");
        //2.创建一个FileOutputStream,将读取的图片写到指定的位置
        FileOutputStream fos = new FileOutputStream("E:\\Idea\\io\\大姐.jpg");
        //3.定义一个数组
        byte[] bytes = new byte[1024];
        //4.边读边写
        int len;
        while((len = fis.read(bytes))!=-1){
            fos.write(bytes,0,len);//读多少个,写多少个
        }
        //5.关流  先开后关
        fos.close();
        fis.close();
    }
}
