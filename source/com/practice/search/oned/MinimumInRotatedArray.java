package com.practice.search.oned;

public class MinimumInRotatedArray {

    public int findMin(int[] nums) {

        int n = nums.length;

        int start = 0;
        int end = n - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return nums[start];
    }

    public static void main(String[] args) {

        MinimumInRotatedArray array = new MinimumInRotatedArray();
        System.out.println(array.findMin(new int[] { 5, 1, 2, 4 }));
        System.out.println(array.findMin(new int[] { 3, 4, 5, 1, 2 }));
        System.out.println(array.findMin(new int[] { 4, 5, 6, 7, 0, 1, 2 }));
        System.out.println(array.findMin(new int[] { 11, 13, 15, 17 }));
    }
}
