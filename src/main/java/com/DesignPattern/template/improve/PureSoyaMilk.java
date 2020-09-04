package com.DesignPattern.template.improve;

public class PureSoyaMilk extends SoyaMilk{

	@Override
	//纯豆浆不添加配料, 空实现
	void addCondiments() {}
	
	@Override
	//纯豆浆不添加配料
	boolean customerWantCondiments() {
		return false;
	}
 
}
