package com.practice.search.oned;

public class SearchInRotatedArrayII {
    public boolean search(int[] nums, int target) {

        int n = nums.length;

        int start = 0;
        int end = n - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return true;
            }

            if ((nums[start] == nums[mid]) && (nums[mid] == nums[end])) {
                start++;
                end--;
                continue;
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

        return false;
    }

    public static void main(String[] args) {

        SearchInRotatedArrayII array = new SearchInRotatedArrayII();
        System.out.println(array.search(new int[] { 1, 2, 2, 2, 2, 2, 2, 2, 0, 1 }, 0)); // true
        System.out.println(array.search(new int[] { 2, 0, 0, 1 }, 1)); // true
        System.out.println(array.search(new int[] { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1 }, 2)); // true
        System.out.println(array.search(new int[] { 2, 5, 6, 0, 0, 1, 2 }, 3)); // false
        System.out.println(array.search(new int[] { 1, 0, 1, 1, 1 }, 0)); // true
        System.out.println(array.search(new int[] { 2, 5, 6, 0, 0, 1, 2 }, 0)); // true
    }
}
