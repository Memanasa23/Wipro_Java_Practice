package com.wipro.oop;

public class Citi implements BankOps {
	
	String accNumber = "CITI456";
    double balance = 10000.0;
    
    @Override
    public void deposit(double amount, String accNumber) {
        balance += amount;
        System.out.println("Citi Deposited " + amount);
    }

    @Override
    public double depositReturn(double amount, String accNumber) {
        balance += amount;
        return balance;
    }

    @Override
    public double withdraw(double amount, String accNumber) {
        balance -= amount;
        System.out.println("Citi Withdrawn " + amount);
        return balance;
    }

}
