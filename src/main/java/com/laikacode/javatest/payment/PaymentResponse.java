package com.laikacode.javatest.payment;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class PaymentResponse {
    private PaymentStatus status;

    public PaymentResponse(PaymentStatus status) {
        this.status = status;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }
}
