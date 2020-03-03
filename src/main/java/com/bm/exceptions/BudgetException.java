package com.bm.exceptions;

public class BudgetException extends Exception {

	private static final long serialVersionUID = 2970053612299937253L;

	private String status;

	private String statusMessage;

	public BudgetException(String status) {
		super();
		this.status = status;
	}

	public BudgetException(String status, String statusMessage) {
		super();
		this.status = status;
		this.statusMessage = statusMessage;
	}

	public String getStatus() {
		return status;
	}

	public String getStatusMessage() {
		return statusMessage;
	}

}
