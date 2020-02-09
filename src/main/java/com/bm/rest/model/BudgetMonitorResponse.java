package com.bm.rest.model;

public class BudgetMonitorResponse {

  private String requestId;
  private String responseCode;
  private String responseMessage;
  private int totalMoney;

  public int getTotalMoney() {
    return totalMoney;
  }

  public void setTotalMoney(int totalMoney) {
    this.totalMoney = totalMoney;
  }

  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public String getResponseCode() {
    return responseCode;
  }

  public void setResponseCode(String responseCode) {
    this.responseCode = responseCode;
  }

  public String getResponseMessage() {
    return responseMessage;
  }

  public void setResponseMessage(String responseMessage) {
    this.responseMessage = responseMessage;
  }

}
