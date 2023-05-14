package com.mahyoussef.bloaters.largeclass.example3;

import com.mahyoussef.models.Cart;
import com.mahyoussef.models.ShippingInformation;
import com.mahyoussef.models.ShippingMethod;

public class PaymentCalculator {

    private static final Double SHIPPING_EXPRESS_RATE = 0.4;
    private static final Double SHIPPING_STANDARD_RATE = 0.1;

    public double calculateTotalPaymentAmount(Cart cart, ShippingInformation shippingInformation) {
        double totalPrice = cart.cartItems().stream()
                .mapToDouble(item -> item.quantity() * item.price())
                .sum();
        if(shippingInformation.shippingMethod() == ShippingMethod.EXPRESS) {
            return totalPrice + calculateExpressShippingAmount(totalPrice);
        }
        if(shippingInformation.shippingMethod() == ShippingMethod.STANDARD) {
            return totalPrice + calculateStandardShippingAmount(totalPrice);
        }
        return totalPrice;
    }

    private double calculateExpressShippingAmount(double totalPrice) {
        // logic of calculating express shipping cost
        return totalPrice * SHIPPING_EXPRESS_RATE;
    }

    private double calculateStandardShippingAmount(double totalPrice) {
        // logic of calculating standard shipping cost
        return totalPrice * SHIPPING_STANDARD_RATE;
    }
}
