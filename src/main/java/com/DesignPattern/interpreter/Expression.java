package com.DesignPattern.interpreter;

import java.util.HashMap;

/**
 * 表达式抽象类
 * 
 * @author Administrator
 *
 */
public abstract class Expression {
	// 比如表达式是: a + b - c
	// var这个Map中放的就是a, b, c的值
	// HashMap {a=10, b=20}
	public abstract int interpreter(HashMap<String, Integer> var);
}
