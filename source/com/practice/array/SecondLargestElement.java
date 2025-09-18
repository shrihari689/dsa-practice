package com.practice.array;

/**
 * https://takeuforward.org/plus/dsa/problems/second-largest-element
 */
public class SecondLargestElement {

    public int secondLargestElement(int[] nums) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            if (nums[i] > max) {
                secondMax = max;
                max = nums[i];
            } else if ((nums[i] > secondMax) && (nums[i] != max)) {
                secondMax = nums[i];
            }
        }

        return secondMax == Integer.MIN_VALUE ? -1 : secondMax;
    }

    public static void main(String[] args) {
        SecondLargestElement element = new SecondLargestElement();
        System.out.println(element.secondLargestElement(new int[] { 8, 8, 7, 6, 5 }));
        System.out.println(element.secondLargestElement(new int[] { 10, 10, 10, 11, 10 }));
    }
}
