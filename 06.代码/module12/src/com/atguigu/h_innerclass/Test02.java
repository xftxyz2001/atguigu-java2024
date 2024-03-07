package com.atguigu.h_innerclass;

public class Test02 {
    public static void main(String[] args) {
        Student.Heart heart = new Student().new Heart();
        heart.display("涛哥");
    }
}
