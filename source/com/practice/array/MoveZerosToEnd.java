package com.practice.array;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/move-zeroes/description/
 */
public class MoveZerosToEnd {

    public int[] moveZeroes(int[] nums) {
        int n = nums.length;
        int idx = 0;
        for (int i = 0; i < n; ++i) {
            if (nums[i] != 0) {
                nums[idx++] = nums[i];
            }
        }
        for (int i = idx; i < n; ++i) {
            nums[i] = 0;
        }

        return nums;
    }

    public static void main(String[] args) {
        MoveZerosToEnd end = new MoveZerosToEnd();
        System.out.println(Arrays.toString(end.moveZeroes(new int[] { 0, 1, 0, 3, 12 })));
        System.out.println(Arrays.toString(end.moveZeroes(new int[] { 0 })));
    }
}
