package com.atguigu.c_reflect;

import java.lang.reflect.Method;

public class Demo09GetMethod {
    public static void main(String[] args)throws Exception {
        //method01();
        //method02();
        //method03();
        method04();
    }

    /**
     * 反射指定的成员方法:包括private的
     */
    private static void method04()throws Exception {
        Class<Person> aClass = Person.class;
        Person person = aClass.newInstance();
        Method method = aClass.getDeclaredMethod("eat");
        method.setAccessible(true);
        method.invoke(person);
    }

    /**
     * 获取所有成员方法,包括private
     */
    private static void method03() {
        Class<Person> aClass = Person.class;
        Method[] dm = aClass.getDeclaredMethods();
        for (Method method : dm) {
            System.out.println(method);
        }
    }

    /**
     * 获取指定的public的方法
     */
    private static void method02()throws Exception {
        Class<Person> aClass = Person.class;

        //创建对象
        Person person = aClass.newInstance();

        Method setName = aClass.getMethod("setName", String.class);
        /*
          相当于person.setName("柳岩")
         */
        setName.invoke(person,"柳岩");

        System.out.println(person);//好比调用toString方法

        System.out.println("============================");

        Method getName = aClass.getMethod("getName");

        //好比是person.getName()
        Object o = getName.invoke(person);
        System.out.println(o);
    }

    /**
     * 获取所有的public的方法
     */
    private static void method01() {
        Class<Person> aClass = Person.class;
        Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
    }
}
