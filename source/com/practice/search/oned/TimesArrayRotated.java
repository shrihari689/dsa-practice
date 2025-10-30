package com.practice.search.oned;

public class TimesArrayRotated {

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

        return start;
    }

    public static void main(String[] args) {
        TimesArrayRotated arrayRotated = new TimesArrayRotated();
        System.out.println(arrayRotated.findMin(new int[] { 4, 5, 6, 7, 0, 1, 2, 3 }));
        System.out.println(arrayRotated.findMin(new int[] { 3, 4, 5, 1, 2 }));
    }
}
