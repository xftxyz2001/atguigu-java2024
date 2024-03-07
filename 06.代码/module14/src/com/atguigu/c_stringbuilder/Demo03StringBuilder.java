package com.atguigu.c_stringbuilder;

import java.util.Scanner;

public class Demo03StringBuilder {
    public static void main(String[] args) {
        //1.创建Scanner对象
        Scanner sc = new Scanner(System.in);
        String data = sc.next();
        //2.创建StringBuilder对象
        StringBuilder sb = new StringBuilder(data);
        //3.翻转
        sb.reverse();
        //4.将StringBuilder转成String
        String s = sb.toString();
        if (data.equals(s)){
            System.out.println("是回文内容");
        }else{
            System.out.println("不是回文内容");
        }

    }
}
