package com.practice.maths;

import java.util.HashSet;
import java.util.Set;

public class MinimumOperationsToDistinct {

    public int minOperations(int[] nums) {

        int count = 0;

        Set<Integer> memo = new HashSet<>();

        int n = nums.length;
        for (int i = n - 1; i >= 0; --i) {
            if (memo.contains(nums[i])) {
                return ((i / 3) + 1);
            }
            memo.add(nums[i]);
        }

        return count;
    }

    public static void main(String[] args) {
        MinimumOperationsToDistinct distinct = new MinimumOperationsToDistinct();
        System.out.println(distinct.minOperations(new int[] { 3, 8, 3, 6, 5, 8 }));
        System.out.println(distinct.minOperations(new int[] { 4, 3, 5, 1, 2 }));
        System.out.println(distinct.minOperations(new int[] { 2, 2 }));
    }
}
