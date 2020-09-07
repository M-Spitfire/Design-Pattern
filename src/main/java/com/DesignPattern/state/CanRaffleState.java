package com.DesignPattern.state;

import java.util.Random;

/**
 * 允许抽奖状态
 * @author Administrator
 *
 */
public class CanRaffleState extends State {

    RaffleActivity activity;

    public CanRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    //当前状态为允许抽奖状态, 已经扣除积分
    @Override
    public void deductMoney() {
        System.out.println("积分已经扣除了呦");
    }

    //抽奖
    @Override
    public boolean raffle() {
        System.out.println("抽奖开始!");
        Random r = new Random();
        int num = r.nextInt(10);
        if(num < 5){
            // 抽中奖品, 将状态设置为允许获取奖品状态
            activity.setState(activity.getDispenseState());
            return true;
        }else{
            System.out.println("很遗憾, 没有抽中, 请再接再厉");
            // 重新将状态设置为不允许抽奖状态
            activity.setState(activity.getNoRaffleState());
            return false;
        }
    }

    // 当前状态是允许抽奖, 不能发放奖品
    @Override
    public void dispensePrize() {
        System.out.println("抽中了才能领取哦~~");
    }
}
