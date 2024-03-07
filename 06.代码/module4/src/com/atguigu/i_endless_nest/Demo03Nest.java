package com.atguigu.i_endless_nest;

public class Demo03Nest {
    public static void main(String[] args) {
        //外层循环控制行
        for (int i = 0; i < 5; i++) {
            //内层循环控制列
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
