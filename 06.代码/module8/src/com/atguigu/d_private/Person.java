package com.atguigu.d_private;

public class Person {
    private String name;
    private int age;

    //为name提供get/set方法
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //为age提供get/set方法
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
