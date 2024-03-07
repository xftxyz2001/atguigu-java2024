package com.atguigu.c_upload;

import java.util.UUID;

public class Demo01UUID {
    public static void main(String[] args) {
        String string = UUID.randomUUID().toString();
        System.out.println("string = " + string);
    }
}
