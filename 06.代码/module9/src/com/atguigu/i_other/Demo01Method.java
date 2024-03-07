package com.atguigu.i_other;

public class Demo01Method {
    public static void main(String[] args) {
        //调用一个无参无返回值方法
        method01();
        //调用一个有参无返回值方法
        method02(10,20);
        //调用一个无参有返回值方法
        int result = method03();
        //调用一个有参有返回值方法
        int result02 = method04(10,20);
    }

    private static int method04(int i, int i1) {
        return i+i1;
    }

    private static int method03() {
        return 0;
    }

    private static void method02(int i, int j) {
        System.out.println(i+j);
    }

    public static void method01() {
        System.out.println("无参无返回值方法");
    }
}
