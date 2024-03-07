package com.atguigu.i_endless_nest;

public class Demo04Nest {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            for (int j = 0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
