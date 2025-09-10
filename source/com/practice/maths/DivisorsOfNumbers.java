package com.practice.maths;

/**
 * https://takeuforward.org/plus/dsa/problems/divisors-of-a-number
 */
public class DivisorsOfNumbers {

    public void divisors(int n) {
        for (int i = 1; (i * i) <= n; ++i) {
            if (n % i == 0) {
                System.out.println(i);
                System.out.println((int) n / i);
            }
        }
    }

    public static void main(String[] args) {
        DivisorsOfNumbers numbers = new DivisorsOfNumbers();
        numbers.divisors(6);
        numbers.divisors(8);
        numbers.divisors(21191);
        numbers.divisors(20);
    }
}
