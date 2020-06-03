package com.king.iterator;


import com.king.iterator.college.College;

import java.util.Iterator;
import java.util.List;

//输出工具   输出一个学院集合信息 （这个学院集合包含多个学院，每个学院下有多个系）
public class OutPutImpl {
    //学院集合
    List<College> collegeList;

    //构造器
    public OutPutImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }


    //输出所有学院及其下属所有系
    public void printCollege(){
        Iterator<College> iterator = collegeList.iterator();
        while (iterator.hasNext()){
            //学院
            College college = iterator.next();
            System.out.println(college.getName());

            //学院下的系
            Iterator collegeIterator = college.createIterator();  //不同的学院是不同的迭代器,就是不同的集合，  每个集合下又有不同的元素  List —— 两个学院 —— 每个学院下又有多个集合
            printDepartment(collegeIterator);
        }
    }


    //学院输出系
    public void printDepartment(Iterator iterator){
        while (iterator.hasNext()){
            Department department = (Department) iterator.next();
            System.out.println(department);
        }
    }
}
