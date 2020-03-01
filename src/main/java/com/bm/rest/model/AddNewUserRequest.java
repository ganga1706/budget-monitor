package com.bm.rest.model;

/**
 * @since 28-02-2020
 * @author Gangadhar Chitra
 *
 */
public class AddNewUserRequest {

  private RequestContext requestContext;
  private String userName;
  private String password;

  public RequestContext getRequestContext() {
    return requestContext;
  }

  public void setRequestContext(RequestContext requestContext) {
    this.requestContext = requestContext;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public String toString() {
    return "AddNewUserRequest [requestContext=" + requestContext + ", userName=" + userName + ", password=" + password + "]";
  }

}
