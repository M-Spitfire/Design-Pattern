package com.DesignPattern.state;

/**
 * 不能抽奖状态(需要扣除积分)
 * @author Administrator
 *
 */
public class NoRaffleState extends State {

	 // 抽奖行为
    RaffleActivity activity;

    public NoRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    //
    @Override
    public void deductMoney() {

        boolean flag = activity.cost();
        if(flag){
            System.out.println("积分-50, 允许抽奖~~  当前余额:" + activity.getBalance());
            //将抽奖活动设置为允许抽奖状态
            activity.setState(activity.getCanRaffleState());
        }
        else{
            System.out.println("余额不足, 请及时充值  当前余额:" + activity.getBalance());
            //已经是不允许抽奖状态, 这就不用改了
        }
    }

    // 抽奖(当前状态为不允许抽奖)
    @Override
    public boolean raffle() {
        System.out.println("请先缴纳积分再抽奖");
        return false;
    }

    // 当前状态不能发放奖品
    @Override
    public void dispensePrize() {
        System.out.println("请先抽奖, 抽中了才能发放奖品哦");
    }
}
