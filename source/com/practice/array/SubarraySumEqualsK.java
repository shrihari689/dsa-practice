package com.practice.array;

public class SubarraySumEqualsK {

    public int subarraySum(int[] nums, int k) {

        int n = nums.length;

        int left = 0;
        int right = 0;

        int count = 0;

        int sum = 0;
        while (right < n) {
            while (sum < k) {
                sum += nums[right];
                right++;
            }
            if (sum == k) {
                count++;
            }

            while (sum > k) {
                sum -= nums[left++];
            }
            if (sum == k) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        SubarraySumEqualsK equalsK = new SubarraySumEqualsK();
        System.out.println(equalsK.subarraySum(new int[] { 1, 1, 1 }, 2));
        System.out.println(equalsK.subarraySum(new int[] { 1, 2, 3 }, 3));
    }
}
