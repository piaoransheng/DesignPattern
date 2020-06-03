package com.king.iterator.iterator;

import com.king.iterator.Department;

import java.util.Iterator;
import java.util.List;

//信息学院
public class InfoCollegeIterator implements Iterator{
    List<Department> departmentList;  //信息工程学院以list存放系
    int position = -1; //遍历的位置

    public InfoCollegeIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    @Override
    public boolean hasNext() {
        if (position >= departmentList.size()-1 ){
            return false;
        }else {
            position += 1;
            return true;
        }
    }

    @Override
    public Object next() {
        Department department = departmentList.get(position);
        return department;
    }

    @Override
    public void remove(){

    }
}
