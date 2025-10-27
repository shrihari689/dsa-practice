package com.practice.array.hard;

import java.util.Arrays;

public class RepeatingMissingNumber {

    public int[] findMissingRepeatingNumbers(int[] nums) {
        int n = nums.length; // size of the array

        int result[] = new int[2];

        int xor = 0;
        for (int i = 0; i < n; ++i) {
            xor ^= nums[i];
            xor ^= (i + 1);
        }

        int diffBit = xor & (~(xor - 1));

        int bitSet = 0;
        int bitNotSet = 0;

        for (int i = 0; i < n; ++i) {

            if ((nums[i] & diffBit) != 0) {
                bitSet ^= nums[i];
            } else {
                bitNotSet ^= nums[i];
            }

            if (((i + 1) & diffBit) != 0) {
                bitSet ^= (i + 1);
            } else {
                bitNotSet ^= (i + 1);
            }
        }

        // assume repeating and missing
        result[0] = bitSet;
        result[1] = bitNotSet;

        int count = 0;
        for (int num : nums) {
            if (bitNotSet == num) {
                count++;
            }
        }

        if (count == 2) {
            result[0] = bitNotSet;
            result[1] = bitSet;
        }

        return result;
    }

    public static void main(String[] args) {
        RepeatingMissingNumber missingNumber = new RepeatingMissingNumber();
        System.out.println(Arrays.toString(missingNumber.findMissingRepeatingNumbers(new int[] { 1, 6, 2, 3, 4, 4 })));
        System.out.println(Arrays.toString(missingNumber.findMissingRepeatingNumbers(new int[] { 1, 2, 1, 3, 4, 5 })));
    }
}
