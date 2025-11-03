package com.practice.search.math;

public class MinDaysToMakeBouquets {

    public int minDays(int[] bloomDay, int m, int k) {

        int n = bloomDay.length;
        long requiredFlowers = (long) m * k;

        if (n < requiredFlowers) {
            return -1;
        }

        int start = Integer.MAX_VALUE;
        int end = Integer.MIN_VALUE;

        for (int bloom : bloomDay) {
            if (bloom < start) {
                start = bloom;
            }
            if (bloom > end) {
                end = bloom;
            }
        }

        int minDays = end;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int count = calculateBouquets(bloomDay, k, mid, m);
            if (count >= m) {
                if (mid < minDays) {
                    minDays = mid;
                }
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return minDays;
    }

    private int calculateBouquets(int bloomDays[], int flowers, int day, int bouquets) {
        int count = 0;

        int curr = 0;
        for (int i = 0; i < bloomDays.length; ++i) {
            if (bloomDays[i] <= day) {
                curr += 1;
                if (curr == flowers) {
                    count++;
                    curr = 0;
                }
            } else {

                curr = 0;

                int remainingFlowers = bloomDays.length - 1 - i;
                int remainingBouquets = bouquets - count;
                int neededFlowers = remainingBouquets * flowers;
                if (remainingFlowers < neededFlowers) {
                    break;
                }

            }
            if (count == bouquets) {
                break;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        MinDaysToMakeBouquets bouquets = new MinDaysToMakeBouquets();
        System.out.println(bouquets.minDays(new int[] { 2343432 }, 89945, 32127));
        System.out.println(bouquets.minDays(new int[] { 7, 7, 7, 7, 12, 7, 7 }, 2, 3));
        System.out.println(bouquets.minDays(new int[] { 1, 10, 3, 10, 2 }, 3, 1));
        System.out.println(bouquets.minDays(new int[] { 1, 10, 3, 10, 2 }, 3, 2));
    }
}
