package com.example.paymentservice_june2025.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/stripeWebhook")
public class StripeWebhookController {

    @PostMapping
    public void listenToStripeEvent(@RequestBody String event) {
        System.out.println("Hello from Stripe");
        System.out.println(event);
    }
}
