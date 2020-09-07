package com.DesignPattern.interpreter;

import java.util.HashMap;

/**
 * 减法解析器
 *
 * 与AddExpression类似的东西
 */
public class SubExpression extends SymbolExpression {

	public SubExpression(Expression left, Expression right) {
		super(left, right);
	}

	public int interpreter(HashMap<String, Integer> var) {
		return super.left.interpreter(var) - super.right.interpreter(var);
	}
}
