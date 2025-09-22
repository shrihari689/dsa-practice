package com.practice.array;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/rearrange-array-elements-by-sign
 */
public class RearrangeBySign {

    public int[] rearrangeArray(int[] nums) {

        int n = nums.length;

        int result[] = new int[n];

        int pos = 0;
        int neg = 1;

        for (int i = 0; i < n; ++i) {
            if (nums[i] > 0) {
                result[pos] = nums[i];
                pos += 2;
            } else {
                result[neg] = nums[i];
                neg += 2;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        RearrangeBySign bySign = new RearrangeBySign();
        System.out.println(Arrays.toString(bySign.rearrangeArray(new int[] { 3, 1, -2, -5, 2, -4 })));
        System.out.println(Arrays.toString(bySign.rearrangeArray(new int[] { -1, 1 })));
    }
}
