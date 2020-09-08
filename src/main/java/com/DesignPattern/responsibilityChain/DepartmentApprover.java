package com.DesignPattern.responsibilityChain;

public class DepartmentApprover extends Approver {

	
	public DepartmentApprover(String name) {
		super(name);
	}
	
	@Override
	public void processRequest(PurchaseRequest purchaseRequest) {
		if(purchaseRequest.getPrice() <= 5000) {
			System.out.println("purchase id= " + purchaseRequest.getId() + " is approved by " + this.name);
		}else {
			nextApprover.processRequest(purchaseRequest);
		}
	}

}
