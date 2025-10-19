package com.example.paymentservice_june2025.config;

import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RazorpayConfig {
    @Value("${razpay.id}") // read the id from the application properties in resources
    private String razorpayId;

    @Value("${razpay.secret}") // read the secret from the application properties in resources
    private String razorpaySecret;

    @Bean
    public RazorpayClient razorpayClient() throws RazorpayException {
        return new RazorpayClient(razorpayId, razorpaySecret);
    }
}
