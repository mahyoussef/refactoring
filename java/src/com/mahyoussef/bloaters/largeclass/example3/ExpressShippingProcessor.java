package com.mahyoussef.bloaters.largeclass.example3;

public class ExpressShippingProcessor implements ShippingProcessor {
    private static final Double SHIPPING_EXPRESS_RATE = 0.4;

    @Override
    public double getShippingAmount(double totalPrice) {
        return totalPrice * SHIPPING_EXPRESS_RATE;
    }
}
