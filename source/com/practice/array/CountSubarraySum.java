package com.practice.array;

import java.util.HashMap;
import java.util.Map;

public class CountSubarraySum {

    public int subarraySum(int[] nums, int k) {

        Map<Integer, Integer> prefixCount = new HashMap<>();
        prefixCount.put(0, 1);

        int sum = 0;

        int count = 0;

        int n = nums.length;
        for (int i = 0; i < n; ++i) {

            sum += nums[i];

            count += prefixCount.getOrDefault(sum - k, 0);
            prefixCount.put(sum, prefixCount.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        CountSubarraySum sum = new CountSubarraySum();
        System.out.println(sum.subarraySum(new int[] { 1, 1, 1 }, 2));
        System.out.println(sum.subarraySum(new int[] { 1, 2, 3 }, 3));
    }
}
