package com.DesignPattern.responsibilityChain;

public class SchoolMasterApprover extends Approver {

	public SchoolMasterApprover(String name) {
		super(name);
	}
	
	@Override
	public void processRequest(PurchaseRequest purchaseRequest) {
		if(purchaseRequest.getPrice() > 30000) {
			System.out.println("purchase id= " + purchaseRequest.getId() + " is approved by " + this.name);
		}else {
			nextApprover.processRequest(purchaseRequest);
		}
	}
}
