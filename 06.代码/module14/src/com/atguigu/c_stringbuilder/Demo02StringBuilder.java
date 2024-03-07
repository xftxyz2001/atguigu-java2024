package com.atguigu.c_stringbuilder;

public class Demo02StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = sb.append("张无忌");
        System.out.println(sb1);
        System.out.println(sb);
        System.out.println(sb==sb1);

        System.out.println("==============");
        //链式调用
        sb.append("赵敏").append("周芷若").append("小昭");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        String s = sb.toString();
        System.out.println(s);
    }
}
