package com.atguigu.c_input;

import java.io.FileInputStream;

public class Demo01FileInputStream {
    public static void main(String[] args)throws Exception {
        //method01();
        method02();
    }

    /*
       int read(byte[] b)  一次读取一个字节数组,返回的是读取的字节个数
     */
    private static void method02()throws Exception {
        FileInputStream fis = new FileInputStream("module21\\1.txt");
        /*
           创建一个数组:byte[]
            1.创建的数组相当于一个临时存储区域,我们要读取的内容会临时保存到数组中
              然后我们再从数组中将数据获取

            2.数组长度定为多少,每次读取多少个,一般情况下数组长度定为1024或者1024的倍数
              如果剩下的字节不够数组长度了,那么就最后有多少读多少
         */
        byte[] bytes = new byte[2];
        //int len1 = fis.read(bytes);
        /*System.out.println(len1);//2
        System.out.println(new String(bytes,0,len1));
        System.out.println("===============");
        int len2 = fis.read(bytes);
        System.out.println(len2);//2
        System.out.println(new String(bytes,0,len2));
        System.out.println("===============");
        int len3 = fis.read(bytes);
        System.out.println(len3);//1
        System.out.println(new String(bytes,0,len3));*/

        //定义一个变量len,接收读取的字节个数
        int len;
        while((len = fis.read(bytes))!=-1){
            //System.out.println(new String(bytes,0,len));
            System.out.println(new String(bytes));
        }
        fis.close();
    }

    /*
       int read()   一次读一个字节,返回的是读取的字节
     */
    private static void method01()throws Exception {
        FileInputStream fis = new FileInputStream("module21\\1.txt");
        //int data1 = fis.read();
        //System.out.println(data1);

        //int data2 = fis.read();
        //System.out.println(data2);

        //int data3 = fis.read();
        //System.out.println(data3);

        //int data4 = fis.read();
        //System.out.println(data4);// -1

        //int data5 = fis.read();
        //System.out.println(data5);//-1

        System.out.println("=================");
        //定义一个变量,接收读取到的字节
        int len;
        while((len = fis.read())!=-1){
            System.out.println((char)len);
        }

        fis.close();
    }
}
