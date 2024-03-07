package com.atguigu.c_reflect;

import java.lang.reflect.Field;

public class Demo10GetField {
    public static void main(String[] args)throws Exception {
        //method01();
        //method02();
        method03();
    }

    /**
     * Field getDeclaredField(String name)  -> 获取指定属性,包括priavte的
     */
    private static void method03()throws Exception {
        Class<Student> studentClass = Student.class;
        Student student = studentClass.newInstance();
        Field name = studentClass.getDeclaredField("name");

        //解除私有权限
        name.setAccessible(true);

        //调用set方法为属性赋值
        name.set(student,"柳岩");
        //调用get方法获取属性值 -> 相当于javabean中的get方法
        Object o = name.get(student);
        System.out.println("o = " + o);
    }

    /**
     * Field getField(String name) -> 获取指定public的属性
     */
    private static void method02()throws Exception {
        Class<Student> studentClass = Student.class;
        Student student = studentClass.newInstance();
        Field age = studentClass.getField("age");
        //调用set方法为属性赋值
        age.set(student,10);
        //调用get方法获取属性值 -> 相当于javabean中的get方法
        Object o = age.get(student);
        System.out.println("o = " + o);
    }

    /**
     * 1.Field[] getFields() -> 获取所有public的属性
     * 2.Field[] getDeclaredFields()  -> 获取所有属性,包括priavte的
     */
    private static void method01() {
        Class<Student> studentClass = Student.class;
        Field[] fields = studentClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        System.out.println("========================");

        Field[] df = studentClass.getDeclaredFields();
        for (Field field : df) {
            System.out.println(field);
        }
    }
}
