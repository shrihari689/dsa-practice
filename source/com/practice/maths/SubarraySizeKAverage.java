package com.practice.maths;

public class SubarraySizeKAverage {

    public int numOfSubarrays(int[] arr, int k, int threshold) {

        int count = 0;

        int n = arr.length;

        int sum = 0;
        for (int i = 0; i < k; ++i) {
            sum += arr[i];
        }

        int maxSum = threshold * k;
        if (sum >= maxSum) {
            count++;
        }

        for (int i = k; i < n; ++i) {
            sum -= arr[i - k];
            sum += arr[i];
            maxSum = threshold * k;
            if (sum >= maxSum) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        SubarraySizeKAverage average = new SubarraySizeKAverage();
        System.out.println(average.numOfSubarrays(new int[] { 2, 2, 2, 2, 5, 5, 5, 8 }, 3, 4));
        System.out.println(average.numOfSubarrays(new int[] { 11, 13, 17, 23, 29, 31, 7, 5, 2, 3 }, 3, 5));
    }
}
