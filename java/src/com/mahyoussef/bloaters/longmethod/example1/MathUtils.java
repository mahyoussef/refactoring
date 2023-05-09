package com.mahyoussef.bloaters.longmethod.example1;

public class MathUtils {
    // Code snippet #1 before refactoring
    public static boolean isPrime(long number) {
        if(number < 2) {
            return false;
        }
        else if(number == 2) {
            return true;
        }
        else if (number % 2 == 0) {
            return false;
        }
        else {
            for (long i = 3; i < (long) Math.sqrt(number) + 1; i+=2) {
                if(number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
