package com.DesignPattern.facade;

/**
 * 外观模式
 *
 * 应该说也是一种比较常用的设计模式了
 *
 * 如果一次性要用到很多个类的管理类或配置类, 将它们全部都注入进来似乎不是一个优雅的方法,
 * 因此我们使用一个外观类, 将这些管理类或配置类注入进去, 并实现一些方法供其他类使用
 * Mybatis Plus的代码生成器就是用了类似的模式
 */
public class Client {

	public static void main(String[] args) {
		HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
		homeTheaterFacade.ready();
		homeTheaterFacade.play();
		
		
		homeTheaterFacade.end();
	}

}
