package com.king.visitor;

import com.king.visitor.action.Failure;
import com.king.visitor.action.Success;
import com.king.visitor.person.Man;
import com.king.visitor.person.Women;

public class Client {
    public static void main(String[] args) {
        //创建objectStructure
        ObjectStructure objectStructure = new ObjectStructure();

        objectStructure.add(new Man());
        objectStructure.add(new Women());

        //成功
        Success success = new Success();
        objectStructure.display(success);

        //失败
        Failure failure = new Failure();
        objectStructure.display(failure);


    }
}
