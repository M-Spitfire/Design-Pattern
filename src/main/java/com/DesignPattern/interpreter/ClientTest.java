package com.DesignPattern.interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * 解释器模式
 *
 * 当有一个语言需要解释执行，可将该语言中的句子表示为一个抽象语法树，就可以考虑使用解释器模式，让程序具有良好的扩展性
 *
 * 应用场景：编译器、运算表达式计算、正则表达式、机器人等
 *
 * 使用解释器可能带来的问题：
 *      1. 解释器模式会引起类膨胀、
 *      2. 解释器模式采用递归调用方法，将会导致调试非常复杂、效率可能降低
 */
public class ClientTest {

	public static void main(String[] args) throws IOException {
		String expStr = getExpStr(); // a+b
		HashMap<String, Integer> var = getValue(expStr);// var {a=10, b=20}
		Calculator calculator = new Calculator(expStr);
		System.out.println("计算结果:" + expStr + "=" + calculator.run(var));
	}

	// 输入表达式
	public static String getExpStr() throws IOException {
		System.out.print("输入表达式:");
		return (new BufferedReader(new InputStreamReader(System.in))).readLine();
	}

	// 根据表达式, 去除除运算符之外的所有变量, 当作key
	public static HashMap<String, Integer> getValue(String expStr) throws IOException {
		HashMap<String, Integer> map = new HashMap<>();

		for (char ch : expStr.toCharArray()) {
			if (ch != '+' && ch != '-') {
				if (!map.containsKey(String.valueOf(ch))) {
					System.out.print("输入" + String.valueOf(ch) + ":");
					String in = (new BufferedReader(new InputStreamReader(System.in))).readLine();
					map.put(String.valueOf(ch), Integer.valueOf(in));
				}
			}
		}

		return map;
	}
}
