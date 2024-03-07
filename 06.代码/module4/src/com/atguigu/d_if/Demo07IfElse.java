package com.atguigu.d_if;

public class Demo07IfElse {
    public static void main(String[] args) {
        boolean num1 = false;
        boolean num2 = true;

        int i = 1;

        /*
           num1 = false
           num2 = true
           num1 = num2 -> 相当于将num2的true赋值给了num1
         */
        if (num1=num2){
            i++;
            System.out.println(i);//2
        }

        if (false){
            --i;
            System.out.println(i);
        }
    }
}
