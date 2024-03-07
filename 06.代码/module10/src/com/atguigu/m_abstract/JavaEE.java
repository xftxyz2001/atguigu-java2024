package com.atguigu.m_abstract;

public class JavaEE extends Developer{
    public JavaEE() {
    }

    public JavaEE(int id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        //System.out.println("员工号为:"+getId()+"的"+getName()+"正在开发网站");
        System.out.println("员工号为:"+this.getId()+"的"+this.getName()+"正在开发网站");
    }
}
