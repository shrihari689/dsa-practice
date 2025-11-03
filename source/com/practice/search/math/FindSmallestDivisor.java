package com.practice.search.math;

public class FindSmallestDivisor {

    public int smallestDivisor(int[] nums, int threshold) {

        int start = 1;
        int end = 1000_001;

        int divisor = end;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (calculateSum(nums, mid, threshold)) {
                if (mid < divisor) {
                    divisor = mid;
                }
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return divisor;
    }

    private boolean calculateSum(int nums[], int divisor, int threshold) {
        long sum = 0;

        for (int num : nums) {
            sum += (int) ((num + divisor - 1) / divisor);
            if (sum > threshold) {
                return false;
            }
        }

        return sum <= threshold;
    }

    public static void main(String[] args) {
        FindSmallestDivisor divisor = new FindSmallestDivisor();
        System.out.println(divisor.smallestDivisor(new int[] { 21212, 10101, 12121 }, 1000000));
        System.out.println(divisor.smallestDivisor(new int[] { 1, 2, 5, 9 }, 6));
        System.out.println(divisor.smallestDivisor(new int[] { 44, 22, 33, 11, 1 }, 5));
    }
}
