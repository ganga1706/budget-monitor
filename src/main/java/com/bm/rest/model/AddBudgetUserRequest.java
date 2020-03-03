package com.bm.rest.model;

public class AddBudgetUserRequest {

	private int totalBudgetAmount;
	private String userName;
	 private RequestContext requestContext;

	public RequestContext getRequestContext() {
		return requestContext;
	}

	public void setRequestContext(RequestContext requestContext) {
		this.requestContext = requestContext;
	}

	public int getTotalBudgetAmount() {
		return totalBudgetAmount;
	}

	public void setTotalBudgetAmount(int totalBudgetAmount) {
		this.totalBudgetAmount = totalBudgetAmount;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "AddBudgetUserRequest [totalBudgetAmount=" + totalBudgetAmount + ", userName=" + userName + "]";
	}
}
