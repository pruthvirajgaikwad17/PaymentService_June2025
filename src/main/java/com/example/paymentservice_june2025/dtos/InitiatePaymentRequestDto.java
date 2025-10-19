package com.example.paymentservice_june2025.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class InitiatePaymentRequestDto {
    // For knowing the parameter to be passed to Razorpay we should be knowing the contract of the razorpay
    Long amount;
    String orderId;
    String phoneNumber;
    String name;
    String email;
}
