package com.practice.array;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/rotate-array/
 */
public class RotateArray {

    public int[] rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        reverse(nums, 0, n - 1);

        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);

        return nums;
    }

    private void reverse(int nums[], int start, int end) {
        for (int i = start, j = end; i < j; ++i, --j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }

    public static void main(String[] args) {
        RotateArray array = new RotateArray();
        System.out.println(Arrays.toString(array.rotate(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 3)));
        System.out.println(Arrays.toString(array.rotate(new int[] { -1, -100, 3, 99 }, 2)));
    }
}
