package com.atguigu.b_stringmethod;

import java.io.UnsupportedEncodingException;

public class Demo06String {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "abcdefg";
        //1.char[] toCharArray() -> 将字符串转成char数组
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
        System.out.println("===============");
        //2.byte[] getBytes() -> 将字符串转成byte数组
        byte[] bytes = s.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println("===============");
        //3.String replace(CharSequence c1,CharSequence c2)-> 替换字符 CharSequence->String的接口
        System.out.println(s.replace("a","z"));

        System.out.println("===============");
        //4.byte[] getBytes(String charsetName) -> 按照指定的编码将字符串转成byte数组
        byte[] bytes1 = "你好".getBytes("GBK");
        for (int i = 0; i < bytes1.length; i++) {
            System.out.println(bytes1[i]);
        }

    }
}
