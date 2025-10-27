package com.practice.array.hard;

import java.util.Arrays;

public class RepeatingMissingNumberMath {

    public int[] findMissingRepeatingNumbers(int[] nums) {
        int n = nums.length; // size of the array

        int result[] = new int[2];

        long sum = 0;
        long sumSq = 0;

        long sumOfN = ((long) n * (n + 1)) / 2;
        long sumOfNSq = ((long) n * (n + 1) * ((2 * n) + 1)) / 6;

        for (int i = 0; i < n; ++i) {
            sum += nums[i];
            sumSq += (long) nums[i] * (long) nums[i];
        }

        long val2 = sum - sumOfN;
        long val1 = (sumSq - sumOfNSq) / val2;

        int x = (int) ((val1 + val2) / 2);
        int y = (int) (val1 - x);

        result[0] = x;
        result[1] = y;

        return result;
    }

    public static void main(String[] args) {
        RepeatingMissingNumberMath missingNumber = new RepeatingMissingNumberMath();
        System.out.println(Arrays.toString(missingNumber.findMissingRepeatingNumbers(new int[] { 1, 6, 2, 3, 4, 4 })));
        System.out.println(Arrays.toString(missingNumber.findMissingRepeatingNumbers(new int[] { 1, 2, 1, 3, 4, 5 })));
    }
}
