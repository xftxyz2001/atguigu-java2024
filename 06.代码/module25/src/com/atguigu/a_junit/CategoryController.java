package com.atguigu.a_junit;

import java.util.ArrayList;
import java.util.List;

public class CategoryController {
    /**
     * 添加功能
     */
    public int add(String categoryName){
        ArrayList<String> list = new ArrayList<>();
        list.add(categoryName);
        return 1;//如果返回一个1,证明添加成功了
    }

    /**
     * 查询功能
     */
    public List<String> findAllCategory(){
        ArrayList<String> list = new ArrayList<>();
        list.add("蔬菜");
        list.add("水果");
        list.add("服装");
        list.add("电器");
        list.add("玩具");
        return list;
    }
}
