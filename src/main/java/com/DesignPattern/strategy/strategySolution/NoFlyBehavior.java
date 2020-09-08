package com.DesignPattern.strategy.strategySolution;

public class NoFlyBehavior implements Fly{

	@Override
	public void fly() {
		System.out.println("我好像不会飞");
	}

}
