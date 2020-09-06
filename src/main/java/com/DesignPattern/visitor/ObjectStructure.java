package com.DesignPattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 访问者模式中保持稳定（不太会改变）的数据
 *
 * 访问者就是通过访问这里的数据进行操作的
 */
public class ObjectStructure {
    private List<Person> personList = new ArrayList<>();

    //添加Person
    public void add(Person person){
        personList.add(person);
    }

    //删除Person
    public void remove(Person person){
        personList.remove(person);
    }

    //这个方法通过接受一个Visitor，让这里的数据（Person）执行这个Visitor带来的操作（投赞成还是反对）
    //让personList中的所有人都投同一种票
    public void voteAll(Action action){
        for(Person person : personList){
            person.vote(action);
        }
    }
}
