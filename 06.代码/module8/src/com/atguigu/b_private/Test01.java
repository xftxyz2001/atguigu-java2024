package com.atguigu.b_private;

public class Test01 {
    public static void main(String[] args) {
        Person person = new Person();
        //person.name = "涛哥";
        //person.age = -18;

        //System.out.println(person.name);
        //System.out.println(person.age);

        person.setName("涛哥");
        person.setAge(18);

        String name = person.getName();
        int age = person.getAge();
        System.out.println(name+"..."+age);
    }
}
