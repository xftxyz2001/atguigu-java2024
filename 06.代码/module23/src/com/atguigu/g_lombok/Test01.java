package com.atguigu.g_lombok;

public class Test01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("涛哥");
        person.setAge(10);

        System.out.println(person.getName()+"..."+person.getAge());

        System.out.println("================");

        Person p1 = new Person("三上", 28);
        System.out.println(p1.getName()+"..."+p1.getAge());
    }
}
