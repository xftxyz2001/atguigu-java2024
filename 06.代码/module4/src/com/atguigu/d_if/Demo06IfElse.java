package com.atguigu.d_if;

import java.util.Scanner;

public class Demo06IfElse {
    public static void main(String[] args) {
        //1.创建Scanner对象,调用nextInt键盘录入一个年份 year
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        //2.判断(year%4==0 && year%100!=0) || (year%400==0)
        if ((year%4==0 && year%100!=0) || (year%400==0)){
        //3.如果条件成立,就输出闰年2月29天,否则输出平年2月28天
            System.out.println("闰年2月29天");
        }else{
            System.out.println("平年2月28天");
        }
    }
}
