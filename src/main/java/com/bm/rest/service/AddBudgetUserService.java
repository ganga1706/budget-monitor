package com.bm.rest.service;

import com.bm.exceptions.BudgetException;
import com.bm.rest.model.AddBudgetUserRequest;
import com.bm.rest.model.AddBudgetUserResponse;

public interface AddBudgetUserService {
	
	AddBudgetUserResponse addBudgetUser(AddBudgetUserRequest addBudgetUserRequest) throws BudgetException;	

}
