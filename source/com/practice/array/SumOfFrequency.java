package com.practice.array;

public class SumOfFrequency {

    public int sumDivisibleByK(int[] nums, int k) {

        int n = nums.length;

        int memo[] = new int[101];
        for (int i = 0; i < n; ++i) {
            memo[nums[i]]++;
        }

        int sum = 0;
        for (int num : nums) {
            int freq = memo[num];
            if ((freq % k) == 0) {
                sum += num;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        SumOfFrequency frequency = new SumOfFrequency();
        System.out.println(frequency.sumDivisibleByK(new int[] { 1, 2, 2, 3, 3, 3, 3, 4 }, 2));
        System.out.println(frequency.sumDivisibleByK(new int[] { 1, 2, 3, 4, 5 }, 2));
        System.out.println(frequency.sumDivisibleByK(new int[] { 4, 4, 4, 1, 2, 3 }, 3));
    }
}