package com.practice.search.oned;

public class CountOccurrenceSorted {

    private static int findFirst(int nums[], int target) {
        int n = nums.length;

        int first = -1;

        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                first = mid;
            }
            if (nums[mid] >= target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return first;
    }

    private static int findLast(int nums[], int target) {
        int n = nums.length;

        int last = -1;

        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                last = mid;
            }
            if (nums[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return last;
    }

    public static int count(int nums[], int n, int target) {

        int start = findFirst(nums, target);
        if (start == -1) {
            return 0;
        }

        int end = findLast(nums, target);

        return end - start + 1;
    }

    public static void main(String[] args) {
        System.out.println(CountOccurrenceSorted.count(new int[] { 1, 1, 1, 2, 2, 3, 3 }, 7, 3));
        System.out.println(CountOccurrenceSorted.count(new int[] { 1, 2, 4, 4, 5 }, 5, 6));
    }
}
