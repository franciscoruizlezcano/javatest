package com.laikacode.javatest.payment;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class PaymentProcessorTest {

    private PaymentGateway gateway;
    private PaymentProcessor processor;

    void setup(PaymentStatus status){
        this.gateway = Mockito.mock(PaymentGateway.class);

        Mockito.when(this.gateway.request(Mockito.any())).thenReturn(new PaymentResponse(status));

        this.processor = new PaymentProcessor(this.gateway);
    }

    @Test
    void paymentIsCorrect() {
        setup(PaymentStatus.OK);

        assertTrue(this.processor.makePayment(1000));
    }

    @Test
    void paymentIsWrong() {
        setup(PaymentStatus.ERROR);

        assertFalse(this.processor.makePayment(1000));
    }
}