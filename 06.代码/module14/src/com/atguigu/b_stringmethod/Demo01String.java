package com.atguigu.b_stringmethod;

public class Demo01String {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = new String("abc");
        String s3 = "Abc";
        System.out.println(s1==s2);//比较地址值了

        //boolean equals(String s) -> 比较字符串内容
        System.out.println(s1.equals(s2));
        //boolean equalsIgnoreCase(String s) -> 比较字符串内容,忽略大小写
        System.out.println(s1.equalsIgnoreCase(s3));

        System.out.println("=========================");
        String s4 = "123";
        String s5 = "一二三";
        System.out.println(s4.equalsIgnoreCase(s5));//false
        String s6 = "壹贰叁";
        System.out.println(s5.equalsIgnoreCase(s6));//false
    }
}
