package com.practice.maths;

public class CompletePrimeNumbers {
    public boolean completePrime(int num) {

        String number = String.valueOf(num);
        int size = number.length();

        for (int i = 0; i < size; ++i) {
            int n = Integer.valueOf(number.substring(0, i + 1));
            if (!isPrime(n)) {
                return false;
            }
        }

        for (int i = size - 1; i >= 0; --i) {
            int n = Integer.valueOf(number.substring(i, size));
            if (!isPrime(n)) {
                return false;
            }
        }

        return true;
    }

    private boolean isPrime(int n) {
        // Check if n is 1 or 0
        if (n <= 1)
            return false;

        // Check if n is 2 or 3
        if (n == 2 || n == 3)
            return true;

        // Check whether n is divisible by 2 or 3
        if (n % 2 == 0 || n % 3 == 0)
            return false;

        // Check from 5 to square root of n
        // Iterate i by (i+6)
        for (int i = 5; i * i <= n; i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;

        return true;
    }

    public static void main(String[] args) {
        CompletePrimeNumbers primeNumbers = new CompletePrimeNumbers();
        System.out.println(primeNumbers.completePrime(23));
        System.out.println(primeNumbers.completePrime(39));
        System.out.println(primeNumbers.completePrime(7));
    }
}
