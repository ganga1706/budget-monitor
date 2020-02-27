package com.bm.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bm.rest.model.BudgetMonitorRequest;
import com.bm.rest.model.BudgetMonitorResponse;
import com.bm.rest.service.BudgetMonitorService;

@RestController
@RequestMapping(value = "/rest/service", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
public class BudgetMonitorController {
  
  @Autowired
  BudgetMonitorService getTotelMoneyService;
  
  

  @PostMapping(value = "/getTotelMoney")
  public BudgetMonitorResponse getTotelMoney(@RequestBody BudgetMonitorRequest budgetMonitorRequest) {
    BudgetMonitorResponse budgetMonitorResponse = new BudgetMonitorResponse();
        
    budgetMonitorResponse.setRequestId("1");
    budgetMonitorResponse.setResponseCode("0000");
    budgetMonitorResponse.setResponseMessage("success");
    budgetMonitorResponse.setTotalMoney(100);
    return budgetMonitorResponse;
  }
  
  
  @PostMapping(value = "/setBudget")
  public BudgetMonitorResponse setBudget(@RequestBody BudgetMonitorRequest budgetMonitorRequest) {
    BudgetMonitorResponse budgetMonitorResponse = new BudgetMonitorResponse();
     
    
    
    if(budgetMonitorRequest.getTotalAmount() == 0) {
      
      
      
      
    }else {
      budgetMonitorResponse.setRequestId("1");
      budgetMonitorResponse.setResponseCode("1001");
      budgetMonitorResponse.setResponseMessage("budget should not Zero please enter valid amount");
    }
    
    
    budgetMonitorResponse.setRequestId("1");
    budgetMonitorResponse.setResponseCode("0000");
    budgetMonitorResponse.setResponseMessage("success");
    return budgetMonitorResponse;
  }

}
