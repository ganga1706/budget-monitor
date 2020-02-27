package com.bm.rest.service;

import com.bm.rest.model.BudgetMonitorRequest;
import com.bm.rest.model.BudgetMonitorResponse;

public interface BudgetMonitorService {

  BudgetMonitorResponse getTotelMoney();
  
  void setBudget(BudgetMonitorRequest budgetMonitorRequest);

}
