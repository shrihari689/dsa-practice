package com.practice.search.math;

public class SplitArrayLargestSum {

    public int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;

        for (int num : nums) {
            start = Math.max(start, num);
            end += num;
        }

        int result = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (canSplit(nums, k, mid)) {
                result = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return result;
    }

    private boolean canSplit(int nums[], int maxParts, int maxSum) {

        int n = nums.length;

        int parts = 1;
        int sum = 0;

        for (int i = 0; i < n; ++i) {
            int num = nums[i];
            if ((sum + num) > maxSum) {
                parts++;
                sum = num;
            } else {
                sum += num;
            }
            if (parts > maxParts) {
                return false;
            }
        }

        return parts <= maxParts;
    }

    public static void main(String[] args) {
        SplitArrayLargestSum sum = new SplitArrayLargestSum();
        System.out.println(sum.splitArray(new int[] { 7, 2, 5, 10, 8 }, 2));
        System.out.println(sum.splitArray(new int[] { 1, 2, 3, 4, 5 }, 2));
    }
}
