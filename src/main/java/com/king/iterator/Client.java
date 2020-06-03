package com.king.iterator;

import com.king.iterator.college.College;
import com.king.iterator.college.ComputerCollege;
import com.king.iterator.college.InfoCollege;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {

        //创建学院集合
        List<College> collegeList = new ArrayList<College>();

        //创建学院 构造器已经包含很多系
        ComputerCollege computerCollege = new ComputerCollege();
        InfoCollege infoCollege = new InfoCollege();

        //往学院集合加入学院
        collegeList.add(computerCollege);
        collegeList.add(infoCollege);

        //输出工具
        OutPutImpl outPutImpl = new OutPutImpl(collegeList);
        //输出
        outPutImpl.printCollege();
    }
}
