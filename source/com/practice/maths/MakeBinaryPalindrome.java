package com.practice.maths;

import java.util.Arrays;

public class MakeBinaryPalindrome {

    public int[] minOperations(int[] nums) {

        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            int result = nums[i];
            if ((result & 1) != 1) {
            }
            nums[i] = result;
        }
        return nums;
    }

    public static void main(String[] args) {
        MakeBinaryPalindrome palindrome = new MakeBinaryPalindrome();
        System.out.println(Arrays.toString(palindrome.minOperations(new int[] { 1, 2, 4 })));
        System.out.println(Arrays.toString(palindrome.minOperations(new int[] { 6, 7, 12 })));
    }
}
