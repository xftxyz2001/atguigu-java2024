package com.atguigu.f_javabean;

public class Test01 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setSid(1);
        s1.setSname("涛哥");
        System.out.println(s1.getSid()+"..."+s1.getSname());

        System.out.println("==============");

        Student s2 = new Student(2, "金莲");
        System.out.println(s2.getSid()+"..."+s2.getSname());
    }
}
