package com.practice.maths;

import java.util.Arrays;

public class AbsoluteDiffSumNumbers {

    public int absDifference(int[] nums, int k) {

        int n = nums.length;
        Arrays.sort(nums);

        int sumHighest = 0;
        int sumLowest = 0;
        for (int i = 0; i < k; i++) {
            sumLowest += nums[i];
        }

        int end = n - k;
        for (int j = n - 1; j >= end; --j) {
            sumHighest += nums[j];
        }

        return Math.abs(sumHighest - sumLowest);
    }

    public static void main(String[] args) {
        AbsoluteDiffSumNumbers sumNumbers = new AbsoluteDiffSumNumbers();
        System.out.println(sumNumbers.absDifference(new int[] { 5, 2, 2, 4 }, 2));
        System.out.println(sumNumbers.absDifference(new int[] { 100 }, 1));
    }
}
