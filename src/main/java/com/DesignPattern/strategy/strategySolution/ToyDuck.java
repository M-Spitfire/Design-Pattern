package com.DesignPattern.strategy.strategySolution;

public class ToyDuck extends Duck{

	
	public ToyDuck() {
		//飞行能力设置为不会飞行
		flyBehavior = new NoFlyBehavior();
	}
	
	@Override
	public void display() {
		System.out.println("玩具鸭");
	}

	@Override
	public void quack() {
		System.out.println("玩具鸭不会叫");
	}

	@Override
	public void swim() {
		System.out.println("玩具鸭学游泳");
	}
	
	
}
