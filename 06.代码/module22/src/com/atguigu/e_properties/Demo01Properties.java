package com.atguigu.e_properties;

import java.util.Properties;
import java.util.Set;

public class Demo01Properties {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("username","root");
        properties.setProperty("password","1234");

        Set<String> set = properties.stringPropertyNames();
        for (String key : set) {
            System.out.println(properties.getProperty(key));
        }
    }
}
