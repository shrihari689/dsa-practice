package com.practice.search.oned;

public class PeakElement {

    public int findPeakElement(int[] nums) {

        int n = nums.length;

        int start = 0;
        int end = n - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    public static void main(String[] args) {
        PeakElement element = new PeakElement();
        System.out.println(element.findPeakElement(new int[] { 5, 4, 3, 1, 5, 2 }));
        System.out.println(element.findPeakElement(new int[] { 1, 2, 3, 1 }));
        System.out.println(element.findPeakElement(new int[] { 1, 2, 1, 3, 5, 6, 4 }));
    }
}
