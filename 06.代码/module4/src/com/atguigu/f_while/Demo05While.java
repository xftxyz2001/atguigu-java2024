package com.atguigu.f_while;

public class Demo05While {
    public static void main(String[] args) {
        //1.定义一个变量表示山峰的高度  mountain
        int mountain = 8844430;
        //2.定义一个变量表示纸的厚度    paper
        double paper = 0.1;
        //3.定义一个变量表示折纸的次数  count
        int count = 0;
        /*4.利用while循环循环比较,如果paper<mountain 就循环对折
          paper = paper*2;
          count++;*/
        while(paper<mountain){
            paper*=2;
            count++;
        }
        //5.输出count
        System.out.println("count = " + count);
    }
}
