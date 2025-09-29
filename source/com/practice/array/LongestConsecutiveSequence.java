package com.practice.array;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {

        int n = nums.length;

        Set<Integer> memo = new HashSet<>();
        for (int i = 0; i < n; ++i) {
            memo.add(nums[i]);
        }

        int maxCount = 0;
        for (int x : memo) {
            // previous number
            if (!memo.contains((x - 1))) {
                int count = 0;
                while (memo.contains(x + count)) {
                    count++;
                }
                maxCount = Math.max(maxCount, count);
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {
        LongestConsecutiveSequence consecutiveSequence = new LongestConsecutiveSequence();
        System.out.println(consecutiveSequence.longestConsecutive(new int[] { 100, 4, 200, 1, 3, 2 }));
        System.out.println(consecutiveSequence.longestConsecutive(new int[] { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 }));
    }
}
