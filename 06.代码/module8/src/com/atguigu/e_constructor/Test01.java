package com.atguigu.e_constructor;

public class Test01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("金莲");
        person.setAge(26);
        System.out.println(person.getName()+"..."+person.getAge());

        Person person2 = new Person("涛哥", 18);
        System.out.println(person2.getName()+"..."+person2.getAge());

    }
}
