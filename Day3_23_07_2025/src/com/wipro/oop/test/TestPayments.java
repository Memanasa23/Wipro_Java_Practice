package com.wipro.oop.test;

import com.wipro.oop.Gpay;
import com.wipro.oop.Phonepay;
import com.wipro.oop.PaymentMethod;


public class TestPayments {
	public static void main(String[] args) {
        PaymentMethod payment;

        payment = new Gpay();
        payment.pay(5000);

        payment = new Phonepay();
        payment.pay(8400);
    }

}
