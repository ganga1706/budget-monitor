package com.bm;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PropertyContainerDB {

  @Value("${bm.db.driverClass}")
  private String driverClass;

  @Value("${bm.db.jdbcUrl}")
  private String jdbcUrl;

  @Value("${bm.db.user}")
  private String dbuser;

  @Value("${bm.db.password}")
  private String dbpword;

  @Value("${bm.db.showSql}")
  private String showSql;

}
