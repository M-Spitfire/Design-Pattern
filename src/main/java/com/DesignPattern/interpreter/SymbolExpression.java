package com.DesignPattern.interpreter;

import java.util.HashMap;

/**
 * 符号表达式
 *
 * 每一个符号表达式表示一个运算符, 运算符只和运算符两边的数字有关
 * (这个数字可能是解析器解析的结果, 但是没关系, 不管怎么样都是Expression的子类)
 *
 * 这仍然可以写成抽象类, 因为真正有用的一定是继承符号表达式的运算符类, 比如说加减乘除
 * 
 * @author Administrator
 *
 */
public class SymbolExpression extends Expression {

	protected Expression left;
	protected Expression right;

	public SymbolExpression(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	//这里空实现即可, 具体的实现根据不同的运算符, 由不同的子类实现
	@Override
	public int interpreter(HashMap<String, Integer> var) {
		return 0;
	}
}
