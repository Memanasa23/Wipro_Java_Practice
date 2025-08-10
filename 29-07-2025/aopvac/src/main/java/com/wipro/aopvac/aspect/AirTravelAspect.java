package com.wipro.aopvac.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AirTravelAspect {

 @Before("execution(* com.wipro.aopvac.service.AirTravelProcess.checkIn(..))")
 public void showPhotoId() {
     System.out.println("Please show your Photo ID before check-in.");
 }

 @Before("execution(* com.wipro.aopvac.service.AirTravelProcess.doSecurityCheck(..)) || execution(* com.wipro.aopvac.service.AirTravelProcess.doBoarding(..))")
 public void showBoardingPass() {
     System.out.println("Please show your Boarding Pass.");
 }

 @AfterThrowing(pointcut = "execution(* com.wipro.aopvac.service.AirTravelProcess.checkIn(..))", throwing = "ex")
 public void handleNoSeatAvailable(JoinPoint jp, Throwable ex) {
     System.out.println("Please contact to the Manager");
 }
}

