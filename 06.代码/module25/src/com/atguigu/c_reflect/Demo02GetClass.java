package com.atguigu.c_reflect;

import java.io.FileInputStream;
import java.util.Properties;

public class Demo02GetClass {
    public static void main(String[] args)throws Exception {
        Properties properties = new Properties();
        FileInputStream in = new FileInputStream("module25\\pro.properties");
        properties.load(in);

        String className = properties.getProperty("className");
        System.out.println(className);

        Class<?> aClass = Class.forName(className);
        System.out.println("aClass = " + aClass);

    }
}
