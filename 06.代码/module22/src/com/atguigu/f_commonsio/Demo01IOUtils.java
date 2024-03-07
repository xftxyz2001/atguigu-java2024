package com.atguigu.f_commonsio;

import org.apache.commons.io.IOUtils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Demo01IOUtils {
    public static void main(String[] args) /*throws Exception*/{
        //- 静态方法：IOUtils.copy(InputStream in,OutputStream out)传递字节流，实现文件复制。
        //IOUtils.copy(new FileInputStream("E:\\Idea\\io\\8.jpg"),new FileOutputStream("E:\\Idea\\io\\孝敏.jpg"));
        //- 静态方法：IOUtils.closeQuietly(任意流对象)悄悄的释放资源，自动处理close()方法抛出的异常。
        FileWriter fw = null;
        try{
            fw = new FileWriter("module22\\commons.txt");
            fw.write("你好");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (fw!=null){
                IOUtils.closeQuietly(fw);
            }
        }
    }
}
