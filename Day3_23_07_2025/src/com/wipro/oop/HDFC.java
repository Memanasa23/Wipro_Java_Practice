package com.wipro.oop;

public class HDFC implements BankOps {
	String accNumber = "HDFC123";
    double balance = 5000.0;
	
    
    @Override
    public void deposit(double amount, String accNumber) {
        balance += amount;
        System.out.println("HDFC Deposited" + amount);
    }

    @Override
    public double depositReturn(double amount, String accNumber) {
        balance += amount;
        return balance;
    }

    @Override
    public double withdraw(double amount, String accNumber) {
        balance -= amount;
        System.out.println("HDFC Withdrawn " + amount);
        return balance;
    }
}
