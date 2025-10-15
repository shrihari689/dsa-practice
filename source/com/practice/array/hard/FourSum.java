package com.practice.array.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        int n = nums.length;

        for (int i = 0; i < n; ++i) {

            if ((i > 0) && (nums[i] == nums[i - 1])) {
                continue;
            }

            int start = i + 1;
            for (int j = start; j < n; ++j) {

                if ((j > start) && (nums[j] == nums[j - 1])) {
                    continue;
                }

                int k = j + 1;
                int l = n - 1;

                while (k < l) {
                    long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];
                    if (sum < target) {
                        k++;
                    } else if (sum > target) {
                        l--;
                    } else {
                        result.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        k++;
                        l--;
                        while ((k < l) && (nums[k] == nums[k - 1]))
                            k++;
                        while ((k < l) && (nums[l] == nums[l + 1]))
                            l--;
                    }
                }
            }

        }

        return result;
    }

    public static void main(String[] args) {
        FourSum fourSum = new FourSum();
        System.out.println(fourSum.fourSum(new int[] { 1000000000, 1000000000, 1000000000, 1000000000 }, -294967296));
        System.out.println(fourSum.fourSum(new int[] { 2, 2, 2, 2, 2 }, 8));
        System.out.println(fourSum.fourSum(new int[] { 1, 0, -1, 0, -2, 2 }, 0));
    }
}
