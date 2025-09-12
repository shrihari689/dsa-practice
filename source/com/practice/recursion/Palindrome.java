package com.practice.recursion;

/**
 * https://leetcode.com/problems/valid-palindrome/description/
 */
public class Palindrome {

    public boolean isPalindrome(String s) {
        return isPalindrome(s, 0, s.length() - 1);
    }

    private boolean isPalindrome(String s, int x, int y) {
        if (x < y) {
            char source = getChar(s.charAt(x));
            char dest = getChar(s.charAt(y));
            if (source == ' ') {
                return isPalindrome(s, x + 1, y);
            } else if (dest == ' ') {
                return isPalindrome(s, x, y - 1);
            } else if (source != dest) {
                return false;
            } else {
                return isPalindrome(s, x + 1, y - 1);
            }
        }
        return true;
    }

    private char getChar(char ch) {
        if ((ch >= 'A') && (ch <= 'Z')) {
            return (char) (ch + 32);
        } else if ((ch >= '0') && (ch <= '9')) {
            return ch;
        } else if ((ch >= 'a') && (ch <= 'z')) {
            return ch;
        }
        return ' ';
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome("race a car"));
        System.out.println(palindrome.isPalindrome("A man, a plan, a canal: Panama"));
    }
}
