package com.atguigu.d_if;

public class Demo05IfElse {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        int k = 30;

        //定义临时变量,接收前两个数的较大值
        int temp = 0;

        if (i>j){
            temp = i;
        }else{
            temp = j;
        }

        if (temp>k){
            System.out.println(temp);
        }else{
            System.out.println(k);
        }
    }
}
