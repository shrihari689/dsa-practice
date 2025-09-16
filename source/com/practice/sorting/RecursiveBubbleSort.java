package com.practice.sorting;

import java.util.Arrays;

/**
 * https://takeuforward.org/plus/dsa/problems/recursive-bubble-sort
 */
public class RecursiveBubbleSort {

    public int[] bubbleSort(int[] nums) {
        return sort(nums, nums.length);
    }

    private int[] sort(int nums[], int idx) {
        if (idx == 0) {
            return nums;
        }

        for (int i = 0; i < (idx - 1); ++i) {
            if (nums[i] > nums[i + 1]) {
                int temp = nums[i];
                nums[i] = nums[i + 1];
                nums[i + 1] = temp;
            }
        }

        return sort(nums, idx - 1);
    }

    public static void main(String[] args) {
        RecursiveBubbleSort bubbleSort = new RecursiveBubbleSort();
        System.out.println(Arrays.toString(bubbleSort.bubbleSort(new int[] { 7, 4, 1, 5, 3 })));
        System.out.println(Arrays.toString(bubbleSort.bubbleSort(new int[] { 38, 27, 43, 3, 9, 82, 10 })));
        System.out.println(Arrays.toString(bubbleSort.bubbleSort(new int[] { 5, 4, 4, 1, 1 })));
    }
}
