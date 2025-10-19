package com.example.paymentservice_june2025.paymentgateways;

public interface IPaymentGateway {
    String generatePaymentLink(Long amount, String orderId, String phoneNumber,String name,String email);
}
