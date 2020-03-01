package com.bm.rest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bm.exceptions.BudgetException;
import com.bm.rest.model.AddNewUserRequest;
import com.bm.rest.model.AddNewUserResponse;
import com.bm.rest.model.ResponseContext;
import com.bm.rest.service.AddNewUserService;
import com.bm.rest.service.dao.BudgetMonitorDao;
import com.bm.rest.service.dao.model.BudgetMonitorEntity;

@Service
public class AddNewUserServiceImpl implements AddNewUserService {

  @Autowired
  BudgetMonitorDao budgetMonitorDao;

  @Override
  public AddNewUserResponse saveNewUser(AddNewUserRequest addNewUserRequest) throws BudgetException {

    List<BudgetMonitorEntity> findAllByUserName = budgetMonitorDao.findAllByUserName(addNewUserRequest.getUserName());

    boolean anyMatch = findAllByUserName.stream().map(BudgetMonitorEntity::getUserName).anyMatch(addNewUserRequest.getUserName()::equals);
    if (anyMatch) {
     throw new BudgetException("1002", "duplicate user name...please try againe");
    }
    AddNewUserResponse addNewUserResponse = new AddNewUserResponse();
    // for (BudgetMonitorEntity budgetMonitorEntity : findAllByUserName) {
    // if (budgetMonitorEntity.getUserName().equals(addNewUserRequest.getUserName())) {
    // System.err.println("we need throw the error ");
    // new BudgetException("1002", "duplicate user name...please try againe");
    // }
    // }

    BudgetMonitorEntity budgetMonitorEntity = new BudgetMonitorEntity();
    budgetMonitorEntity.setUserName(addNewUserRequest.getUserName());
    budgetMonitorEntity.setPassword(addNewUserRequest.getPassword());
    budgetMonitorDao.save(budgetMonitorEntity);
    ResponseContext responseContext = new ResponseContext();
    responseContext.setRequestId(addNewUserRequest.getRequestContext().getRequestId());
    responseContext.setResponseCode("0000");
    responseContext.setResponseMessage("Success");
    addNewUserResponse.setResponseContext(responseContext);
    return addNewUserResponse;
  }

}
