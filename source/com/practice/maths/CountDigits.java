package com.practice.maths;

/**
 * https://takeuforward.org/plus/dsa/problems/count-all-digits-of-a-number
 */
public class CountDigits {

    public int countDigit(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        CountDigits digits = new CountDigits();
        System.out.println(digits.countDigit(234));
    }
}
