package com.practice.array;

public class MaximumProductThreeElements {

    public long maxProduct(int[] nums) {

        int max = Integer.MIN_VALUE;
        int secondMax = max;

        for (int num : nums) {
            int curr = Math.abs(num);
            if (curr > max) {
                secondMax = max;
                max = curr;
            } else if (curr > secondMax) {
                secondMax = curr;
            }
        }

        long product = max * secondMax * 100_000;
        return product;
    }

    public static void main(String[] args) {
        MaximumProductThreeElements elements = new MaximumProductThreeElements();
        System.out.println(elements.maxProduct(new int[] { -5, 7, 0 }));
        System.out.println(elements.maxProduct(new int[] { -4, -2, -1, -3 }));
        System.out.println(elements.maxProduct(new int[] { 0, 10, 0 }));
    }
}
