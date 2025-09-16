package com.practice.sorting;

import java.util.Arrays;

/**
 * https://takeuforward.org/plus/dsa/problems/insertion-sorting
 */
public class InsertionSort {

    public int[] insertionSort(int[] nums) {

        int n = nums.length;
        for (int i = 1; i < n; ++i) {
            int curr = nums[i];
            int j = i - 1;
            while ((j >= 0) && (nums[j] > curr)) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = curr;
        }

        return nums;
    }

    public static void main(String[] args) {
        InsertionSort sort = new InsertionSort();
        System.out.println(Arrays.toString(sort.insertionSort(new int[] { 7, 4, 1, 5, 3 })));
        System.out.println(Arrays.toString(sort.insertionSort(new int[] { 5, 4, 4, 1, 1 })));
    }
}
