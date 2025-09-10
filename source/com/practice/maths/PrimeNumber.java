package com.practice.maths;

public class PrimeNumber {

    public boolean isPrime(int num) {

        if (num <= 1) {
            return false;
        }

        if (num == 2) {
            return true;
        }

        if (((num % 2) == 0) || ((num % 3) == 0)) {
            return false;
        }

        // 6k + i
        for (int i = 5; (i * i) <= num; i += 6) {
            if ((num % i == 0) || (num % (i + 2) == 0)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        PrimeNumber number = new PrimeNumber();
        System.out.println(number.isPrime(11));
        System.out.println(number.isPrime(121));
    }
}
