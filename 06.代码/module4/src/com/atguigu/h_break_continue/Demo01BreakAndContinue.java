package com.atguigu.h_break_continue;

public class Demo01BreakAndContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i==3){
                //结束循环
                //break;
                //结束本次循环,进入下一次循环
                continue;
            }
            System.out.println("我爱java"+i);
        }
    }
}
