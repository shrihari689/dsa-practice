package com.practice.string;

public class LargestOddNumber {
    public String largestOddNumber(String num) {

        int end = num.length() - 1;
        while ((end >= 0) && (((int) (num.charAt(end) - '0')) % 2) == 0) {
            end--;
        }

        return num.substring(0, end + 1);
    }

    public static void main(String[] args) {
        LargestOddNumber oddNumber = new LargestOddNumber();
        System.out.println(oddNumber.largestOddNumber("4206"));
        System.out.println(oddNumber.largestOddNumber("35427"));
        System.out.println(oddNumber.largestOddNumber("52"));
    }
}
