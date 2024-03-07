package com.atguigu.b_stringmethod;

public class Demo08String {
    public static void main(String[] args) {
        String s = "abc,txt";
        String[] split = s.split(",");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }

        System.out.println("===============");
        String s2 = "haha.hehe";
        String[] split1 = s2.split("\\.");
        for (int i = 0; i < split1.length; i++) {
            System.out.println(split1[i]);
        }
    }
}
