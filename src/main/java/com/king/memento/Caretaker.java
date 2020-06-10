package com.king.memento;

import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;

//守护者对象，保存游戏角色的状态
@Data
public class Caretaker {
    //只保存一次状态
    private Memento memento;

    //保存多次状态
    private ArrayList<Memento> mementoArrayList;

    //对多个角色保存多个状态
    private HashMap<String,ArrayList<Memento>> rolesMemento;



}
