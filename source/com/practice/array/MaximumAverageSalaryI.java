package com.practice.array;

public class MaximumAverageSalaryI {

    public double findMaxAverage(int[] nums, int k) {

        int n = nums.length;

        double maxAverage = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < k; ++i) {
            sum += nums[i];
        }

        maxAverage = Math.max(maxAverage, (double) sum / k);

        for (int i = k; i < n; ++i) {
            sum += nums[i] - nums[i - k];
            maxAverage = Math.max(maxAverage, (double) sum / k);
        }

        return maxAverage;
    }

    public static void main(String[] args) {
        MaximumAverageSalaryI salaryI = new MaximumAverageSalaryI();
        System.out.println(salaryI.findMaxAverage(new int[] { 1, 12, -5, -6, 50, 3 }, 4));
        System.out.println(salaryI.findMaxAverage(new int[] { 5 }, 1));
    }
}
