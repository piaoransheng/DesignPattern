package com.king.iterator;


import lombok.Data;

//系
@Data
public class Department {
    private String name;
    private String desc;

    public Department(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }
}
