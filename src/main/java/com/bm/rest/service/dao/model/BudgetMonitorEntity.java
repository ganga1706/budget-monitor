package com.bm.rest.service.dao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BM_DETAILS_NEW")
public class BudgetMonitorEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  @Column(name = "ID")
  private int id;

  @Column(name = "NAME")
  private String name;

  @Column(name = "TOTAL_BUDGET_AMOUNT")
  private int totalBudgetAmount;

  @Column(name = "AVALIBLE_AMOUNT")
  private int avalibleAmount;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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
