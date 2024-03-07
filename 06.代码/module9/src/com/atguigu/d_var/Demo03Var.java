package com.atguigu.d_var;

public class Demo03Var {
    public static void main(String[] args) {
        String result = concat("-", "张三丰", "张翠山", "张无忌");
        System.out.println("result = " + result);
    }

    public static String concat(String regex, String... s) {
        String str = "";
        for (int i = 0; i < s.length; i++) {
            if (i == s.length - 1) {
                str += s[i];
            } else {
                str += s[i] + regex;
            }
        }

        return str;
    }
}
