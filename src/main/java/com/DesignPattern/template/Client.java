package com.DesignPattern.template;

/**
 * 模板模式
 *
 * 形式上和工厂模式很像, 两者都是将一部分实现延迟到子类去完成
 * 工厂模式关注的时生产一个完成的产品, 模板模式关注的时完成一件事的所有步骤及执行顺序
 *
 */
public class Client {

	public static void main(String[] args) {
		
		System.out.println("----制作红豆豆浆----");
		SoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
		redBeanSoyaMilk.make();
		
		System.out.println("---- 制 作 花 生 豆 浆 ----");
		SoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
		peanutSoyaMilk.make();
	}

}
