package com.atguigu.j_extends;

public class Test01 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setName("涛哥");
        teacher.setAge(18);
        System.out.println(teacher.getName()+"..."+teacher.getAge());

        System.out.println("==============");

        Manager manager = new Manager("金莲", 24);
        System.out.println(manager.getName()+"..."+manager.getAge());
    }
}
