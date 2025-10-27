package com.practice.search.oned;

public class BinarySearch {

    public int search(int[] nums, int target) {

        int n = nums.length;

        int start = 0;
        int end = n - 1;

        while (start < end) {
            int mid = start + ((end - start) / 2);

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] > target) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.search(new int[] { -1, 0, 3, 5, 9, 12 }, 9));
        System.out.println(binarySearch.search(new int[] { -1, 0, 3, 5, 9, 12 }, 2));
    }
}
