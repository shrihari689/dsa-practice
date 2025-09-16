package com.practice.sorting;

import java.util.Arrays;

/**
 * https://takeuforward.org/plus/dsa/problems/bubble-sort
 */
public class BubbleSort {

    private int[] sort(int nums[]) {

        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            boolean isSorted = true;
            int end = n - i - 1;
            for (int j = 0; j < end; ++j) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        System.out.println(Arrays.toString(bubbleSort.sort(new int[] { 1, 3, 5, 6, 7 })));
        System.out.println(Arrays.toString(bubbleSort.sort(new int[] { 7, 4, 1, 5, 3 })));
        System.out.println(Arrays.toString(bubbleSort.sort(new int[] { 5, 4, 4, 1, 1 })));
    }
}
