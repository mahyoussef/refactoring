package com.mahyoussef.bloaters.longmethod.example1;

public class MathUtilsRefactored {
    // Code snippet #1 after refactoring
    public static boolean isPrime(long number) {
        if(number < 2) {
            return false;
        }
        if(number == 2) {
            return true;
        }
        if (isEven(number)) {
            return false;
        }
        for (long i = 3; i < (long) Math.sqrt(number) + 1; i+=2) {
            if(isDivisible(number, i)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isEven(long number) {
        return number % 2 == 0;
    }

    private static boolean isDivisible(long number, long divisor) {
        return number % divisor == 0;
    }
}
