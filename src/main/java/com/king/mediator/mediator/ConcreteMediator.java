package com.king.mediator.mediator;

import com.king.mediator.colleague.Alarm;
import com.king.mediator.colleague.CoffeMachine;
import com.king.mediator.colleague.Colleague;
import com.king.mediator.colleague.TV;

import java.util.HashMap;

//具体中介者
public class ConcreteMediator extends Mediator {
    private HashMap<String,Colleague> colleagueHashMap;
    private HashMap<String,String> interMap;

    public ConcreteMediator() {
        colleagueHashMap = new HashMap<String,Colleague>();
        interMap = new HashMap<String,String>();
    }


    @Override
    public void register(String colleagueName, Colleague colleague) {
        colleagueHashMap.put(colleagueName,colleague);

        if (colleague instanceof Alarm){
            interMap.put("Alarm",colleagueName);
        }else if (colleague instanceof TV){
            interMap.put("TV",colleagueName);
        }else if (colleague instanceof CoffeMachine){
            interMap.put("CoffeMachine",colleagueName);
        }

    }


    /**
     * 具体中介者核心方法：
     *   1.根据得到消息，完成对应任务
     *   2.中介者在这个方法协调各个具体同事对象，完成任务
     * @param stateChange
     * @param colleagueName
     */
    @Override
    public void getMessage(int stateChange, String colleagueName) {
        if (colleagueHashMap.get(colleagueName) instanceof Alarm){
            if (stateChange == 0){
            }
        }
    }

    @Override
    public void sendMessage() {

    }
}
