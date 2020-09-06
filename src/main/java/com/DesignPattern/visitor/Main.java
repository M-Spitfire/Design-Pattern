package com.DesignPattern.visitor;

/**
 * 访问者模式
 *
 * 角色分析：
 *      Element: 对应这个例子里面的Person(抽象数据), Man(具体数据), Woman(具体数据)
 *      Visitor: 对应这个例子里面的Action(抽象操作)，Success(具体操作)，Fail(具体操作)
 *      ObjectStructure：存储Element的地方，写一些方法，这额方法接受一个具体的Visitor，让Element执行这个Visitor里的操作
 *
 * 双分派：Element和Visitor中使用到了双分派
 *      Visitor中的操作需要具体的Element，Visitor.visit(Element element){}
 *      Visitor中的操作是通过将Visitor作为参数提供给Element去执行, Element.accept(Visitor visitor){visitor.visit(this)}
 *      这样做的好处是什么呢？
 *      主要是拓展性强. Visitor.visit(Element element){}这个方法的参数Element只是一个抽象, 可能会有很多的子类或实现
 *      我们可以用这些子类或实现重载这个visit方法, 实现不同的子类不同的操作, 这时我们发现, Action在提供给Element操作时,
 *      Element是将自己(this)提供给visit()操作的, 完美匹配通过类型重载的方法
 *
 * 优点:
 *      1. 拓展性非常强. 如果想要添加一个功能只要添加一个Visitor就好了.
 *          比如说这个例子中增加一个弃权票, 只需要写一个继承Action的弃权类, 在类里面分别实现Man和Woman的弃权操作即可
 * 缺点:
 *      1. 具体元素对访问者公布细节，也就是说访问者关注了其他类的内部细节，这是迪米特法则所不建议的, 这样造成了具体元素变更比较困难
 *      2. 违背了依赖倒转原则。访问者依赖的是具体元素，而不是抽象元素
 */
public class Main {
    public static void main(String[] args) {
        //数据库中只有一男一女
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.add(new Man());
        objectStructure.add(new Woman());

        //让他们都投赞成票
        objectStructure.voteAll(new Success());

        //都投反对票
        objectStructure.voteAll(new Fail());

        //具体的投票方式由ObjectStructure实现， 这里就简单的实现所有人投同一种票
    }
}
