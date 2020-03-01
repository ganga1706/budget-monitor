package com.bm.rest.service;

import com.bm.exceptions.BudgetException;
import com.bm.rest.model.AddNewUserRequest;
import com.bm.rest.model.AddNewUserResponse;

public interface AddNewUserService {

  AddNewUserResponse saveNewUser(AddNewUserRequest addNewUserRequest) throws BudgetException;

}
