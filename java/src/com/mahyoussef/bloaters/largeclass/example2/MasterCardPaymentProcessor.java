package com.mahyoussef.bloaters.largeclass.example2;

import java.time.LocalDateTime;

public class MasterCardPaymentProcessor extends AbstractCardPaymentProcessorRefactored {

    @Override
    void processCardPayment() {
        // logic
        System.out.println("Processing master card payment...");
        process(cardNumber, cardHolder, CVV, expirationDate);
    }

    private void process(String cardNumber, String cardHolder, int CCN, LocalDateTime expirationDate) {
        // logic
    }
}
