package com.atguigu.f_annotation;

@Book(bookName = "金瓶梅", author = {"涛哥", "金莲"}, price = 10, count = 20)
@Book1("水浒野传")
public class BookShelf {
    @Book(bookName = "金瓶梅", author = {"涛哥", "金莲"}, price = 10, count = 20)
    public void method() {

    }
}
