package com.practice.array;

import java.util.Arrays;

public class NextPermutation {

    public void nextPermutation(int[] nums) {

        int n = nums.length;

        int minIdx = n - 2;
        while ((minIdx >= 0) && (nums[minIdx] >= nums[minIdx + 1])) {
            minIdx--;
        }

        int maxIdx = n - 1;
        if (minIdx >= 0) {
            while ((maxIdx >= 0) && (nums[maxIdx] <= nums[minIdx])) {
                maxIdx--;
            }
            int temp = nums[minIdx];
            nums[minIdx] = nums[maxIdx];
            nums[maxIdx] = temp;
        }

        reverse(nums, minIdx + 1, n - 1);
    }

    private void reverse(int nums[], int start, int end) {
        for (int i = start, j = end; i < j; ++i, --j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }

    public static void main(String[] args) {
        NextPermutation permutation = new NextPermutation();
        int arr[] = { 1, 5, 1 };
        permutation.nextPermutation(arr);
        System.out.println(Arrays.toString(arr));

        arr = new int[] { 1, 3, 2 };
        permutation.nextPermutation(arr);
        System.out.println(Arrays.toString(arr));

        arr = new int[] { 1, 2, 3 };
        permutation.nextPermutation(arr);
        System.out.println(Arrays.toString(arr));

        arr = new int[] { 1, 1, 5 };
        permutation.nextPermutation(arr);
        System.out.println(Arrays.toString(arr));

        arr = new int[] { 3, 2, 1 };
        permutation.nextPermutation(arr);
        System.out.println(Arrays.toString(arr));

    }
}
