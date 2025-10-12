package com.practice.array.hard;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementII {

    public List<Integer> majorityElement(int[] nums) {

        int n = nums.length;

        if (n == 1) {
            return List.of(nums[0]);
        } else if (n == 2) {
            if (nums[0] != nums[1]) {
                return List.of(nums[0], nums[1]);
            } else {
                return List.of(nums[0]);
            }
        }

        List<Integer> result = new ArrayList<>();
        Integer candidate1 = null;
        Integer candidate2 = null;
        int count1 = 0, count2 = 0;

        for (int i = 0; i < n; ++i) {

            if ((candidate1 != null) && (candidate1 == nums[i])) {
                count1++;
            } else if ((candidate2 != null) && (candidate2 == nums[i])) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = nums[i];
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = nums[i];
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;
        for (int i = 0; i < n; ++i) {
            if (nums[i] == candidate1) {
                count1++;
            } else if (nums[i] == candidate2) {
                count2++;
            }
        }

        int div = (int) n / 3;
        if (count1 > div) {
            result.add(candidate1);
        }

        if (count2 > div) {
            result.add(candidate2);
        }

        return result;
    }

    public static void main(String[] args) {
        MajorityElementII elementII = new MajorityElementII();
        System.out.println(elementII.majorityElement(new int[] { 2, 1, 1, 3, 1, 4, 5, 6 }));
        System.out.println(elementII.majorityElement(new int[] { 1, 2 }));
        System.out.println(elementII.majorityElement(new int[] { 1 }));
    }
}
