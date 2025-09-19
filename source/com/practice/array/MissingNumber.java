package com.practice.array;

/**
 * https://leetcode.com/problems/missing-number
 */
public class MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        long totalSum = (n * (n + 1)) / 2;
        long sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return (int) (totalSum - sum);
    }

    public static void main(String[] args) {
        MissingNumber number = new MissingNumber();
        System.out.println(number.missingNumber(new int[] { 3, 0, 1 }));
        System.out.println(number.missingNumber(new int[] { 0, 1 }));
        System.out.println(number.missingNumber(new int[] { 9, 6, 4, 2, 3, 5, 7, 0, 1 }));
    }
}
