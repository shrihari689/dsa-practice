package com.practice.maths;

import java.util.HashMap;
import java.util.Map;

public class FindXSumOfKLongSubarray {
    public int[] findXSum(int[] nums, int k, int x) {

        int n = nums.length;

        int end = n - k + 1;
        int result[] = new int[end];

        Map<Integer, Integer> unique = new HashMap<>();
        for (int i = 0; i < n; ++i) {
            unique.put(nums[i], unique.getOrDefault(nums[i], 0) + 1);
        }

        for (int i = 0; i < end; ++i) {

            int sum = 0;
            for (int j = i; j < (i + k); ++j) {
                System.out.print(nums[j] + " ");
            }
            result[i] = sum;
        }

        return result;
    }

    public static void main(String[] args) {
        FindXSumOfKLongSubarray subarray = new FindXSumOfKLongSubarray();
        System.out.println(subarray.findXSum(new int[] { 1, 1, 2, 2, 3, 4, 2, 3 }, 6, 2));
        System.out.println(subarray.findXSum(new int[] { 3, 8, 7, 8, 7, 5 }, 2, 2));
    }
}
