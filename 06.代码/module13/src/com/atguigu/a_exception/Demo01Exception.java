package com.atguigu.a_exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo01Exception {
    public static void main(String[] args) throws ParseException {
        //错误Error -> StackOverflowError
        //method();

        //运行时期异常 -> ArrayIndexOutOfBoundsException
        int[] arr1 = new int[3];
        /*System.out.println(arr1[4]);*/

        /*
          编译时期异常:
           注意看:编译时期异常是我们代码写错了嘛?不是,当我们调用方法的时候
           该方法底层给我们抛了一个编译时期异常,所以导致我们一调用此方法
           一编译,就爆红了
           当我们一旦触发了这个异常,jvm就会将异常信息打印到控制台上,给程序员们看
         */
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = "2000-10-10 10:10:10";
        Date date = sdf.parse(time);
        System.out.println(date);
    }

    public static void method(){
        method();
    }
}
