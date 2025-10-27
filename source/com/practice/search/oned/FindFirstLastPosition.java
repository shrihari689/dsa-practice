package com.practice.search.oned;

/**
 * https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array
 */
public class FindFirstLastPosition {

    private int findFirst(int nums[], int target) {
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

    private int findLast(int nums[], int target) {
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

    public int[] searchRange(int[] nums, int target) {

        int result[] = new int[] { -1, -1 };

        int n = nums.length;
        if (n == 0) {
            return result;
        }

        result[0] = findFirst(nums, target);
        result[1] = findLast(nums, target);

        return result;
    }

    public static void main(String[] args) {
        FindFirstLastPosition position = new FindFirstLastPosition();
        System.out.println(position.searchRange(new int[] { 5, 7, 7, 8, 8, 10 }, 8));
        System.out.println(position.searchRange(new int[] { 5, 7, 7, 8, 8, 10 }, 6));
        System.out.println(position.searchRange(new int[] {}, 0));
    }
}
