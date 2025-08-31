package com.wipro.oop;

public class Phonepay implements PaymentMethod {
    public void pay(double amount) {
        System.out.println(amount + " through PhonePay");
    }

}
