package com.DesignPattern.interpreter;

import java.util.HashMap;


/**
 * 变量解释器
 *
 * 每一个变量解释器的对象代表表达式中的一个值
 * @author Administrator
 *
 */
public class VarExpression extends Expression {

	private String key; // key=a,key=b,key=c

	public VarExpression(String key) {
		this.key = key;
	}

	// 根据当前变量的名字获取值
	@Override
	public int interpreter(HashMap<String, Integer> var) {
		return var.get(this.key);
	}
}
