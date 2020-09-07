package com.DesignPattern.interpreter;

import java.util.HashMap;

/**
 * 加法解析器
 * @author Administrator
 *
 */
public class AddExpression extends SymbolExpression  {

	//构造函数
	public AddExpression(Expression left, Expression right) {
		super(left, right);
	}

	public int interpreter(HashMap<String, Integer> var) {
		//left和right是定义在父类SymbolExpression中的两个Expression(VarExpression)
		//通过interpreter方法获取到值后计算
		return left.interpreter(var) + right.interpreter(var);
	}
}
