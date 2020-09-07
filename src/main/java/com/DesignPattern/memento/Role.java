package com.DesignPattern.memento;

public class Role {
    private int atk;//攻击力
    private int def;//防御力

    public Role(int atk, int def) {
        this.atk = atk;
        this.def = def;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    //创建Memento用于备份状态
    public Memento createMemento(){
        return new Memento(atk, def);
    }

    //从memento中恢复状态
    public void recoveryFromMemento(Memento memento){
        this.atk = memento.getAtk();
        this.def = memento.getDef();
    }

    @Override
    public String toString() {
        return "Role{" +
                "atk=" + atk +
                ", def=" + def +
                '}';
    }
}
