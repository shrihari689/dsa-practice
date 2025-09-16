package com.practice.sorting;

import java.util.Arrays;

/**
 * https://takeuforward.org/plus/dsa/problems/recursive-insertion-sort
 */
public class RecursiveInsertionSort {

    public int[] insertionSort(int[] nums) {
        return sort(nums, 1);
    }

    private int[] sort(int nums[], int idx) {

        if (idx >= nums.length) {
            return nums;
        }

        int curr = nums[idx];
        while ((idx > 0) && (nums[idx - 1] > curr)) {
            nums[idx] = nums[idx - 1];
            idx--;
        }
        nums[idx] = curr;

        return sort(nums, idx + 1);
    }

    public static void main(String[] args) {
        RecursiveInsertionSort sort = new RecursiveInsertionSort();
        System.out.println(Arrays.toString(sort.insertionSort(new int[] { 7, 4, 1, 5, 3 })));
        System.out.println(Arrays.toString(sort.insertionSort(new int[] { 38, 27, 43, 3, 9, 82, 10 })));
        System.out.println(Arrays.toString(sort.insertionSort(new int[] { 5, 4, 4, 1, 1 })));
    }
}
