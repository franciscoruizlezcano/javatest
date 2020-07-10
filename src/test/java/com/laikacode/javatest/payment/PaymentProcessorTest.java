package com.laikacode.javatest.payment;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class PaymentProcessorTest {

    @Test
    void paymentIsCorrect() {
        PaymentGateway gateway = Mockito.mock(PaymentGateway.class);

        Mockito.when(gateway.request(Mockito.any())).thenReturn(new PaymentResponse(PaymentStatus.OK));

        PaymentProcessor processor = new PaymentProcessor(gateway);
        assertTrue(processor.makePayment(1000));
    }

    @Test
    void paymentIsWrong() {
        PaymentGateway gateway = Mockito.mock(PaymentGateway.class);

        Mockito.when(gateway.request(Mockito.any())).thenReturn(new PaymentResponse(PaymentStatus.ERROR));

        PaymentProcessor processor = new PaymentProcessor(gateway);
        assertFalse(processor.makePayment(1000));
    }
}