package com.DesignPattern.strategy.strategySolution;

/**
 * 鸭子抽象类
 *
 * "叫"和"游泳"两个行为没有使用策略模式, "飞行"使用了策略模式
 */
public abstract class Duck {

	Fly flyBehavior;

	public abstract void display();
	
	public void quack() {
		System.out.println("嘎嘎嘎~~");
	}
	
	public void swim() {
		System.out.println("游泳");
	}
	
	public void fly() {

		if(flyBehavior != null) {
			flyBehavior.fly();
		}
	}

	public void setFlyBehavior(Fly flyBehavior) {
		this.flyBehavior = flyBehavior;
	}



}
