package com.practice.array;

public class LargestElement {
    public int largestElement(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        LargestElement element = new LargestElement();
        System.out.println(element.largestElement(new int[] { 3, 3, 6, 1 }));
        System.out.println(element.largestElement(new int[] { 3, 3, 0, 99, -40 }));
    }
}
