package com.atguigu.b_array;

import java.util.Scanner;

public class Demo05Search {
    public static void main(String[] args) {
        //1.创建Scanner对象
        Scanner sc = new Scanner(System.in);
        //2.定义数组,随便存几个数据
        int[] arr = {11,22,33,44,55,66,22};
        int data = sc.nextInt();

        //定义一个变量,此变量用来表示是否有要查找的数据
        int flag = 0;

        //3.遍历数组,在遍历的过程中判断是否和录入的数相等,如果相等,输出索引
        for (int i = 0; i < arr.length; i++) {
            if (data==arr[i]){
                System.out.println(i);
                flag++;
            }
        }

        /*
          4.判断flag是否还为0.如果遍历完,比较完之后,出了for循环,flag还是0,
            证明在遍历的过程中没有走过if
         */
        if (flag == 0){
            System.out.println(-1);
        }
    }
}
