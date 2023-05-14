package com.mahyoussef.bloaters.longmethod.example2;

import com.mahyoussef.models.BillingInformation;
import com.mahyoussef.models.Cart;
import com.mahyoussef.models.PaymentInformation;
import com.mahyoussef.models.ShippingInformation;

public class PaymentProcessorRefactored {
    // Code snippet #2 after refactoring
    public static double checkout(Cart cart, ShippingInformation shippingInformation,
                                  BillingInformation billingInformation, PaymentInformation paymentInformation) {
        double totalOrderAmount = calculateTotalOrderAmount(cart);
        double shippingCost = calculateShippingCost(shippingInformation);
        double taxAmount = calculateTaxAmount(totalOrderAmount);
        double totalCost = totalOrderAmount + shippingCost + taxAmount;
        processPayment(billingInformation, paymentInformation, totalCost);
        sendConfirmationEmail(cart, shippingInformation, billingInformation, paymentInformation, totalCost);
        return totalCost;
    }

    private static double calculateTotalOrderAmount(Cart cart) {
        return cart.cartItems()
                .stream()
                .mapToDouble(item -> item.price() * item.quantity())
                .sum();
    }

    private static double calculateShippingCost(ShippingInformation shippingInformation) {
        switch (shippingInformation.shippingMethod()) {
            case STANDARD: return 5;
            case EXPRESS: return 10;
        }
        // Not reached
        return 0;
    }

    private static double calculateTaxAmount(double totalOrderAmount) {
        double taxRate = 0.1;
        return taxRate * totalOrderAmount;
    }

    private static void processPayment(BillingInformation billingInformation, PaymentInformation paymentInformation,
                                       double totalCost) {
        switch (billingInformation.paymentMethod()) {
            case CREDIT_CARD: processCreditCard(paymentInformation.cardNumber(), paymentInformation.expirationDate(),
                    totalCost);
            case PAYPAL: processPaypal(paymentInformation.email(), totalCost);
        }
    }

    private static void sendConfirmationEmail(Cart cart, ShippingInformation shippingInformation
            , BillingInformation billingInformation, PaymentInformation paymentInformation, double totalCost) {
    }

    private static void processPaypal(String email, double totalCost) {
    }

    private static void processCreditCard(String cardNumber, String expirationDate, double totalCost) {
    }
}
