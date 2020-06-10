package com.king.memento;

import lombok.Data;

@Data
public class Memento {
    //攻击力
    private int vit;
    //防御力
    private int def;

    public Memento(int vit, int def) {
        this.vit = vit;
        this.def = def;
    }
}
