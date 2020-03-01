package com.bm.rest.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @since 28-02-2020
 * @author Gangadhar Chitra
 *
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseContext implements Serializable {

  private static final long serialVersionUID = -1106236636847380193L;
  private String requestId;
  private String responseCode;
  private String responseMessage;

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

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append(">>> ResponseContext [");
    builder.append(super.toString());
    builder.append(", requestId=");
    builder.append(requestId);
    builder.append(", responseCode=");
    builder.append(responseCode);
    builder.append(", responseMessage=");
    builder.append(responseMessage);
    builder.append("]");
    return builder.toString();
  }

}
