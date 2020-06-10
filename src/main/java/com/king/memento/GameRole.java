package com.king.memento;

import lombok.Data;

@Data
public class GameRole {
    //攻击力
    private int vit;
    //防御力
    private int def;

    //创建备忘录对象
    public Memento createMemento() {
        return new Memento(vit,def);
    }

    //从备忘录对象恢复游戏状态
    public void recoverGameRoleFromMemento(Memento memento){
        this.vit = memento.getVit();
        this.def = memento.getDef();
    }

    //显示当前游戏的状态
    public void display(){
        System.out.println("攻击力；" + this.vit);
        System.out.println("防御力；" + this.def);
    }

}
