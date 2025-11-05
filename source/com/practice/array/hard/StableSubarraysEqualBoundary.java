package com.practice.array.hard;

import java.util.HashMap;
import java.util.Map;

public class StableSubarraysEqualBoundary {

    public long countStableSubarrays(int[] nums) {

        int n = nums.length;

        int prefixSum[] = new int[n];
        prefixSum[0] = nums[0];

        for (int i = 1; i < n; ++i) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }

        int count = 0;

        Map<Integer, Integer> indices = new HashMap<>();
        for (int i = 0; i < n; ++i) {
            int num = nums[i];
            int idx = indices.getOrDefault(num, -1);
            if (idx == -1) {
                indices.put(num, i);
                continue;
            }

            int diff = i - idx;
            if (diff == 1) {

                int consCount = 2;
                int consNum = nums[i];
                int start = i + 1;
                while (start < n && nums[start] == consNum) {
                    consCount++;
                    start++;
                }

                if (consCount < 3) {
                    i = start - 1;
                    indices.put(num, i);
                    continue;
                }

                if (consNum == 0) {
                    count += sumOfN(consCount - 2);
                } else {
                    count += (consCount - 2);
                }

                i = start - 1;
                indices.put(num, i);
                continue;
            }

            int sum = prefixSum[i - 1] - prefixSum[idx];
            if (sum == nums[i]) {
                count++;
            }
        }

        return count;
    }

    private int sumOfN(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        StableSubarraysEqualBoundary boundary = new StableSubarraysEqualBoundary();
        System.out.println(boundary.countStableSubarrays(new int[] { -3, -3, -3, 0, -3, -3, -3, 0, 0 }));
        System.out.println(boundary.countStableSubarrays(new int[] { 15, 15, 5, 5, 5, 15, 15, 0, 0 }));
        System.out.println(boundary.countStableSubarrays(new int[] { 0, 0, 0, 0 }));
        System.out.println(boundary.countStableSubarrays(new int[] { 9, 3, 3, 3, 9 }));
        System.out.println(boundary.countStableSubarrays(new int[] { 1, 2, 3, 4, 5 }));
        System.out.println(boundary.countStableSubarrays(new int[] { -4, 4, 0, 0, -8, -4 }));
    }
}
