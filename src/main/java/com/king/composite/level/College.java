package com.king.composite.level;

import com.king.composite.OrganizationComponent;

import java.util.ArrayList;
import java.util.List;

//学院
public class College extends OrganizationComponent {

    //学院集合 学校——学院——系
    List<OrganizationComponent> organizationComponentList = new ArrayList<OrganizationComponent>();

    //构造器
    public College(String name, String desc) {
        super(name, desc);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDesc() {
        return super.getDesc();
    }


    //重写add方法
    @Override
    protected void add(OrganizationComponent organizationComponent){
        organizationComponentList.add(organizationComponent);
    }

    //重写remove方法
    @Override
    protected void remove(OrganizationComponent organizationComponent){
        organizationComponentList.remove(organizationComponent);
    }

    //重写打印方法,输出大学的名称
    @Override
    public void print(){
        System.out.println("......" + getName()  + "......");
        //遍历
        if (!organizationComponentList.isEmpty()){
            for (OrganizationComponent organizationComponent:organizationComponentList){
                System.out.println(organizationComponent.getName());
            }
        }
    }

}
