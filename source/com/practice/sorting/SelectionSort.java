package com.practice.sorting;

import java.util.Arrays;

/**
 * https://takeuforward.org/plus/dsa/problems/selection-sort
 */
public class SelectionSort {
    public int[] selectionSort(int[] nums) {

        int n = nums.length;
        for (int i = 0; i < n; ++i) {

            int min = nums[i];
            int minIdx = i;
            for (int j = i + 1; j < n; ++j) {
                if (nums[j] < min) {
                    min = nums[j];
                    minIdx = j;
                }
            }

            int temp = nums[minIdx];
            nums[minIdx] = nums[i];
            nums[i] = temp;
        }

        return nums;
    }

    public static void main(String[] args) {
        SelectionSort sort = new SelectionSort();
        System.out.println(Arrays.toString(sort.selectionSort(new int[] { 7, 4, 1, 5, 3 })));
        System.out.println(Arrays.toString(sort.selectionSort(new int[] { 5, 4, 4, 1, 1 })));
    }
}
