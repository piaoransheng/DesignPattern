package com.king.iterator.iterator;

import com.king.iterator.Department;

import java.util.Iterator;

//计算机学院
public class ComputerCollegeIterator implements Iterator{
    Department[] departments;   //计算机学院以数组存放系
    int position = 0; //遍历的位置

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (position >= departments.length || departments[position] == null){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public Object next() {
        Department department = departments[position];
        position += 1;
        return department;
    }

    @Override
    public void remove(){

    }
}
