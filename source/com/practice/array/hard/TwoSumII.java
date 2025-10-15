package com.practice.array.hard;

import java.util.Arrays;

public class TwoSumII {
    public int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];

        int i = 0;
        int j = nums.length - 1;

        while (i < j) {
            int sum = nums[i] + nums[j];
            if (sum < target) {
                i++;
            } else if (sum > target) {
                j--;
            } else {
                result[0] = i + 1;
                result[1] = j + 1;
                return result;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        TwoSumII ii = new TwoSumII();
        System.out.println(Arrays.toString(ii.twoSum(new int[] { 2, 7, 11, 15 }, 9)));
        System.out.println(Arrays.toString(ii.twoSum(new int[] { 2, 3, 4 }, 6)));
        System.out.println(Arrays.toString(ii.twoSum(new int[] { -1, 0 }, -1)));
    }
}
