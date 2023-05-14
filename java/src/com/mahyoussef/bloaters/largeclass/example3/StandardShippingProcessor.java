package com.mahyoussef.bloaters.largeclass.example3;

public class StandardShippingProcessor implements ShippingProcessor {
    private static final Double SHIPPING_STANDARD_RATE = 0.1;

    @Override
    public double getShippingAmount(double totalPrice) {
        return totalPrice * SHIPPING_STANDARD_RATE;
    }
}
