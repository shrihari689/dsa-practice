package com.practice.maths;

public class MinimizeMaxDistanceGasStation {

    public static double MinimiseMaxDistance(int[] nums, int k) {

        int n = nums.length;

        double start = 0;
        double end = 0;

        for (int i = 1; i < n; ++i) {
            end = Math.max(end, nums[i] - nums[i - 1]);
        }

        double result = end;

        while ((end - start) > 1e-6) {

            double mid = start + (end - start) / 2;
            int count = countGasStations(nums, mid);
            if (count <= k) {
                result = mid;
                end = mid;
            } else {
                start = mid;
            }
        }

        return result;
    }

    private static int countGasStations(int nums[], double dist) {
        int count = 0;

        for (int i = 1; i < nums.length; i++) {
            int diff = nums[i] - nums[i - 1];
            if (diff > dist) {
                count += (int) Math.ceil((double) diff / dist) - 1;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(MinimizeMaxDistanceGasStation.MinimiseMaxDistance(new int[] { 3, 6, 12, 19, 33 }, 3));
        System.out.println(MinimizeMaxDistanceGasStation.MinimiseMaxDistance(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 6));
        System.out.println(MinimizeMaxDistanceGasStation.MinimiseMaxDistance(new int[] { 1, 2, 3, 4, 5 }, 4));
        System.out.println(
                MinimizeMaxDistanceGasStation.MinimiseMaxDistance(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, 1));
    }
}
