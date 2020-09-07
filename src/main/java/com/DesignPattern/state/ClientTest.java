package com.DesignPattern.state;

/**
 * 状态模式
 *
 * 这个模式的关键是在类内部先获取所有可能的状态, 状态间的切换由状态内部的方法决定,
 * 为了使用上保持统一, 所有的状态都应该实现相同的方法
 * 状态发生改变时, 在外部看起来没有变化, 但实际上里面的状态已经改变
 *
 * 这个例子的状态:
 *      NoRaffleState:初始状态, 没有交钱, 不允许抽奖
 *      CanRaffleState:交钱之后, 允许抽奖, 这里会实现具体的抽奖
 *      DispenseState:抽中之后的状态, 允许发放奖品
 *      DispenseOutState:奖品发完的状态, 会导致以后所有的抽奖失败
 *
 * 优点:
 *      1. 代码有很强的可读性。状态模式将每个状态的行为封装到对应的一个类中
 *      2. 方便维护, 不会喊声很多的if else语句
 *      3. 符合"开闭原则"。容易增删状态
 * 缺点:
 *      1. 每个状态都要一个对应的类，当状态过多时会产生很多类，加大维护难度
 *
 */
public class ClientTest {

	public static void main(String[] args) {
	    //只有一个奖品, 余额323元
        RaffleActivity activity = new RaffleActivity(1, 323);

        // 三次十连
        for (int i = 0; i < 30; i++) {
            System.out.println("--------第" + (i + 1) + "次----------");
            // 扣钱
            activity.deductMoney();

            // 抽奖
            activity.raffle();
        }
	}

}
