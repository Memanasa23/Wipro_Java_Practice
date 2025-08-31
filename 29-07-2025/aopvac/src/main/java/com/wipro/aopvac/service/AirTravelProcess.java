package com.wipro.aopvac.service;

import org.springframework.stereotype.Component;
import com.wipro.aopvac.exception.NoSeatAvailableException;

@Component
public class AirTravelProcess {

 public void checkIn(boolean flag) throws NoSeatAvailableException {
     if (!flag) {
         throw new NoSeatAvailableException("No seats available");
     }
     System.out.println("Checking Done");
 }

 public void collectBoardingPass() {
     System.out.println("Boarding pass is collected");
 }

 public void doSecurityCheck() {
     System.out.println("Security check done");
 }

 public void doBoarding() {
     System.out.println("Boarding done");
 }
}
