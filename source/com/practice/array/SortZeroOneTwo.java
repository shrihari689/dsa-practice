package com.practice.array;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/sort-colors/
 */
public class SortZeroOneTwo {

    public void sortZeroOneTwo(int[] nums) {

        int n = nums.length;

        int low = 0;
        int mid = 0;
        int high = n - 1;

        while (mid <= high) {

            if (nums[mid] == 2) {
                swap(nums, mid, high);
                high--;
            } else if (nums[mid] == 0) {
                swap(nums, mid, low);
                low++;
                mid++;
            } else {
                mid++;
            }
        }
    }

    private void swap(int arr[], int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void main(String[] args) {
        SortZeroOneTwo oneTwo = new SortZeroOneTwo();

        int arr[] = new int[] { 2 };
        oneTwo.sortZeroOneTwo(arr);
        System.out.println(Arrays.toString(arr));

        arr = new int[] { 1, 0, 2, 1, 0 };
        oneTwo.sortZeroOneTwo(arr);
        System.out.println(Arrays.toString(arr));

        arr = new int[] { 0, 0, 1, 1, 1 };
        oneTwo.sortZeroOneTwo(arr);
        System.out.println(Arrays.toString(arr));
    }
}
