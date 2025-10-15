package com.practice.array.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KSum {

    public List<List<Integer>> fourSum(int nums[], int target) {
        Arrays.sort(nums);
        return kSum(nums, target, 0, 4);
    }

    public List<List<Integer>> kSum(int nums[], int target, int start, int k) {

        List<List<Integer>> result = new ArrayList<>();

        if (start == nums.length) {
            return result;
        }

        int end = nums.length - 1;

        int average = target / k;
        if ((nums[start] > average) || (average > nums[end])) {
            return result;
        }

        // base condition
        if (k == 2) {
            return twoSum(nums, target, start);
        }

        for (int i = start; i <= end; ++i) {
            if ((i > start) && (nums[i] == nums[i - 1])) {
                continue;
            }
            List<List<Integer>> partialResults = kSum(nums, target - nums[i], i + 1, k - 1);
            for (List<Integer> partialResult : partialResults) {
                partialResult.add(nums[i]);
                result.add(partialResult);
            }
        }

        return result;
    }

    private List<List<Integer>> twoSum(int nums[], int target, int start) {

        List<List<Integer>> result = new ArrayList<>();

        int i = start;
        int j = nums.length - 1;

        while (i < j) {

            int sum = nums[i] + nums[j];
            if (sum < target) {
                i++;
            } else if (sum > target) {
                j--;
            } else {
                result.add(new ArrayList<>(Arrays.asList(nums[i], nums[j])));
                i++;
                j--;
                while ((i < j) && (nums[i] == nums[i - 1])) {
                    i++;
                }
                while ((i < j) && (nums[j] == nums[j + 1])) {
                    j--;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        KSum sum = new KSum();
        System.out.println(sum.fourSum(new int[] { 2, 2, 2, 2, 2 }, 8));
    }
}
