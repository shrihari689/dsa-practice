package com.practice.array;

public class MinimumPrefixRemoval {

    public int minimumPrefixLength(int[] nums) {

        int n = nums.length;

        if (n < 2) {
            return 0;
        }

        for (int i = n - 1; i > 0; --i) {
            if (nums[i] <= nums[i - 1]) {
                return i;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        MinimumPrefixRemoval prefixRemoval = new MinimumPrefixRemoval();
        System.out.println(prefixRemoval.minimumPrefixLength(new int[] { 1, -1, 2, 3, 3, 4, 5 }));
        System.out.println(prefixRemoval.minimumPrefixLength(new int[] { 4, 3, -2, -5 }));
        System.out.println(prefixRemoval.minimumPrefixLength(new int[] { 1, 2, 3, 4 }));
    }
}
