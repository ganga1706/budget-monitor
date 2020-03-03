package com.bm.rest.service.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bm.rest.service.dao.model.BudgetMonitorEntity;

public interface BudgetMonitorDao extends JpaRepository<BudgetMonitorEntity, Integer> {

  List<BudgetMonitorEntity> findAllByUserName(String UserName);
  
  @Transactional
  @Modifying
  @Query(value ="update BM_DETAILS_NEW bm set total_budget_amount = :totalBudgetAmount where bm.user_name = :UserName",nativeQuery =true)
  void updatetotalBudgetAmount(@Param ("totalBudgetAmount") int totalBudgetAmount ,@Param("UserName") String Username);

}
