package com.DesignPattern.strategy.strategySolution;

public class PekingDuck extends Duck {

	public PekingDuck() {
		//飞行能力设置为不擅长飞行
		flyBehavior = new BadFlyBehavior();
		
	}
	
	@Override
	public void display() {
		System.out.println("北京鸭");
	}
	
	

}
