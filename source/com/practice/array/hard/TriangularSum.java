package com.practice.array.hard;

public class TriangularSum {
    public int triangularSum(int[] nums) {
        int n = nums.length;
        for (int i = 1; i < n; ++i) {
            int end = n - i + 1;
            for (int j = 1; j < end; ++j) {
                nums[j - 1] += nums[j];
                nums[j - 1] %= 10;
            }
        }
        return nums[0];
    }

    public static void main(String[] args) {
        TriangularSum sum = new TriangularSum();
        System.out.println(sum.triangularSum(new int[] { 1, 2, 3, 4, 5 }));
    }
}
