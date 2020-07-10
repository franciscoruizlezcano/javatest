package com.laikacode.javatest.payment;

public interface PaymentGateway {
    PaymentResponse request(PaymentRequest request);
}
