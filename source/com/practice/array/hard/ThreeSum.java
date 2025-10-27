package com.practice.array.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        int n = nums.length;

        for (int i = 0; i < n; ++i) {

            if ((i != 0) && (nums[i - 1] == nums[i])) {
                continue;
            }

            int j = i + 1;
            int k = n - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while ((j < k) && (nums[j] == nums[j - 1]))
                        j++;
                    while ((j < k) && (nums[k] == nums[k + 1]))
                        k--;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        ThreeSum sum = new ThreeSum();
        System.out.println(sum.threeSum(new int[] { -1, 0, 1, 2, -1, -4 }));
        System.out.println(sum.threeSum(new int[] { 0, 1, 1 }));
        System.out.println(sum.threeSum(new int[] { 0, 0, 0 }));
    }
}
