package com.atguigu.a_string;

public class Demo04String {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        System.out.println(s1==s2);//true
        System.out.println(s1==s3);//false
        System.out.println(s2==s3);//false
    }
}
