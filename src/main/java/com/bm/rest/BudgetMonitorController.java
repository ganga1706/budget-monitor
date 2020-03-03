package com.bm.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bm.exceptions.BudgetException;
import com.bm.rest.model.AddBudgetUserRequest;
import com.bm.rest.model.AddBudgetUserResponse;
import com.bm.rest.model.AddNewUserRequest;
import com.bm.rest.model.AddNewUserResponse;
import com.bm.rest.model.ResponseContext;
import com.bm.rest.service.AddBudgetUserService;
import com.bm.rest.service.AddNewUserService;
import com.bm.rest.service.BudgetMonitorService;

@RestController
@RequestMapping(value = "/rest/service", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
public class BudgetMonitorController {

	@Autowired
	BudgetMonitorService getTotelMoneyService;

	@Autowired
	AddNewUserService addNewUserService;

	@Autowired
	AddBudgetUserService addBudgetUserService;

	// @PostMapping(value = "/getTotelMoney")
	// public BudgetMonitorResponse getTotelMoney(@RequestBody BudgetMonitorRequest
	// budgetMonitorRequest) {
	// BudgetMonitorResponse budgetMonitorResponse = new BudgetMonitorResponse();
	//
	// budgetMonitorResponse.setRequestId("1");
	// budgetMonitorResponse.setResponseCode("0000");
	// budgetMonitorResponse.setResponseMessage("success");
	// budgetMonitorResponse.setTotalMoney(100);
	// return budgetMonitorResponse;
	// }
	//
	// @PostMapping(value = "/setBudget")
	// public BudgetMonitorResponse setBudget(@RequestBody BudgetMonitorRequest
	// budgetMonitorRequest) {
	// BudgetMonitorResponse budgetMonitorResponse = new BudgetMonitorResponse();
	//
	// if (budgetMonitorRequest.getTotalAmount() == 0) {
	//
	// } else {
	// budgetMonitorResponse.setRequestId("1");
	// budgetMonitorResponse.setResponseCode("1001");
	// budgetMonitorResponse.setResponseMessage("budget should not Zero please enter
	// valid amount");
	// }
	//
	// budgetMonitorResponse.setRequestId("1");
	// budgetMonitorResponse.setResponseCode("0000");
	// budgetMonitorResponse.setResponseMessage("success");
	// return budgetMonitorResponse;
	// }

	@PostMapping(value = "/addNewUser")
	public AddNewUserResponse addNewUser(@RequestBody AddNewUserRequest newUserRequest) {
		AddNewUserResponse newUserResponse = new AddNewUserResponse();
		ResponseContext responseContext = new ResponseContext();
		if ((newUserRequest.getRequestContext() == null) || (newUserRequest.getUserName() == null)) {
			System.err.println("throw error to service");
			responseContext.setRequestId(newUserRequest.getRequestContext().getRequestId());
			responseContext.setResponseCode("1001");
			responseContext.setResponseMessage("invalid request");
			newUserResponse.setResponseContext(responseContext);
			return newUserResponse;
		} else if (newUserRequest.getUserName().isEmpty()) {
			responseContext.setRequestId(newUserRequest.getRequestContext().getRequestId());
			responseContext.setResponseCode("1003");
			responseContext.setResponseMessage("please provide valid user name ");
			newUserResponse.setResponseContext(responseContext);
			return newUserResponse;

		}

		try {
			newUserResponse = addNewUserService.saveNewUser(newUserRequest);
			return newUserResponse;
		} catch (BudgetException e) {
			responseContext.setRequestId(newUserRequest.getRequestContext().getRequestId());
			responseContext.setResponseCode(e.getStatus());
			responseContext.setResponseMessage(e.getStatusMessage());
			newUserResponse.setResponseContext(responseContext);
			return newUserResponse;
		}
	}

	@PostMapping(value = "/addbudget")
	public AddBudgetUserResponse addBudgetUser(@RequestBody AddBudgetUserRequest newAddBudgetUserRequest) {
		AddBudgetUserResponse newAddBudgetUserResponse = new AddBudgetUserResponse();
		ResponseContext responseContext = new ResponseContext();
		if ((newAddBudgetUserRequest.getRequestContext() == null) || (newAddBudgetUserRequest.getUserName() == null)) {
			System.err.println("throw error to service");
			responseContext.setRequestId(newAddBudgetUserRequest.getRequestContext().getRequestId());
			responseContext.setResponseCode("1001");
			responseContext.setResponseMessage("invalid request");
			newAddBudgetUserResponse.setResponseContext(responseContext);
			return newAddBudgetUserResponse;
		} else if (newAddBudgetUserRequest.getUserName().isEmpty()) {
			responseContext.setRequestId(newAddBudgetUserRequest.getRequestContext().getRequestId());
			responseContext.setResponseCode("1003");
			responseContext.setResponseMessage("please provide valid user name ");
			newAddBudgetUserResponse.setResponseContext(responseContext);
			return newAddBudgetUserResponse;
		}
		try {
			newAddBudgetUserResponse = addBudgetUserService.addBudgetUser(newAddBudgetUserRequest);
		} catch (BudgetException e) {
			responseContext.setRequestId(newAddBudgetUserRequest.getRequestContext().getRequestId());
			responseContext.setResponseCode(e.getStatus());
			responseContext.setResponseMessage(e.getStatusMessage());
			newAddBudgetUserResponse.setResponseContext(responseContext);
			return newAddBudgetUserResponse;
		}
		return newAddBudgetUserResponse;
	}

}
