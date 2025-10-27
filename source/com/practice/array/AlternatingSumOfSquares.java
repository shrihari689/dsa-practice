package com.practice.array;

import java.util.Arrays;

public class AlternatingSumOfSquares {

    public long maxAlternatingSum(int[] nums) {

        int n = nums.length;

        // turn all positive.
        for (int i = 0; i < n; ++i) {
            if (nums[i] < 0) {
                nums[i] *= -1;
            }
        }

        Arrays.sort(nums);

        long sum = 0;

        for (int i = 0, j = n - 1; i <= j; ++i, --j) {
            if (i == j) {
                sum += (nums[j] * nums[j]);
                continue;
            } else {
                sum += (nums[j] * nums[j]);
                sum -= (nums[i] * nums[i]);
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        AlternatingSumOfSquares ofSquares = new AlternatingSumOfSquares();
        System.out.println(ofSquares.maxAlternatingSum(new int[] { 1, 2, 3 }));
        System.out.println(ofSquares.maxAlternatingSum(new int[] { 1, -1, 2, -2, 3, -3 }));
    }
}
