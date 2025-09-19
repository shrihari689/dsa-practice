package com.practice.array;

/**
 * https://leetcode.com/problems/single-number/
 * https://florian.github.io//xor-trick/
 */
public class SingleNumber {

    public int singleNumber(int[] nums) {
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }
        return xor;
    }

    public static void main(String[] args) {
        SingleNumber number = new SingleNumber();
        System.out.println(number.singleNumber(new int[] { 2, 2, 1 }));
        System.out.println(number.singleNumber(new int[] { 4, 1, 2, 1, 2 }));
        System.out.println(number.singleNumber(new int[] { 1 }));
    }
}
