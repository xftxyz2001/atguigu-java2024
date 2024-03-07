package com.atguigu.g_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Book {
    //书名
    String bookName();
    //作者
    String[] author();
    //价格
    int price();
    //数量
    int count() default 10;
}
