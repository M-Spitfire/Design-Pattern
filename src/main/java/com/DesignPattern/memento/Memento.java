package com.DesignPattern.memento;

/**
 * 备忘录对象
 *
 * 用于存储备份游戏角色的攻击力和防御力
 */
public class Memento {
    private int atk;//攻击力
    private int def;//防御力

    public int getAtk() {
        return atk;
    }

    public int getDef() {
        return def;
    }

    public Memento(int atk, int def) {
        this.atk = atk;
        this.def = def;
    }


}
