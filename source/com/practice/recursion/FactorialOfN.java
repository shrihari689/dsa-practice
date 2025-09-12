package com.practice.recursion;

/**
 * https://takeuforward.org/plus/dsa/problems/factorial-of-a-given-number
 */
public class FactorialOfN {

    public long factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        FactorialOfN ofN = new FactorialOfN();
        System.out.println(ofN.factorial(4));
    }
}
