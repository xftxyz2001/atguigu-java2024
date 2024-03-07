package com.atguigu.a_junit;

import org.junit.Test;

import java.util.List;

public class Demo03Junit {
   /* public static void main(String[] args) {
        CategoryController cc = new CategoryController();
        int result = cc.add("蔬菜");
        System.out.println("result = " + result);

        List<String> list = cc.findAllCategory();
        System.out.println(list);
    }*/

    /**
     * 此方法专门测添加功能
     */
    @Test
    public void add(){
        CategoryController cc = new CategoryController();
        int result = cc.add("蔬菜");
        System.out.println("result = " + result);
    }

    /**
     * 此方法专门测查询所有功能
     */
    @Test
    public void findAllCategory(){
        CategoryController cc = new CategoryController();
        List<String> list = cc.findAllCategory();
        System.out.println(list);
    }
}
