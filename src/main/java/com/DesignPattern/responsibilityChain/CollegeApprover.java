package com.DesignPattern.responsibilityChain;

public class CollegeApprover extends Approver {

	public CollegeApprover(String name) {
		super(name);
	}
	
	@Override
	public void processRequest(PurchaseRequest purchaseRequest) {
		if(purchaseRequest.getPrice() <= 10000) {
			System.out.println("purchase id= " + purchaseRequest.getId() + " is approved by " + this.name);
		}else {
			nextApprover.processRequest(purchaseRequest);
		}
	}
}
