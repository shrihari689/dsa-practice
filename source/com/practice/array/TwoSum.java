package com.practice.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/two-sum
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        Map<Integer, Integer> memo = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; ++i) {
            Integer idx = memo.get(target - nums[i]);
            if (idx != null) {
                result[0] = i;
                result[1] = idx;
                break;
            }
            memo.put(nums[i], i);
        }

        return result;
    }

    public static void main(String[] args) {
        TwoSum sum = new TwoSum();
        System.out.println(Arrays.toString(sum.twoSum(new int[] { 2, 7, 11, 15 }, 9)));
        System.out.println(Arrays.toString(sum.twoSum(new int[] { 3, 2, 4 }, 6)));
        System.out.println(Arrays.toString(sum.twoSum(new int[] { 3, 3 }, 6)));
    }
}
