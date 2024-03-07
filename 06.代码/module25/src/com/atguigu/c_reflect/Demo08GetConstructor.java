package com.atguigu.c_reflect;

import java.lang.reflect.Constructor;

public class Demo08GetConstructor {
    public static void main(String[] args)throws Exception {
        Class<Person> aClass = Person.class;
        Constructor<Person> dc = aClass.getDeclaredConstructor(String.class);
        dc.setAccessible(true);//解除私有权限->暴力反射

        Person person = dc.newInstance("三上");
        System.out.println(person);

    }
}
