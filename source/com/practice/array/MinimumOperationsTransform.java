package com.practice.array;

public class MinimumOperationsTransform {
    public long minOperations(int[] nums1, int[] nums2) {

        int n = nums1.length;

        int last = nums2[n];
        int minDiff = Integer.MAX_VALUE;

        long ops = 0;

        for (int i = 0; i < n; ++i) {
            ops += Math.abs(nums1[i] - nums2[i]);
        }

        for (int i = 0; i < n; ++i) {

            int min = Math.min(nums1[i], nums2[i]);
            int max = Math.max(nums1[i], nums2[i]);

            if ((last >= min) && (last <= max)) {
                minDiff = 0;
                break;
            }

            minDiff = Math.min(minDiff, Math.min(Math.abs(nums1[i] - last), Math.abs(nums2[i] - last)));
            if (minDiff == 0) {
                break;
            }
        }

        ops += 1;
        ops += minDiff;

        return ops;
    }

    public static void main(String[] args) {
        MinimumOperationsTransform minOps = new MinimumOperationsTransform();
        System.out.println(minOps.minOperations(new int[] { 380, 994 }, new int[] { 357, 677, 43 }));
        System.out.println(minOps.minOperations(new int[] { 753, 357 }, new int[] { 271, 520, 413 }));
        System.out.println(minOps.minOperations(new int[] { 2 }, new int[] { 3, 4 }));
        System.out.println(minOps.minOperations(new int[] { 2, 8 }, new int[] { 1, 7, 3 }));
        System.out.println(minOps.minOperations(new int[] { 1, 3, 6 }, new int[] { 2, 4, 5, 3 }));
    }
}
