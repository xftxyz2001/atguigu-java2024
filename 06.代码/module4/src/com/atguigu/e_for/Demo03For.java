package com.atguigu.e_for;

public class Demo03For {
    public static void main(String[] args) {
        //1.定义一个变量sum,接受两个偶数的和
        int sum = 0;
        //2.利用for循环将1-100表示出来
        for (int i = 1; i <= 100; i++) {
            //3.判断,如果是偶数,相加,将加的结果赋值给sum
            if (i % 2 == 0) {
                sum += i;
            }
        }
        //4.输出sum
        System.out.println("sum = " + sum);
    }
}
