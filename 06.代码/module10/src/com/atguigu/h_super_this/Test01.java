package com.atguigu.h_super_this;

public class Test01 {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("========");
        Person person1 = new Person(10);
        System.out.println("========");
        Person person2 = new Person();
        person2.method();
    }
}
