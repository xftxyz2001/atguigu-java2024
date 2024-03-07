package com.atguigu.c_reflect;

import java.lang.reflect.Constructor;

public class Demo03GetConstructor {
    public static void main(String[] args) {
        //获取Class对象
        Class<Person> aClass = Person.class;
        //获取所有public的构造
        Constructor<?>[] constructors = aClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }
    }
}
