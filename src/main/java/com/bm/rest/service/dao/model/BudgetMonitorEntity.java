package com.bm.rest.service.dao.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @since 28-02-2020
 * @author Gangadhar Chitra
 *
 */

@Entity
@Table(name = "BM_DETAILS_NEW")
public class BudgetMonitorEntity implements Serializable {

  private static final long serialVersionUID = 4291564255898904283L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "ID")
  private int id;

  @Column(name = "USER_NAME")
  private String userName;

  @Column(name = "USER_PASSWORD")
  private String password;

  @Column(name = "TOTAL_BUDGET_AMOUNT")
  private int totalBudgetAmount;

  @Column(name = "AVALIBLE_AMOUNT")
  private int avalibleAmount;

  @Column(name = "USER_COMMENTS")
  private String UserComments;

  @Column(name = "new_Amount")
  private int newAmount;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getNewAmount() {
    return newAmount;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getUserComments() {
    return UserComments;
  }

  public void setUserComments(String userComments) {
    UserComments = userComments;
  }

  public void setNewAmount(int newAmount) {
    this.newAmount = newAmount;
  }

  public int getTotalBudgetAmount() {
    return totalBudgetAmount;
  }

  public void setTotalBudgetAmount(int totalBudgetAmount) {
    this.totalBudgetAmount = totalBudgetAmount;
  }

  public int getAvalibleAmount() {
    return avalibleAmount;
  }

  public void setAvalibleAmount(int avalibleAmount) {
    this.avalibleAmount = avalibleAmount;
  }

}
