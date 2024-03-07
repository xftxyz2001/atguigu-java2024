package com.atguigu.a_string;

public class Demo03String {
    public static void main(String[] args) {
       /* 1.String(char[] value, int offset, int count)->将char数组的一部分转成String对象
        value:要转String的char数组
        offset:从数组的哪个索引开始转
        count:转多少个*/
        char[] chars = {'a','b','c','d','e','f'};
        String s1 = new String(chars,1,3);
        System.out.println(s1);
       /* 2.String(byte[] bytes, int offset, int length)->将byte数组的一部分转成String对象
        bytes:要转String的byte数组
        offset:从数组的哪个索引开始转
        length:转多少个*/
        byte[] bytes = {97,98,99,100,101};
        String s2 = new String(bytes,0,2);
        System.out.println(s2);
    }
}
