package com.atguigu.h_param;

public class Demo03Param {
    //形参：String[] args
    public static void main(String[] args){
        for(int i=0; i<args.length; i++){
            System.out.println("第" + (i+1) + "个参数的值是：" + args[i]);
        }
    }
}
