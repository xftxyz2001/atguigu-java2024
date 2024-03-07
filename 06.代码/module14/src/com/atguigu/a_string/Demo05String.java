package com.atguigu.a_string;

public class Demo05String {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";
        String s3 = "helloworld";
        String s4 = "hello"+"world";
        String s5 = s1+"world";
        String s6 = s1+s2;

        System.out.println(s3==s4);//true
        System.out.println(s3==s5);//false
        System.out.println(s3==s6);//false
    }
}
