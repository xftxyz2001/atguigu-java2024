package com.atguigu.b_stringmethod;

import java.util.Objects;

public class Demo03String {
    public static void main(String[] args) {
        //String s = "abc";
        String s = null;
        //method(s);

        String s1 = "abc";
        String s2 = "abc";
        method01(s1,s2);
    }

    /*
      工具类:Objects
      方法:判断两个对象是否相等 -> 自带防空指针作用
          public static boolean equals(Object a, Object b) {
             return (a == b) || (a != null && a.equals(b));
          }

     */
    private static void method01(String s1, String s2) {
      if (Objects.equals(s1,s2)){
          System.out.println("是abc");
      }else{
          System.out.println("不是abc");
      }
    }

    /*
      如果传递过来的对象是null,再去点其他方法,就会空指针
      解决:不要让一个字符串变量去点,用确定的字符串去点,可以防空
     */
    private static void method(String s) {
        /*if (s.equals("abc")){
            System.out.println("是abc");
        }else{
            System.out.println("不是abc");
        }*/
        if ("abc".equals(s)){
            System.out.println("是abc");
        }else{
            System.out.println("不是abc");
        }
    }
}
