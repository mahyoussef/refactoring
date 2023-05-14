package com.mahyoussef.techniques.helper;

import com.mahyoussef.models.Cart;

public class PriceCalculator {

    private static final Integer TOTAL_QUANTITIES_ELIGIBLE = 10;
    private static final Double DISCOUNT = 0.1;

    public static double calculateTotalPriceRefactored(Cart cart) {
        double totalAmount = cart.cartItems()
                .stream()
                .mapToDouble(item -> item.quantity() * item.price())
                .sum();
        return isEligibleForDiscountRefactored(cart) ? totalAmount * DISCOUNT : totalAmount;
    }

    private static boolean isEligibleForDiscountRefactored(Cart cart) {
        return cart.cartItems()
                .stream()
                .mapToInt(item -> item.quantity())
                .sum() > TOTAL_QUANTITIES_ELIGIBLE;
    }
}
