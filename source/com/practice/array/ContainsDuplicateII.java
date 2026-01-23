package com.practice.array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateII {

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        int n = nums.length;

        Set<Integer> memo = new HashSet<>();

        for (int i = 0; i < n; ++i) {
            if (memo.contains(nums[i])) {
                return true;
            }
            memo.add(nums[i]);
            if (memo.size() > k) {
                memo.remove(nums[i - k]);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicateII duplicateII = new ContainsDuplicateII();
        System.out.println(duplicateII.containsNearbyDuplicate(new int[] { 1, 2, 1 }, 0));
        System.out.println(duplicateII.containsNearbyDuplicate(new int[] { 1, 2, 3, 1, 2, 3 }, 2));
        System.out.println(duplicateII.containsNearbyDuplicate(new int[] { 1 }, 1));
        System.out.println(duplicateII.containsNearbyDuplicate(new int[] { 1, 2, 3, 1 }, 3));
        System.out.println(duplicateII.containsNearbyDuplicate(new int[] { 1, 0, 1, 1 }, 1));
    }
}
