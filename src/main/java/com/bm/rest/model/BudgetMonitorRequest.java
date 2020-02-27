package com.bm.rest.model;

public class BudgetMonitorRequest {

  private int totalAmount;
  private int avalibleAmount;
  private String comments;
  private int newAmount;

  public int getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(int totalAmount) {
    this.totalAmount = totalAmount;
  }

  public int getAvalibleAmount() {
    return avalibleAmount;
  }

  public void setAvalibleAmount(int avalibleAmount) {
    this.avalibleAmount = avalibleAmount;
  }

  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  public int getNewAmount() {
    return newAmount;
  }

  public void setNewAmount(int newAmount) {
    this.newAmount = newAmount;
  }

}
