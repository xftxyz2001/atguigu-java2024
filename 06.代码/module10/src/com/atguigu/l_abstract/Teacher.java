package com.atguigu.l_abstract;

public class Teacher extends Employee{
    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println("涛哥在讲java");
    }
}
