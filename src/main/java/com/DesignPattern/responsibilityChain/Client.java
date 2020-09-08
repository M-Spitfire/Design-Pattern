package com.DesignPattern.responsibilityChain;

/**
 * 职责链模式
 *
 *  最佳应用场景：有多个对象可以处理同一个请求时，比如：
 *  	1. 多级请求
 *  	2. 请假/加薪等审批流程、
 *  	3. Java Web 中 Tomcat对 Encoding 的处理、
 *  	4. 拦截器
 *
 * 优点:
 * 		1. 将请求和处理分开，实现解耦，提高系统的灵活性
 * 		2. 简化了对象，使对象不需要知道链的结构
 * 缺点:
 * 		1. 性能会受到影响，特别是在链比较长的时候，因此需控制链中最大节点数量，
 * 		   一般通过在Handler中设置一个最大节点数量，在 setNext()方法中判断是否已经超过阀值，
 * 		   超过则不允许该链建立，避免出现超长链无意识地破坏系统性能
 * 		2. 调试不方便。采用了类似递归的方式，调试时逻辑可能比较复杂
 */
public class Client {

	public static void main(String[] args) {
		//创建采购请求
		PurchaseRequest purchaseRequest = new PurchaseRequest(1, 21000, 1);
		
		//创建各级审批人
		DepartmentApprover departmentApprover = new DepartmentApprover("张主任");
		CollegeApprover collegeApprover = new CollegeApprover("李院长");
		ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("王副校长");
		SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("朱校长");
	
	
		//将责任链连成环状, 环状的目的是有时会直接提交给较高权限的审批人审批, 河阳能让请求回到起点开始
		departmentApprover.setNextApprover(collegeApprover);
		collegeApprover.setNextApprover(viceSchoolMasterApprover);
		viceSchoolMasterApprover.setNextApprover(schoolMasterApprover);
		schoolMasterApprover.setNextApprover(departmentApprover);
		
		//向权限最低的审批人发起请求
		departmentApprover.processRequest(purchaseRequest);
		//向权限最高的审批人发起请求
		viceSchoolMasterApprover.processRequest(purchaseRequest);
	}

}
