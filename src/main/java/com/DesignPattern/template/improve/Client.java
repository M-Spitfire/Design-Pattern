package com.DesignPattern.template.improve;

public class Client {

	public static void main(String[] args) {
		
		System.out.println("---- 制 作 红 豆 豆 浆 ----");
		SoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
		redBeanSoyaMilk.make();
		
		System.out.println("---- 制 作 花 生 豆 浆 ----");
		SoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
		peanutSoyaMilk.make();
		
		System.out.println("----纯 豆 浆----");
		SoyaMilk pureSoyaMilk = new PureSoyaMilk();
		pureSoyaMilk.make();
	}

}
