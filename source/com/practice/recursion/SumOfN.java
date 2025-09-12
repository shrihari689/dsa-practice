package com.practice.recursion;

/**
 * https://takeuforward.org/plus/dsa/problems/sum-of-first-n-numbers
 */
public class SumOfN {

    public int NnumbersSum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + NnumbersSum(n - 1);
    }

    public static void main(String[] args) {
        SumOfN ofN = new SumOfN();
        System.out.println(ofN.NnumbersSum(3));
    }
}
