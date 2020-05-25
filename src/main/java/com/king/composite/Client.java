package com.king.composite;

import com.king.composite.level.College;
import com.king.composite.level.Department;
import com.king.composite.level.University;

public class Client {
    public static void main(String[] args) {

        //学习
         OrganizationComponent university = new University("清华大学", "中国顶级大学");

         //学院
         OrganizationComponent college1 = new College("计算机学院", "计算机学院");
         OrganizationComponent college2 = new College("信息工程学院", "信息工程学院");

         //系
        OrganizationComponent department1 = new Department("软件工程专业", "软件工程专业");
        OrganizationComponent department2 = new Department("网络工程专业", "网络工程专业");
        OrganizationComponent department3 = new Department("计算机科学与技术专业", "计算机科学与技术专业");
        OrganizationComponent department4 = new Department("电信专业", "电信专业");
        OrganizationComponent department5 = new Department("电科专业", "电科专业");
        OrganizationComponent department6 = new Department("广电专业", "广电专业");


        college1.add(department1);
        college1.add(department2);
        college1.add(department3);
        college2.add(department4);
        college2.add(department5);
        college2.add(department6);

        university.add(college1);
        university.add(college2);

        university.print();
//        college1.print();
    }
}
