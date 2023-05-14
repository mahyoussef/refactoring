package com.mahyoussef.techniques;

import com.mahyoussef.models.Cart;
import com.mahyoussef.techniques.helper.PriceCalculator;

public class ReplaceMethodWithMethodObject {

    private final PriceCalculator priceCalculator;

    public ReplaceMethodWithMethodObject(PriceCalculator priceCalculator) {
        this.priceCalculator = priceCalculator;
    }

    // Before refactoring
    public double calculateTotalPrice(Cart cart) {
        double totalAmount = 0;
        for(var item : cart.cartItems()) {
            totalAmount+= item.quantity() * item.price();
        }
        if(isEligibleForDiscount(cart)) {
            totalAmount -= totalAmount * 0.1;
        }
        return totalAmount;
    }

    private boolean isEligibleForDiscount(Cart cart) {
        int totalQuantity = 0;
        for(var item : cart.cartItems()) {
            totalQuantity += item.quantity();
        }
        return totalQuantity > 10;
    }

    // After refactoring
    public double calculateTotalPriceRefactored(Cart cart) {
        return priceCalculator.calculateTotalPriceRefactored(cart);
    }
}
