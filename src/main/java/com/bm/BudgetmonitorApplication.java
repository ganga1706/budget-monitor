package com.bm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.bm"})
public class BudgetmonitorApplication {

  public static void main(String[] args) {
    SpringApplication.run(BudgetmonitorApplication.class, args);
  }

}
