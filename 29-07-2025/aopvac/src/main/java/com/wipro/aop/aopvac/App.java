package com.wipro.aop.aopvac;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.wipro.aopvac.config.AspectConfig;
import com.wipro.aopvac.service.AirTravelProcess;
import com.wipro.aopvac.exception.NoSeatAvailableException;

public class App {
 public static void main(String[] args) {
     AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
     context.scan("com.wipro.aopvac");
     context.refresh();

     AirTravelProcess process = context.getBean(AirTravelProcess.class);
     
     try {
         process.checkIn(false); 
         process.collectBoardingPass();
         process.doSecurityCheck();
         process.doBoarding();
     } catch (NoSeatAvailableException ex) {
    	 System.out.println(ex.getMessage());
     }
 }
}
