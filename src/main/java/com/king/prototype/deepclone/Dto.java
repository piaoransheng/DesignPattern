package com.king.prototype.deepclone;

import java.io.*;

public class Dto implements Cloneable, Serializable {
    public String name;
    public TableEntity tableEntity; //引用类型

    public Dto() {
        super();
    }

    /*深拷贝方式一 使用clone方法  */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        //首先完成对基本数据类型(属性)和String的克隆
        deep = super.clone();
        //对引用类型的属性单独处理
        Dto dto = (Dto) deep;
        dto.tableEntity = (TableEntity) tableEntity.clone();
        return dto;
    }


    /*深拷贝方式2  序列号的方法*/
    public  Object clone2(){
        //创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);    //当前这个对象以流的方式输出

            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            Dto dto = (Dto) ois.readObject();
            return dto;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            }
    }

}
