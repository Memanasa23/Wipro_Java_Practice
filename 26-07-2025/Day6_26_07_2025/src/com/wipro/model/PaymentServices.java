package com.wipro.model;

import com.wipro.payment.payments;

public class PaymentServices {
    private final payments pay;

    
    public PaymentServices(payments pay) {
        this.pay = pay;
    }

    public void makePayment(double money) {
        pay.pay(money);
    }
}

