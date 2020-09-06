package com.DesignPattern.visitor;

/**
 * 行为抽象类
 *
 * 这里面有多少个方法实际上是由具体Element的数量决定的,
 * 因为Visitor(就是这个例子里的Action)每有一个子类, 就需要为这些子类写一个操作方法
 *
 * 这个男生女生投票的例子可能不太好理解, 换一个
 * 学校里的学生想要评优秀需要90分的成绩, 老师想要评优秀需要85分的成绩
 * 显然学生和老师都是Element的子类, 由于老师和学生的评分标准不同, 所以要单独写两个方法
 */
public abstract class Action {
    public abstract void getManResult(Man man);
    public abstract void getWomanResult(Woman woman);
}
