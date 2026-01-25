package com.practice.array;

import java.util.Arrays;

public class RotateNonNegativeElements {

    public int[] rotateElements(int[] nums, int k) {

        int n = nums.length;
        int result[] = new int[n];

        int count = 0;
        for (int i = 0; i < n; ++i) {
            if (nums[i] >= 0) {
                result[count++] = nums[i];
            }
        }

        if (count == 0) {
            return nums;
        }

        int rotate = k % count;

        for (int i = 0; i < n; ++i) {
            if (nums[i] >= 0) {
                nums[i] = result[rotate];
                rotate = (rotate + 1) % count;
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        RotateNonNegativeElements elements = new RotateNonNegativeElements();
        System.out.println(elements.rotateElements(new int[] { -6, -2 }, 18866));
        System.out.println(elements.rotateElements(new int[] { 1, -2, 4, 5, -3, 6, 3, 2, -5, -3 }, 2));
        System.out.println(elements.rotateElements(new int[] { 1, -2, 3, -4 }, 3));
        System.out.println(elements.rotateElements(new int[] { -3, -2, 7 }, 2));
        System.out.println(elements.rotateElements(new int[] { 5, 4, -9, 6 }, 2));
    }
}
