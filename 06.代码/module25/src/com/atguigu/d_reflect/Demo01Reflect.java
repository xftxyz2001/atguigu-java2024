package com.atguigu.d_reflect;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class Demo01Reflect {
    public static void main(String[] args)throws Exception {
        //1.创建properties集合
        Properties properties = new Properties();
        //2.读取配置文件,解析配置文件
        InputStream in = Demo01Reflect.class.getClassLoader().getResourceAsStream("pro.properties");
        properties.load(in);
        //System.out.println(properties);
        //3.根据解析出来的className,创建Class对象
        //4.根据解析出来的methodName,获取对应的方法
        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");

        Class<?> aClass = Class.forName(className);
        Object o = aClass.newInstance();

        Method method = aClass.getMethod(methodName);
        //5.执行方法
        method.invoke(o);
    }
}
