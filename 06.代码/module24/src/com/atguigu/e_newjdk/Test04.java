package com.atguigu.e_newjdk;

public class Test04 {
    public static void main(String[] args) {
        var i = 10;
        System.out.println("i = " + i);

        var j = "helloworld";
        System.out.println("j = " + j);

        var arr = new int[]{1,2,3,4,5};
        for (var element : arr) {
            System.out.println(element);
        }
    }
}
