package com.DesignPattern.template;

//豆浆抽象类
public abstract class SoyaMilk {

	//使用final修饰, 防止子类修改
	final void make() {
		
		select(); 
		addCondiments();
		soak();
		beat();
		
	}
	
	//挑选原材料
	void select() {
		System.out.println("挑选原材料");
	}
	
	//添加配料, 提供给子类自定义实现
	abstract void addCondiments();
	
	//浸泡
	void soak() {
		System.out.println("黄豆和配料开始浸泡， 需要 3 小时");
	}
	 
	void beat() {
		System.out.println("第四步：黄豆和配料放到豆浆机去打碎");
	}
}
