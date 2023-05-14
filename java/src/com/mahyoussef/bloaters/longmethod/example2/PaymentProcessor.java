package com.mahyoussef.bloaters.longmethod.example2;

import com.mahyoussef.models.*;

public class PaymentProcessor {
    // Code snippet #2 before refactoring
    public static double checkout(Cart cart, ShippingInformation shippingInformation,
                                  BillingInformation billingInformation, PaymentInformation paymentInformation) {
        double totalOrderAmount = 0;
        for(var item : cart.cartItems()) {
            totalOrderAmount+= item.price() * item.quantity();
        }

        double shippingCost = 0;
        if(shippingInformation.shippingMethod() == ShippingMethod.STANDARD) {
            shippingCost = 5;
        } else if(shippingInformation.shippingMethod() == ShippingMethod.EXPRESS) {
            shippingCost = 10;
        }

        double taxRate = 0.1;
        double taxAmount = totalOrderAmount * taxRate;

        if(billingInformation.paymentMethod() == PaymentMethod.CREDIT_CARD) {
            processCreditCard(paymentInformation.cardNumber(), paymentInformation.expirationDate(),
                    totalOrderAmount + shippingCost + taxAmount);
        } else if(billingInformation.paymentMethod() == PaymentMethod.PAYPAL) {
            processPaypal(paymentInformation.email(), totalOrderAmount + shippingCost + taxAmount);
        }

        sendConfirmationEmail(cart, shippingInformation, billingInformation, paymentInformation,
                totalOrderAmount + shippingCost + taxAmount);

        return totalOrderAmount + shippingCost + taxAmount;
    }

    private static void sendConfirmationEmail(Cart cart, ShippingInformation shippingInformation
            , BillingInformation billingInformation, PaymentInformation paymentInformation, double totalCost) {
    }

    private static void processPaypal(String email, double totalCost) {
    }

    private static void processCreditCard(String cardNumber, String expirationDate, double totalCost) {
    }
}
