package com.atguigu.e_for;

public class Demo04For {
    public static void main(String[] args) {
        //1.定义一个变量count,用来计数
        int count = 0;
        //2.利用for循环将1-100表示出来
        for (int i = 1; i <= 100; i++) {
            //3.判断,如果是偶数,count++
            if (i % 2 == 0) {
                count++;
            }
        }
        //4.输出count
        System.out.println("count = " + count);
    }
}
