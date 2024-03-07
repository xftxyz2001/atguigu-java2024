package com.atguigu.d_regex;

import java.util.Scanner;

public class Demo01Regex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String data = scanner.next();
        //boolean result01 = method01(data);
        //System.out.println("result01 = " + result01);
        boolean result02 = method02(data);
        System.out.println("result02 = " + result02);
    }

    private static boolean method02(String data) {
        boolean result = data.matches("[1-9][0-9]{4,14}");
        return result;
    }

    private static boolean method01(String data) {
        //不能是0开头的
        if (data.startsWith("0")) {
            return false;
        }

        //必须都是数字
        char[] chars = data.toCharArray();
        for (char aChar : chars) {
            if (aChar < '0' || aChar > '9') {
                return false;
            }
        }

        //必须是5-15位
        if (data.length()<5 || data.length()>15){
            return false;
        }

        return true;
    }
}
