package com.bm.rest.model;


/**
 * @since 28-02-2020
 * @author Gangadhar Chitra
 *
 */
public class BudgetMonitorRequest {

  private RequestContext requestContext;
  private int totalAmount;
  private int avalibleAmount;
  private String comments;
  private int newAmount;

  public RequestContext getRequestContext() {
    return requestContext;
  }

  public void setRequestContext(RequestContext requestContext) {
    this.requestContext = requestContext;
  }

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

  @Override
  public String toString() {
    return "BudgetMonitorRequest [requestContext=" + requestContext + ", totalAmount=" + totalAmount + ", avalibleAmount=" + avalibleAmount + ", comments=" + comments
      + ", newAmount=" + newAmount + "]";
  }

}
