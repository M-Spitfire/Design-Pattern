package com.DesignPattern.mediator;

/**
 * "同事"抽象类, 所有通过中介者实现相互写作的类都叫做"同事", 级别相同
 */
public abstract class Colleague {
    private Mediator mediator;
    private String name;

    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public String getName() {
        return name;
    }

    public abstract void sendMessage(int stateChange);
}
