package com.practice.search.math;

import java.util.Arrays;

public class ShipPackagesWithinDays {

    public int shipWithinDays(int[] weights, int days) {

        int start = 1;
        int end = Arrays.stream(weights).sum();

        int minCapacity = Integer.MAX_VALUE;

        while (start <= end) {

            int mid = start + (end - start) / 2;
            if (daysToShip(weights, mid, days)) {
                if (mid < minCapacity) {
                    minCapacity = mid;
                }
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return minCapacity;
    }

    private boolean daysToShip(int[] weights, int capacity, int maxDays) {
        int days = 0;

        int currCapacity = 0;
        for (int weight : weights) {
            if (weight > capacity) {
                return false;
            }
            currCapacity += weight;
            if (currCapacity == capacity) {
                currCapacity = 0;
                days++;
            }
            if (currCapacity > capacity) {
                days++;
                currCapacity = weight;
            }

            if (days > maxDays) {
                return false;
            }
        }

        if ((currCapacity > 0) && (currCapacity <= capacity)) {
            days++;
        }

        return days <= maxDays;
    }

    public static void main(String[] args) {
        ShipPackagesWithinDays days = new ShipPackagesWithinDays();
        System.out.println(days.shipWithinDays(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, 1));
        System.out.println(days.shipWithinDays(new int[] { 1, 2, 3, 1, 1 }, 4));
        System.out.println(days.shipWithinDays(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, 5));
        System.out.println(days.shipWithinDays(new int[] { 3, 2, 2, 4, 1, 4 }, 3));
    }
}
