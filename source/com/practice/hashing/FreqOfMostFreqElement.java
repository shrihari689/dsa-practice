package com.practice.hashing;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/frequency-of-the-most-frequent-element/
 */
public class FreqOfMostFreqElement {

    public int maxFrequency(int[] nums, int k) {

        Arrays.sort(nums);

        int n = nums.length;

        int maxFreq = 0;

        int left = 0;
        long sum = 0;

        for (int right = 0; right < n; ++right) {
            long target = nums[right];
            sum += target;

            int len = (right - left) + 1;

            while (((len * target) - sum) > k) {
                sum -= nums[left];
                left++;
                len = (right - left) + 1;
            }

            maxFreq = Math.max(maxFreq, len);
        }

        return maxFreq;
    }

    public static void main(String[] args) {
        FreqOfMostFreqElement element = new FreqOfMostFreqElement();
        System.out.println(element.maxFrequency(new int[] { 1, 2, 4 }, 5));
        System.out.println(element.maxFrequency(new int[] { 1, 4, 8, 13 }, 5));
        System.out.println(element.maxFrequency(new int[] { 3, 9, 6 }, 2));
    }
}
