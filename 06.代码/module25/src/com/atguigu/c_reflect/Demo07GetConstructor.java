package com.atguigu.c_reflect;

import java.lang.reflect.Constructor;

public class Demo07GetConstructor {
    public static void main(String[] args) {
        Class<Person> aClass = Person.class;
        Constructor<?>[] dc = aClass.getDeclaredConstructors();
        for (Constructor<?> constructor : dc) {
            System.out.println(constructor);
        }
    }
}
