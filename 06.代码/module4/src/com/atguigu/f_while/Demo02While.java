package com.atguigu.f_while;

public class Demo02While {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        while(i<=3){
           sum+=i;
           i++;
        }
        System.out.println("sum = " + sum);
    }
}
