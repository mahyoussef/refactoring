package com.mahyoussef.techniques;

public class ReplaceTempWithQuery {

    private static final Double DISCOUNT_RATE = 0.1;

    // Before refactoring
    public static double calculateTotalPrice(int quantity, double price) {
        double discount = 0;
        double totalPrice = quantity * price;
        if(totalPrice > 100) {
            discount = 0.1 * totalPrice;
        }
        return totalPrice - discount;
    }

    // After refactoring
    public static double calculateTotalPriceRefactored(int quantity, double price) {
        double discount = calculatePrice(quantity, price) > 100 ? calculatePrice(quantity, price) * DISCOUNT_RATE : 0;
        return calculatePrice(quantity, price) - discount;
    }

    private static double calculatePrice(int quantity, double price) {
        return quantity * price;
    }

}
