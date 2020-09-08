package com.DesignPattern.strategy.strategySolution;

public class WildDuck extends Duck {

	public  WildDuck() {
		//飞行能力设置为擅长飞行
		flyBehavior = new GoodFlyBehavior();
	}
	
	
	@Override
	public void display() {
		System.out.println("野鸭在此");
	}

}
