package com.atguigu.d_var;

public class Demo01Var {
    public static void main(String[] args) {
        sum(1,2,3,4,5);
        sum1(1,1,2,3,4);
    }

    public static void sum(int...arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println(sum);
    }

    public static void sum1(int i,int...arr){

    }

}
