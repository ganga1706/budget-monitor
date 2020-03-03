package com.bm.rest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bm.exceptions.BudgetException;
import com.bm.rest.model.AddBudgetUserRequest;
import com.bm.rest.model.AddBudgetUserResponse;
import com.bm.rest.model.ResponseContext;
import com.bm.rest.service.AddBudgetUserService;
import com.bm.rest.service.dao.BudgetMonitorDao;
import com.bm.rest.service.dao.model.BudgetMonitorEntity;

@Service
public class AddBudgetUserServiceImpl implements AddBudgetUserService {

	@Autowired
	BudgetMonitorDao budgetMonitorDao;

	@Override
	public AddBudgetUserResponse addBudgetUser(AddBudgetUserRequest addBudgetUserRequest) throws BudgetException {
		AddBudgetUserResponse addBudgetUserResponse = new AddBudgetUserResponse();
		List<BudgetMonitorEntity> findAllByUserName = budgetMonitorDao
				.findAllByUserName(addBudgetUserRequest.getUserName());
		boolean anyMatch = findAllByUserName.stream().map(BudgetMonitorEntity::getUserName)
				.anyMatch(addBudgetUserRequest.getUserName()::equals);
		if (!anyMatch) {
			throw new BudgetException("1002", "duplicate user name...please try again");
		}

		budgetMonitorDao.updatetotalBudgetAmount(addBudgetUserRequest.getTotalBudgetAmount(), addBudgetUserRequest.getUserName());
		ResponseContext responseContext = new ResponseContext();
		responseContext.setRequestId(addBudgetUserRequest.getRequestContext().getRequestId());
		responseContext.setResponseCode("0000");
		responseContext.setResponseMessage("Success");
		addBudgetUserResponse.setResponseContext(responseContext);

		return addBudgetUserResponse;
	}

}
