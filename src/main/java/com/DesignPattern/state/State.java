package com.DesignPattern.state;

/**
 * 状态抽象类
 *
 * 所有的状态都会实现这里面的三个方法, 但是不同的状态有不同的实现
 * 比如说还没交钱, 那么只有deductMoney()是有实际效果, 其他两个都是空实现或无效实现
 *
 * @author Administrator
 *
 */
public abstract class State {

	
	// 扣除积分(抽奖的消耗)
    public abstract void deductMoney();

    // 判断是否中奖
    public abstract boolean raffle();

    // 发放奖品
    public abstract  void dispensePrize();

}
