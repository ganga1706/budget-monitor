package com.bm.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bm.rest.model.BudgetMonitorRequest;
import com.bm.rest.model.BudgetMonitorResponse;
import com.bm.rest.model.GetTotelMoneyRequest;
import com.bm.rest.model.GetTotelMoneyResponse;
import com.bm.rest.service.GetTotelMoneyService;

@RestController
@RequestMapping(value = "/rest/service", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
public class BudgetMonitorController {
  
  @Autowired
  GetTotelMoneyService getTotelMoneyService;

  @PostMapping(value = "/getTotelMoney")
  public BudgetMonitorResponse getTotelMoney(@RequestBody BudgetMonitorRequest budgetMonitorRequest) {
    BudgetMonitorResponse budgetMonitorResponse = new BudgetMonitorResponse();
        
    budgetMonitorResponse.setRequestId("1");
    budgetMonitorResponse.setResponseCode("0000");
    budgetMonitorResponse.setResponseMessage("success");
    budgetMonitorResponse.setTotalMoney(100);
    return budgetMonitorResponse;
  }

}
