package com.atguigu.b_stringmethod;

import java.util.Scanner;

public class Demo07String {
    public static void main(String[] args) {
        //1.创建Scanner对象,键盘录入
        Scanner sc = new Scanner(System.in);
        //2.定义三个变量,用来统计
        int big = 0;
        int small = 0;
        int number = 0;
        //3.调用next方法录入一个字符串,遍历字符串,将每一个字符拿出来
        String data = sc.next();
        char[] chars = data.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char num = chars[i];

             /*4.统计大写字母
                  A-Z -> 65-90
                  比如:B -> 66 -> 在65-90之间,证明就是大写字母*/
            if (num>='A' && num<='Z'){
                big++;
            }
             /*5.统计小写字母
                  a-z -> 97-122
                  比如:b -> 98 -> 在97-122之间,证明就是小写字母*/
            if (num>='a' && num<='z'){
                small++;
            }
             /*6.统计数字:
                  0-9 -> 48-57
                  比如:字符1 -> 49 -> 在48-57之间,证明就是数字*/
            if (num>='0' && num<='9'){
                number++;
            }
        }

        //7.将统计结果打印出来
        System.out.println("大写有"+big+"个");
        System.out.println("小写有"+small+"个");
        System.out.println("数字有"+number+"个");
    }
}
