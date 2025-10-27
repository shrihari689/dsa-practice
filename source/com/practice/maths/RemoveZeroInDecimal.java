package com.practice.maths;

/**
 * https://leetcode.com/contest/weekly-contest-473/problems/remove-zeros-in-decimal-representation
 */
public class RemoveZeroInDecimal {

    public long removeZeros(long n) {

        long result = 0;

        int idx = 0;

        while (n > 0) {
            int rem = (int) (n % 10);
            if (rem > 0) {
                result += (Math.pow(10, idx++) * rem);
            }
            n /= 10;
        }

        return result;
    }

    public static void main(String[] args) {
        RemoveZeroInDecimal decimal = new RemoveZeroInDecimal();
        System.out.println(decimal.removeZeros(102003));
        System.out.println(decimal.removeZeros(1));
    }
}
