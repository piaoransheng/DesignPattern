package com.king.composite;

public abstract class OrganizationComponent {  //可以是类 也可以是接口
    private String name;   //机构名称
    private String desc;   //机构描述

    public OrganizationComponent(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }


    //添加
    protected void add(OrganizationComponent organizationComponent){
        //默认实现
        throw new UnsupportedOperationException();
    }

    //删除
    protected void remove(OrganizationComponent organizationComponent){
        //默认实现
        throw new UnsupportedOperationException();
    }

    //打印方法，写成抽象的方法就可以写成接口形式，由子类去实现
    public abstract void print();

}
