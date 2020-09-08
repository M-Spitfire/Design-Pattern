package com.DesignPattern.strategy.strategySolution;

public class BadFlyBehavior implements Fly {

	@Override
	public void fly() {
		System.out.println("鄙鸭不善于飞行");
	}

}
