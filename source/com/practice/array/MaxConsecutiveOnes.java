package com.practice.array;

/**
 * https://leetcode.com/problems/max-consecutive-ones/
 */
public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {

        int max = 0;

        int n = nums.length;

        int count = 0;
        for (int i = 0; i < n; ++i) {
            if (nums[i] == 0) {
                max = Math.max(max, count);
                count = 0;
            } else {
                count++;
            }
        }

        return Math.max(max, count);
    }

    public static void main(String[] args) {
        MaxConsecutiveOnes consecutiveOnes = new MaxConsecutiveOnes();
        System.out.println(consecutiveOnes.findMaxConsecutiveOnes(new int[] { 1, 1, 0, 1, 1, 1 }));
        System.out.println(consecutiveOnes.findMaxConsecutiveOnes(new int[] { 1, 0, 1, 1, 0, 1 }));
    }
}
