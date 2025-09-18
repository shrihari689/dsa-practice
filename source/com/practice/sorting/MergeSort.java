package com.practice.sorting;

import java.util.Arrays;

/**
 * https://takeuforward.org/plus/dsa/problems/merge-sorting
 */
public class MergeSort {

    public int[] mergeSort(int[] nums) {

        int n = nums.length;

        if (n == 1) {
            return nums;
        }

        int mid = n / 2;

        int left[] = new int[mid];
        for (int i = 0; i < mid; ++i) {
            left[i] = nums[i];
        }

        int right[] = new int[n - mid];
        for (int i = mid; i < n; ++i) {
            right[i - mid] = nums[i];
        }

        mergeSort(left);
        mergeSort(right);

        merge(left, right, nums);
        return nums;
    }

    private void merge(int left[], int right[], int result[]) {

        int leftLen = left.length;
        int rightLen = right.length;

        int i = 0, j = 0, k = 0;
        while ((i < leftLen) && (j < rightLen)) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        while (i < leftLen) {
            result[k++] = left[i++];
        }

        while (j < rightLen) {
            result[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        System.out.println(Arrays.toString(mergeSort.mergeSort(new int[] { 7, 4, 1, 5, 3, 1 })));
        System.out.println(Arrays.toString(mergeSort.mergeSort(new int[] { 38, 27, 43, 3, 9, 82, 10 })));
        System.out.println(Arrays.toString(mergeSort.mergeSort(new int[] { 5, 4, 4, 1, 1 })));
    }
}
