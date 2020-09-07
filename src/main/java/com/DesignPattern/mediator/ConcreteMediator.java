package com.DesignPattern.mediator;

import java.util.HashMap;

/**
 * 实体中介
 *
 * 在这里会定义所有机器发来的提醒需要的后续操作, 按照流程做完一件事
 */
public class ConcreteMediator extends Mediator{
    private HashMap<String, Colleague> colleagueMap;
    /**
     * innerMap的作用主要是给所有Colleague起一个别名. 比如闹钟提醒之后后续有很多操作要执行,
     * 要从colleagueMap中找到相应的机器(对象)就需要指导他们注册到中介时用的名字
     * 用innerMap就能够用别名来找到它们
     */

    private HashMap<String, String> innerMap;

    public ConcreteMediator() {
        colleagueMap = new HashMap<>();
        innerMap = new HashMap<>();
    }

    @Override
    public void addColleague(String colleagueName, Colleague colleague) {
        colleagueMap.put(colleagueName, colleague);

        if (colleague instanceof Alarm) {
            innerMap.put("Alarm", colleagueName);
        } else if (colleague instanceof CoffeeMachine) {
            innerMap.put("CoffeeMachine", colleagueName);
        } else if (colleague instanceof TV) {
            innerMap.put("TV", colleagueName);
        } else if (colleague instanceof Curtains) {
            innerMap.put("Curtains", colleagueName);
        }
    }

    @Override
    public void getMessage(int stateChange, String colleagueName) {
        //闹钟发出0提醒:咖啡机和电视开始工作; 闹钟发出1提醒:关闭电视
        if (colleagueMap.get(colleagueName) instanceof Alarm) {
            if (stateChange == 0) {
                ((CoffeeMachine) (colleagueMap.get(innerMap.get("CoffeeMachine")))).StartCoffee();
                ((TV) (colleagueMap.get(innerMap.get("TV")))).StartTv();
            }
            else if (stateChange == 1) {
                ((TV) (colleagueMap.get(innerMap.get("TV")))).StopTv();
            }
        }
        else if (colleagueMap.get(colleagueName) instanceof CoffeeMachine) {
            ((Curtains) (colleagueMap.get(innerMap.get("Curtains")))).UpCurtains();
        }
        //下面这些逻辑就不写了, 与闹钟的提醒类似, 注重的是一个执行顺序
        else if (colleagueMap.get(colleagueName) instanceof TV) {

        }
        else if (colleagueMap.get(colleagueName) instanceof Curtains) {

        }

    }

    @Override
    public void sendMessage() {

    }
}
