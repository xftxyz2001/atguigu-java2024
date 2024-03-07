package com.atguigu.e_for;

public class Demo02For {
    public static void main(String[] args) {
        //1.定义一个变量,用来接受两个数的和  sum
        int sum = 0;
        //2.利用for循环将1-3表示出来
        for (int i = 1; i <= 3; i++) {
        //3.在循环的过程中,两两相加,将结果赋值给sum
            sum+=i;//sum = sum+i;
        }
        //4.输出sum
        System.out.println("sum = " + sum);
    }
}
