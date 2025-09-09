package com.practice.maths;

/**
 * https://leetcode.com/problems/reverse-integer/description/
 */
public class ReverseNumber {

    public int reverse(int x) {

        int maxInt = Integer.MAX_VALUE / 10;
        int minInt = Integer.MIN_VALUE / 10;

        int minus = 0;

        if (x < 0) {
            x = x * -1;
            minus = 1;
        }

        int result = 0;

        while (x > 0) {
            int rem = x % 10;
            x /= 10;

            if ((result > maxInt) || ((result == maxInt) && (rem > 7))) {
                return 0;
            }

            if ((result < minInt) || ((result == minInt) && (rem < -8))) {
                return 0;
            }

            result = (result * 10) + rem;
        }

        if (minus == 1) {
            result *= -1;
        }

        return result;
    }

    public static void main(String[] args) {
        ReverseNumber number = new ReverseNumber();
        System.out.println(number.reverse(-123));
    }
}
