package com.king.visitor;

import com.king.visitor.action.Action;
import com.king.visitor.person.Person;
import java.util.LinkedList;
import java.util.List;

//数据结构  管理很多人（有man 和woman）
public class ObjectStructure {

    //维护一个集合
    private List<Person> personList = new LinkedList<>();

    //增加
    public void add(Person person){
        personList.add(person);
    }

    //移除
    public void remove(Person person){
        personList.remove(person);
    }

    //显示测评情况
    public void display(Action action){
        for (Person person:personList){
            person.adjust(action);
        }
    }
}
