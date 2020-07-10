package com.laikacode.javatest.payment;

public class PaymentProcessor {

    private PaymentGateway gateway;

    public PaymentProcessor(PaymentGateway gateway) {
        this.gateway = gateway;
    }

    public boolean makePayment(double amount){
        boolean result = false;
        PaymentResponse response = gateway.request(new PaymentRequest(amount));
        if (response.getStatus().equals(PaymentStatus.OK)){
            result = true;
        }
        return result;
    }
}
