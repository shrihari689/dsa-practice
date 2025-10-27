package com.practice.search.oned;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {

        int n = nums.length;

        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return start;
    }

    public static void main(String[] args) {

        SearchInsertPosition insertPosition = new SearchInsertPosition();
        System.out.println(insertPosition.searchInsert(new int[] { 1, 3, 5, 6 }, 5));
        System.out.println(insertPosition.searchInsert(new int[] { 1, 3, 5, 6 }, 2));
        System.out.println(insertPosition.searchInsert(new int[] { 1, 3, 5, 6 }, 7));
    }

}
