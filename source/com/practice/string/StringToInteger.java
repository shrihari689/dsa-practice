package com.practice.string;

public class StringToInteger {

    private static final int MINUS = 0;
    private static final int PLUS = 1;

    public int myAtoi(String s) {

        long num = 0;
        int bit = PLUS;

        char ch[] = s.toCharArray();
        int n = ch.length;

        int currIdx = 0;
        while ((currIdx < n) && (ch[currIdx] == ' ')) {
            currIdx++;
        }

        if (currIdx >= n) {
            return 0;
        }

        if (ch[currIdx] == '-') {
            bit = MINUS;
            currIdx++;
        } else if (ch[currIdx] == '+') {
            bit = PLUS;
            currIdx++;
        } else {
            bit = PLUS;
        }

        while ((currIdx < n) && (ch[currIdx] == '0')) {
            currIdx++;
        }

        if (currIdx >= n) {
            return 0;
        }

        while (currIdx < n) {
            int digit = (ch[currIdx] - '0');
            if ((digit >= 0) && (digit < 10)) {
                num = (num * 10) + digit;
            } else {
                break;
            }
            currIdx++;
        }

        if (bit == MINUS) {
            num = num * -1;
        }

        if (num < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        if (num > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }

        return (int) num;
    }

    public static void main(String[] args) {
        StringToInteger integer = new StringToInteger();
        System.out.println(integer.myAtoi("42"));
        System.out.println(integer.myAtoi("-042"));
        System.out.println(integer.myAtoi("1337c0d3"));
    }
}
