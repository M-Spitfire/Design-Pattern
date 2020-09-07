package com.DesignPattern.memento;

/**
 * 备份责任的承担着, 备份的memento对象会存储在这里, 恢复状态的时候从这里取出memento对象
 */
public class CareTaker {
    /**
     * 使用集合保存单个角色的多个状态
     * 如果只需要保存单个角色的单个状态, 比如固定保存主角3秒之前的对象, 那么只需要一个memento对象即可
     * 如果需要保存多各角色的状态, 则需要map, 保存单个状态直接存memento, 保存多个状态存List<memento>
     */
    private Memento memento;

    public CareTaker() {}

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
