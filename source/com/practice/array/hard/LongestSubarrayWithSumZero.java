package com.practice.array.hard;

import java.util.HashMap;

/**
 * https://takeuforward.org/data-structure/length-of-the-longest-subarray-with-zero-sum/
 */
public class LongestSubarrayWithSumZero {

    public int maxLen(int nums[]) {

        int n = nums.length;

        int maxLength = 0;

        HashMap<Integer, Integer> memo = new HashMap<>();
        int sum = 0;

        for (int i = 0; i < n; ++i) {
            sum += nums[i];
            if (sum == 0) {
                maxLength = i + 1;
            } else {
                int idx = memo.getOrDefault(sum, -1);
                if (idx == -1) {
                    memo.put(sum, i);
                } else {
                    maxLength = Math.max(maxLength, i - idx);
                }
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        LongestSubarrayWithSumZero withSumZero = new LongestSubarrayWithSumZero();
        System.out.println(withSumZero.maxLen(new int[] { 9, -3, 3, -1, 6, -5 }));
        System.out.println(withSumZero.maxLen(new int[] { 6, -2, 2, -8, 1, 7, 4, -10 }));
        System.out.println(withSumZero.maxLen(new int[] { 1, 3, -5, 6, -2 }));
    }
}
