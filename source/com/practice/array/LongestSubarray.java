package com.practice.array;

public class LongestSubarray {

    public int longestSubarray(int[] nums, int k) {

        int n = nums.length;

        int i = 0;
        int j = 0;

        int sum = 0;
        int maxLength = 0;

        while (j < n) {
            while (j < n) {
                sum += nums[j];
                if (sum == k) {
                    maxLength = Math.max(maxLength, j - i + 1);
                } else if (sum > k) {
                    sum -= nums[j];
                    break;
                }
                j++;
            }
            sum -= nums[i++];
        }

        return maxLength;
    }

    public static void main(String[] args) {
        LongestSubarray subarray = new LongestSubarray();
        System.out.println(subarray.longestSubarray(new int[] { 10, 5, 2, 7, 1, 9 }, 15));
        System.out.println(subarray.longestSubarray(new int[] { -3, 2, 1 }, 6));
        System.out.println(subarray.longestSubarray(new int[] { -1, 1, 1 }, 1));
    }
}
