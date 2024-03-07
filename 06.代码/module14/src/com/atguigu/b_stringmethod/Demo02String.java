package com.atguigu.b_stringmethod;

import java.util.Scanner;

public class Demo02String {
    public static void main(String[] args) {
        //1.先定义两个字符串,表示注册过的用户名和密码
        String username = "root";
        String password = "123";
        //2.创建Scanner对象,键盘录入用户名和密码
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请您输入用户名:");
            String name = sc.next();
            System.out.println("请您输入密码:");
            String pwd = sc.next();
            //3.比较,如果输入的用户名和密码跟已经注册过的用户名和密码内容一样,就登录成功,否则就登录失败
            if (name.equals(username) && pwd.equals(password)) {
                System.out.println("登录成功");
                break;
            } else {
                if (i == 2) {
                    System.out.println("账号冻结");
                } else {
                    System.out.println("登录失败!");
                }
            }
        }
    }
}
