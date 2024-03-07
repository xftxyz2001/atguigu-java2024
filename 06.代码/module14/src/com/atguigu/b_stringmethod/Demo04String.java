package com.atguigu.b_stringmethod;

public class Demo04String {
    public static void main(String[] args) {
        String s1 = "abcdefg";
        //int length() -> 获取字符串长度
        System.out.println(s1.length());
        //String concat(String s)-> 字符串拼接,返回新串儿
        System.out.println(s1.concat("haha"));
        //char charAt(int index) -> 根据索引获取对应的字符
        System.out.println(s1.charAt(0));
        //int indexOf(String s) -> 获取指定字符串在大字符串中第一次出现的索引位置
        System.out.println(s1.indexOf("a"));
        //String subString(int beginIndex) -> 截取字符串,从指定索引开始截取到最后,返回新串儿
        System.out.println(s1.substring(3));
        //String subString(int beginIndex,int endIndex) -> 截取字符串,从beginIndex开始到endIndex结束
        //含头不含尾,返回新串儿
        System.out.println(s1.substring(1,6));

    }
}
