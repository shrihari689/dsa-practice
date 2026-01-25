package com.practice.array;

import java.util.HashSet;
import java.util.Set;

public class MinimumOperationsTargetArray {

    public int minOperations(int[] nums, int[] target) {

        int count = 0;
        int n = nums.length;

        Set<Integer> memo = new HashSet<>();

        for (int i = 0; i < n; ++i) {
            int a = nums[i];
            int b = target[i];

            if ((a != b) && (!memo.contains(a))) {
                count++;
                memo.add(a);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        MinimumOperationsTargetArray array = new MinimumOperationsTargetArray();
        System.out.println(array.minOperations(new int[] { 1, 2, 3 }, new int[] { 2, 1, 3 }));
        System.out.println(array.minOperations(new int[] { 4, 1, 4 }, new int[] { 5, 1, 4 }));
        System.out.println(array.minOperations(new int[] { 7, 3, 7 }, new int[] { 5, 5, 9 }));
    }
}
