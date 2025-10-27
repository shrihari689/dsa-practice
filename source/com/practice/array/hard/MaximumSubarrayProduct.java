package com.practice.array.hard;

public class MaximumSubarrayProduct {

    public int maxProduct(int[] nums) {

        int n = nums.length;

        int result = 1;
        int minProduct = 1;
        int maxProduct = 1;

        for (int i = 0; i < n; ++i) {

            int curr = nums[i];

            // swap it to min product.
            if (curr < 0) {
                int temp = minProduct;
                minProduct = maxProduct;
                maxProduct = temp;
            }

            // maximum of minProduct is min actually!
            minProduct = Math.min(curr, curr * minProduct);

            maxProduct = Math.max(curr, curr * maxProduct);

            result = Math.max(result, maxProduct);
        }

        return result;
    }

    public static void main(String[] args) {
        MaximumSubarrayProduct subarrayProduct = new MaximumSubarrayProduct();
        System.out.println(subarrayProduct.maxProduct(new int[] { -3, 0, 1, -2 }));
        System.out.println(subarrayProduct.maxProduct(new int[] { -2, 3, -4 }));
        System.out.println(subarrayProduct.maxProduct(new int[] { 2, 3, -2, 4 }));
        System.out.println(subarrayProduct.maxProduct(new int[] { -2, 0, -1 }));
    }
}
