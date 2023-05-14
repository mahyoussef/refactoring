package com.mahyoussef.bloaters.largeclass.example2;

import java.time.LocalDateTime;

public class VisaCardPaymentProcessor extends AbstractCardPaymentProcessorRefactored {

    @Override
    void processCardPayment() {
        // logic
        System.out.println("Processing visa card payment...");
        process(cardNumber, cardHolder, CCN, expirationDate);
    }

    private void process(String cardNumber, String cardHolder, int CCN, LocalDateTime expirationDate) {
        // logic
    }
}
