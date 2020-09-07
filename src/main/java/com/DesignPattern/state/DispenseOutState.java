package com.DesignPattern.state;

/**
 * 奖品发完的状态
 * @author Administrator
 *
 */
public class DispenseOutState extends State {

    RaffleActivity activity;

    public DispenseOutState(RaffleActivity activity) {
        this.activity = activity;
    }
    @Override
    public void deductMoney() {
        System.out.println("奖品已经发放完了, 下次再来吧");
    }

    @Override
    public boolean raffle() {
        System.out.println("奖品已经发放完了, 下次再来吧");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("奖品已经发放完了, 下次再来吧");
    }
}
