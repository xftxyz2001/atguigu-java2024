package com.atguigu.ternary;

public class Demo01Ternary {
    public static void main(String[] args) {
        //定义一个变量,表示小明的分数
        int score = 60;
        String result = score>=60?"及格":"不及格";
        System.out.println("result = " + result);
    }
}
