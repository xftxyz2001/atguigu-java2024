package com.atguigu.a_method;
/*
   需求:定义一个方法,比较两个整数的大小,如果第一个比第二个大,返回true,否则返回false
 */
public class Demo07Method {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        //传递的是i和j,但是我们真正传递的是i和j代表的数据,不是变量本身
        boolean result = compare(i, j);
        System.out.println("result = " + result);
    }
    public static boolean compare(int a,int b){
        if (a>b){
            return true;
        }else{
            return false;
        }
    }
}
