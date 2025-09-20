package com.practice.array;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public int majorityElement(int[] nums) {

        int n = nums.length;
        int minCount = n / 2;

        Map<Integer, Integer> memo = new HashMap<>();

        for (int i = 0; i < n; ++i) {
            int count = memo.getOrDefault(nums[i], 0) + 1;
            if (count > minCount) {
                return nums[i];
            }
            memo.put(nums[i], count);
        }

        return -1;
    }

    public static void main(String[] args) {
        MajorityElement element = new MajorityElement();
        System.out.println(element.majorityElement(new int[] { 3, 2, 3 }));
        System.out.println(element.majorityElement(new int[] { 2, 2, 1, 1, 1, 2, 2 }));
    }
}
