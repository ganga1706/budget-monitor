
package com.bm.rest.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @since 28-02-2020
 * @author Gangadhar Chitra
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RequestContext implements Serializable {

  private static final long serialVersionUID = -2922309949367459503L;
  private String requestId;
  private String requesterId;
  private String correlationId;
  

  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public String getRequesterId() {
    return requesterId;
  }

  public void setRequesterId(String requesterId) {
    this.requesterId = requesterId;
  }

  public String getCorrelationId() {
    return correlationId;
  }

  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("RequestContext [requestId=");
    sb.append(requestId);
    sb.append(", requesterId=");
    sb.append(requesterId);
    sb.append(", correlationId=");
    sb.append(correlationId);
    sb.append("]");
    return sb.toString();
  }

}
