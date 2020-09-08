package com.DesignPattern.responsibilityChain;

/**
 * 审批人抽象类
 */
public abstract class Approver {
    protected Approver nextApprover;//下一个审批人
    protected String name;

    public Approver(String name) {
        this.name = name;
    }

    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    public abstract void processRequest(PurchaseRequest purchaseRequest);
}
