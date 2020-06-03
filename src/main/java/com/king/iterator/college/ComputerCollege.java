package com.king.iterator.college;

import com.king.iterator.iterator.ComputerCollegeIterator;
import com.king.iterator.Department;

import java.util.Iterator;

public class ComputerCollege implements College {
    Department[] departments;
    int numberOfDepartments = 0; //数组的大小


    public ComputerCollege() {
        departments = new Department[5];
        addDepartment("java专业","java专业");
        addDepartment("PHP专业","PHP专业");
        addDepartment("net专业","net专业");
        addDepartment("大数据专业","大数据专业");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departments[numberOfDepartments] = department;
        numberOfDepartments += 1;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
