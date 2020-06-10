package com.king.memento;

public class Client {
    public static void main(String[] args) {

        //创建游戏角色
        GameRole gameRole = new GameRole();
        gameRole.setVit(100);
        gameRole.setDef(100);
        System.out.println("大战前的状态：");
        gameRole.display();



        //把当前状态保存到caretaker
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(gameRole.createMemento());



        System.out.println("大战后的状态：");
        gameRole.setVit(70);
        gameRole.setDef(30);
        gameRole.display();


        //恢复
        gameRole.recoverGameRoleFromMemento(caretaker.getMemento());
        System.out.println("恢复后的状态：");
        gameRole.display();
    }
}
