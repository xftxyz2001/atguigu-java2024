package com.atguigu.a_junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Demo02Junit {
    @Test
    public void add(){

        System.out.println("我是@Test执行的add方法");
    }

    @Test
    public void delete(){

        System.out.println("我是@Test执行的delete方法");
    }


    @Before
    public void methodBefore(){
        System.out.println("我是@Before执行的方法");
    }

    @After
    public void methodAfter(){
        System.out.println("我是@After执行的方法");
    }

}
