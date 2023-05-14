package com.mahyoussef.bloaters.largeclass.example3;

import com.mahyoussef.models.Cart;
import com.mahyoussef.models.ShippingInformation;

public class PaymentCalculatorRefactored {

    private ShippingProcessor shippingProcessor;

    public double calculateTotalPaymentAmount(Cart cart, ShippingInformation shippingInformation) {
        double totalPrice = cart.cartItems().stream()
                .mapToDouble(item -> item.quantity() * item.price())
                .sum();
        return shippingProcessor.getShippingAmount(totalPrice) + totalPrice;
    }
}
