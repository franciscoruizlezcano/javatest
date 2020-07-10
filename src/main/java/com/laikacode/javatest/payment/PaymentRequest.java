package com.laikacode.javatest.payment;

import lombok.Data;

@Data
public class PaymentRequest {
    private double amount;

    public PaymentRequest(double amount) {
        this.amount = amount;
    }
}
