package com.DesignPattern.interpreter;

import java.util.HashMap;
import java.util.Stack;

/**
 * 计算器类
 *
 * 这里只实现了加减运算, 实现乘除会复杂很多, 这里只是设计模式的学习, 暂且放一放
 */
public class Calculator {

	// 这里定义计算表达式
	private Expression expression;

	// 构造函数, 解析输入的计算表达式
	public Calculator(String expStr) { // expStr = a+b
		// 用一个栈保存计算顺序
		Stack<Expression> stack = new Stack<>();
		// 将计算表达式拆分成字符数组, 方便遍历
		char[] charArray = expStr.toCharArray();// [a, +, b]

		Expression left = null;
		Expression right = null;

		//遍历表达式, 解析
		for (int i = 0; i < charArray.length; i++) {
			switch (charArray[i]) {
			case '+': //
				left = stack.pop();// 从栈中去除左边的数
				right = new VarExpression(String.valueOf(charArray[++i]));// 从数组中取出右边的数, i指向下一个字符
				stack.push(new AddExpression(left, right));// 将两个数相加的假发表达式放回栈中
				break;
			case '-':
				left = stack.pop();
				right = new VarExpression(String.valueOf(charArray[++i]));
				stack.push(new SubExpression(left, right));
				break;
			default: 
				//根据表达式中的变量名创建变量表达式, 在计算的时候根据这个名字获取数值
				stack.push(new VarExpression(String.valueOf(charArray[i])));
				break;
			}
		}
		//最终栈中存放的就是整个表达式解析的结果
		this.expression = stack.pop();
	}

	//执行表达式
	public int run(HashMap<String, Integer> var) {
		//实际上这是一个递归的过程, 从右到左递归, 然后从左到右一步步返回结果
		return this.expression.interpreter(var);
	}
}