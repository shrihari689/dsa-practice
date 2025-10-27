package com.practice.array.hard;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/merge-sorted-array/
 */
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        if (n == 0) {
            return;
        }

        int end = m + n - 1;
        int i = m - 1;
        int j = n - 1;

        while ((i >= 0) && (j >= 0)) {
            if (nums2[j] > nums1[i]) {
                nums1[end--] = nums2[j--];
            } else {
                nums1[end--] = nums1[i--];
            }
        }

        while (j >= 0) {
            nums1[end--] = nums2[j--];
        }

        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        MergeSortedArray array = new MergeSortedArray();
        array.merge(new int[] { 1, 2, 3, 0, 0, 0 }, 3, new int[] { 2, 5, 6 }, 3);
        array.merge(new int[] { 1 }, 1, new int[] {}, 0);
        array.merge(new int[] { 0 }, 0, new int[] { 1 }, 1);
    }
}
