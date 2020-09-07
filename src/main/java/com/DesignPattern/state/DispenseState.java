package com.DesignPattern.state;

/**
 * 允许发放奖品状态
 * @author Administrator
 *
 */
public class DispenseState extends State {

    RaffleActivity activity;

    public DispenseState(RaffleActivity activity) {
        this.activity = activity;
    }
    
    //

    @Override
    public void deductMoney() {
        System.out.println("积分已经扣除了呦");
    }

    @Override
    public boolean raffle() {
        System.out.println("已经抽过了哦");
        return false;
    }

    //发放奖品
    @Override
    public void dispensePrize() {
        if(activity.getCount() > 0){
            System.out.println("奖品发放成功");
            // 将状态重新设置为不允许抽奖
            activity.setState(activity.getNoRaffleState());
        }else{
            System.out.println("仓库里已经没有奖品了啦");
            //将状态设置为没有库存状态
            activity.setState(activity.getDispenseOutState());
        }

    }
}
