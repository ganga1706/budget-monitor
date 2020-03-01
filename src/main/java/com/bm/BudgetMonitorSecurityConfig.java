//package com.bm;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@Configuration
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true)
//public class BudgetMonitorSecurityConfig extends WebSecurityConfigurerAdapter {
//
////  @Bean
////  @Override
////  public AuthenticationManager authenticationManagerBean() throws Exception {
////    return super.authenticationManagerBean();
////  }
////
////  @Override
////  protected void configure(HttpSecurity http) throws Exception {
////    http
////      .csrf().disable()
////      .authorizeRequests().anyRequest().authenticated()
////      .and()
////      .httpBasic();
////  }
//  
//
//  @Bean
//  @Primary
//  public PasswordEncoder passwordEncoder() {
//    return new BCryptPasswordEncoder();
//  }
//
//}
