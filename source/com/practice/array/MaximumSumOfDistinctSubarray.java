package com.practice.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MaximumSumOfDistinctSubarray {

    public long maximumSubarraySum(int[] nums, int k) {

        int n = nums.length;

        long maxSum = 0;

        Map<Integer, Integer> memo = new HashMap<>();
        long sum = 0;
        for (int i = 0; i < k; ++i) {
            sum += nums[i];
            memo.put(nums[i], memo.getOrDefault(nums[i], 0) + 1);
        }

        if (memo.size() == k) {
            maxSum = Math.max(maxSum, sum);
        }

        for (int i = k; i < n; ++i) {

            sum += nums[i] - nums[i - k];

            memo.computeIfPresent(nums[i - k], (key, value) -> value == 1 ? null : value - 1);
            memo.put(nums[i], memo.getOrDefault(nums[i], 0) + 1);

            if (memo.size() == k) {
                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        MaximumSumOfDistinctSubarray distinctSubarray = new MaximumSumOfDistinctSubarray();
        System.out.println(distinctSubarray.maximumSubarraySum(new int[] { 1, 5, 4, 2, 9, 9, 9 }, 3));
        System.out.println(distinctSubarray.maximumSubarraySum(new int[] { 9, 9, 9, 1, 2, 3 }, 3));
        System.out.println(distinctSubarray.maximumSubarraySum(new int[] { 4, 4, 4 }, 3));
    }
}
