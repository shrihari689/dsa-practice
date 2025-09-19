package com.practice.array;

import java.util.HashMap;
import java.util.Map;

/**
 * https://takeuforward.org/arrays/longest-subarray-with-sum-k-postives-and-negatives/
 */
public class LongestSubarryPrefixSum {

    public int longestSubarray(int[] nums, int k) {
        int maxLength = 0;

        int n = nums.length;

        Map<Integer, Integer> memo = new HashMap<>();

        int sum = 0;
        for (int i = 0; i < n; ++i) {
            sum += nums[i];

            if (sum == k) {
                maxLength = Math.max(maxLength, i + 1);
            }

            int rem = sum - k;
            if (memo.containsKey(rem)) {
                int idx = memo.get(rem);
                maxLength = Math.max(maxLength, i - idx);
            }

            memo.putIfAbsent(sum, i);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        LongestSubarryPrefixSum subarryPrefixSum = new LongestSubarryPrefixSum();
        System.out.println(subarryPrefixSum.longestSubarray(new int[] { 10, 5, 2, 7, 1, 9 }, 15));
        System.out.println(subarryPrefixSum.longestSubarray(new int[] { -3, 2, 1 }, 6));
        System.out.println(subarryPrefixSum.longestSubarray(new int[] { -1, 1, 1 }, 1));
    }
}
