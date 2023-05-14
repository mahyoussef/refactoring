package com.mahyoussef.bloaters.largeclass.example2;

import java.time.LocalDateTime;

public class MaestroCardPaymentProcessor extends AbstractCardPaymentProcessorRefactored {

    @Override
    void processCardPayment() {
        // logic
        System.out.println("Processing maestro card payment...");
        process(cardNumber, cardHolder, CCN, expirationDate);
    }

    private void process(String cardNumber, String cardHolder, int CCN, LocalDateTime expirationDate) {
        // logic
    }
}
