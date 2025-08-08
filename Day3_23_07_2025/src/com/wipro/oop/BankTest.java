package com.wipro.oop;

import com.wipro.oop.BankOps;
import com.wipro.oop.HDFC;
import com.wipro.oop.Citi;

public class BankTest {
	public static void main(String[] args) {
		BankOps hdfc = new HDFC();
        BankOps citi = new Citi();

        hdfc.deposit(2000, "HDFC123");
        System.out.println("HDFC Balance " + hdfc.depositReturn(1000, "HDFC123"));
        System.out.println("HDFC after withdrawal " + hdfc.withdraw(500, "HDFC123"));

        System.out.println();

        citi.deposit(3000, "CITI456");
        System.out.println("Citi Balance " + citi.depositReturn(2000, "CITI456"));
        System.out.println("Citi after withdrawal " + citi.withdraw(1500, "CITI456"));
    }

	

}
