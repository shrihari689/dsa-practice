package com.practice.recursion;

/**
 * https://takeuforward.org/plus/dsa/problems/fibonacci-number
 */
public class FibonacciNumber {

    public int fib(int n) {
        if ((n == 0) || (n == 1)) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        FibonacciNumber number = new FibonacciNumber();
        System.out.println(number.fib(3));
        System.out.println(number.fib(4));
        System.out.println(number.fib(5));
    }
}
