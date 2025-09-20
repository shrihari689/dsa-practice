package com.practice.array;

public class SubarrayMaximumSum {

    public int maxSubArray(int[] nums) {

        int n = nums.length;

        int maximumSum = nums[0];
        int sum = nums[0];

        int start = 0;
        int end = 0;

        for (int i = 1; i < n; ++i) {

            if (sum < 0) {
                sum = nums[i];
                start = i;
                end = i;
            } else {
                sum += nums[i];
            }

            if (sum > maximumSum) {
                maximumSum = sum;
                end = i;
            }
        }

        System.out.print("The subarray is: ");
        while (start <= end) {
            System.out.print(nums[start++] + " ");
        }
        System.out.println();

        return maximumSum;
    }

    public static void main(String[] args) {
        SubarrayMaximumSum maximumSum = new SubarrayMaximumSum();
        System.out.println(maximumSum.maxSubArray(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 }));
        System.out.println(maximumSum.maxSubArray(new int[] { 5, 4, -1, 7, 8 }));
    }
}
