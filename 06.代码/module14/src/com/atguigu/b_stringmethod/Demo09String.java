package com.atguigu.b_stringmethod;

public class Demo09String {
    public static void main(String[] args) {
        String s = "abcdefg";
        //1.boolean contains(String s) -> 判断老串儿中是否包含指定的串儿
        System.out.println(s.contains("a"));
        //2.boolean endsWith(String s) -> 判断老串儿是否以指定的串儿结尾
        System.out.println(s.endsWith("g"));
        //3.boolean startsWith(String s) -> 判断老串儿是否以指定的串儿开头
        System.out.println(s.startsWith("a"));
        //4.String toLowerCase()-> 将字母转成小写
        System.out.println("ADbcda".toLowerCase());
        //5.String toUpperCase() -> 将字母转成大写
        System.out.println("dafadRWERW".toUpperCase());
        //6.String trim() -> 去掉字符串两端空格
        System.out.println(" hadfhad hdsfha  sfhdsh ".trim());

        System.out.println("==================");
        System.out.println(" hadfhad hdsfha  sfhdsh ".replace(" ",""));
    }
}
