package com.practice.search.oned;

public class LowerUpperBound {

    public int lowerBound(int[] nums, int target) {

        int n = nums.length;

        int start = 0;
        int end = n - 1;

        int lower = n;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] >= target) {
                lower = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return lower;
    }

    public int upperBound(int[] nums, int target) {

        int n = nums.length;

        int start = 0;
        int end = n - 1;

        int upper = n;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > target) {
                upper = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return upper;
    }

    public static void main(String[] args) {
        LowerUpperBound bound = new LowerUpperBound();
        System.out.println(bound.lowerBound(new int[] { 1, 2, 2, 3 }, 2));
        System.out.println(bound.lowerBound(new int[] { 3, 5, 8, 15, 19 }, 9));
        System.out.println(bound.upperBound(new int[] { 1, 2, 2, 3 }, 2));
        System.out.println(bound.upperBound(new int[] { 3, 5, 8, 9, 15, 19 }, 9));
    }
}
