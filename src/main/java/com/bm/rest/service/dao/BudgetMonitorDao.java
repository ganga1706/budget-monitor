package com.bm.rest.service.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bm.rest.service.dao.model.BudgetMonitorEntity;

public interface BudgetMonitorDao extends JpaRepository<BudgetMonitorEntity, Integer> {

  List<BudgetMonitorEntity> findAllByUserName(String UserName);

}
