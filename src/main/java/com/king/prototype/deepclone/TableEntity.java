package com.king.prototype.deepclone;

import java.io.Serializable;

public class TableEntity implements Serializable,Cloneable {
    private String cloneName;
    private String cloneClass;


    public TableEntity() {
    }

    /*构造器*/
    public TableEntity(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    /*重写克隆方法：浅拷贝*/
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}
