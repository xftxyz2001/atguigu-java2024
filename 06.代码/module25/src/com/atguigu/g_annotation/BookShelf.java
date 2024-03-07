package com.atguigu.g_annotation;

import com.atguigu.f_annotation.Book1;

@Book(bookName = "金瓶梅", author = {"涛哥", "金莲"}, price = 10, count = 20)
public class BookShelf {
    @Book(bookName = "金瓶梅", author = {"涛哥", "金莲"}, price = 10, count = 20)
    public void method(){

    }
}
