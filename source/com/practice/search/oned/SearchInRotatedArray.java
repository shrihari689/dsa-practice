package com.practice.search.oned;

public class SearchInRotatedArray {
    public int search(int[] nums, int target) {

        int n = nums.length;

        int start = 0;
        int end = n - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // left is sorted.
            if (nums[start] <= nums[mid]) {

                if ((target >= nums[start]) && (target <= nums[mid])) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            } else {

                if ((target >= nums[mid]) && (target <= nums[end])) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }

        return -1;
    }

    public static void main(String[] args) {

        SearchInRotatedArray array = new SearchInRotatedArray();
        System.out.println(array.search(new int[] { 4, 5, 0, 1, 2, 3, 4 }, 0));
        System.out.println(array.search(new int[] { 7, 8, 8, 9, 0, 1, 6 }, 8));
        System.out.println(array.search(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 0));
        System.out.println(array.search(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 6));
        System.out.println(array.search(new int[] { 1 }, 0));
    }
}
