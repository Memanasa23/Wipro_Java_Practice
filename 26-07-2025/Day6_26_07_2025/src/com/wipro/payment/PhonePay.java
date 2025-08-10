package com.wipro.payment;

public class PhonePay implements payments{
	
	public void pay(double money) {
        System.out.println("Amount " + money + " by PhonePay");
	}

}
