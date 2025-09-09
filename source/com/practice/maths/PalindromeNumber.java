package com.practice.maths;

/**
 * https://leetcode.com/problems/palindrome-number/description/
 */
public class PalindromeNumber {

    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        if (x < 10) {
            return true;
        }

        if ((x % 10) == 0) {
            return false;
        }

        int reverseHalf = 0;
        while (x > reverseHalf) {
            reverseHalf = (reverseHalf * 10) + (x % 10);
            x /= 10;
        }

        return (x == reverseHalf) || (x == (reverseHalf / 10));
    }

    public static void main(String[] args) {
        PalindromeNumber number = new PalindromeNumber();
        System.out.println(number.isPalindrome(-123));
        System.out.println(number.isPalindrome(121));
    }
}
