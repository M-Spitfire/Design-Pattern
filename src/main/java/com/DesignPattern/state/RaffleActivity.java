package com.DesignPattern.state;

/**
 * 抽奖类
 * 
 * @author Administrator
 *
 */
public class RaffleActivity {

	// 用来表示当前状态
    private State state = null;
    // 记录奖品的数量
    private int count = 0;
    //剩余金钱
    private int balance;
    
    // 先创建好可能使用到的状态
    private State noRaffleState = new NoRaffleState(this);
    private State canRaffleState = new CanRaffleState(this);

    private State dispenseState =   new DispenseState(this);
    private State dispenseOutState = new DispenseOutState(this);

    //构造函数
    public RaffleActivity( int count, int balance) {
        //初始状态为不能抽奖状态(没有扣除积分)
        this.state = getNoRaffleState();
        //初始化奖品数量
        this.count = count;
        //初始化金钱
        this.balance = balance;
    }

    //扣钱抽奖
    public void deductMoney(){
        state.deductMoney();
    }

    //抽奖
    public void raffle(){
    	//只有在可抽奖状态且抽中才会返回true
        if(state.raffle()){
        	//在可抽奖状态且抽中会将状态切换为允许发放奖品, 抽中了发放奖品
            state.dispensePrize();
        }

    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    //扣钱
    public boolean cost(){
        if(balance < 50){
            return false;
        }
        balance -= 50;
        return true;
    }

    //退钱
    public void recovery(){
        balance += 50;
    }

    // 库存减一
    public int getCount() {
    	int curCount = count; 
    	count--;
        return curCount;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public State getNoRaffleState() {
        return noRaffleState;
    }

    public void setNoRaffleState(State noRaffleState) {
        this.noRaffleState = noRaffleState;
    }

    public State getCanRaffleState() {
        return canRaffleState;
    }

    public void setCanRaffleState(State canRaffleState) {
        this.canRaffleState = canRaffleState;
    }

    public State getDispenseState() {
        return dispenseState;
    }

    public void setDispenseState(State dispenseState) {
        this.dispenseState = dispenseState;
    }

    public State getDispenseOutState() {
        return dispenseOutState;
    }

    public void setDispenseOutState(State dispenseOutState) {
        this.dispenseOutState = dispenseOutState;
    }
}
