package com.practice.array;

import java.util.ArrayList;
import java.util.List;

/**
 * https://takeuforward.org/plus/dsa/problems/leaders-in-an-array
 */
public class LeaderInArray {
    public List<Integer> leaders(int[] nums) {

        List<Integer> result = new ArrayList<>();

        int n = nums.length;
        int prefixMax[] = new int[n + 1];
        prefixMax[n] = nums[n - 1];
        for (int i = n - 1; i >= 0; --i) {
            prefixMax[i] = Math.max(prefixMax[i + 1], nums[i]);
        }

        for (int i = 0; i < n; ++i) {
            if (nums[i] == prefixMax[i]) {
                result.add(nums[i]);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        LeaderInArray array = new LeaderInArray();
        System.out.println(array.leaders(new int[] { 1, 2, 5, 3, 1, 2 }));
        System.out.println(array.leaders(new int[] { -3, 4, 5, 1, -4, -5 }));
    }
}
