package com.practice.search.math;

import java.util.Arrays;

public class KokoEatingBananas {

    public int minEatingSpeed(int[] piles, int h) {

        int max = Arrays.stream(piles).max().getAsInt();

        int start = 0;
        int end = max;

        int ans = max;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            int hours = totalHours(piles, mid);
            if (hours <= h) {
                ans = Math.min(mid, ans);
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }

    private int totalHours(int piles[], int pilesPerHour) {
        int hours = 0;

        for (int pile : piles) {
            hours += Math.ceil(((double) pile / pilesPerHour));
        }

        return hours;
    }

    public static void main(String[] args) {
        KokoEatingBananas bananas = new KokoEatingBananas();
        System.out.println(bananas.minEatingSpeed(new int[] { 3, 6, 7, 11 }, 8));
        System.out.println(bananas.minEatingSpeed(new int[] { 30, 11, 23, 4, 20 }, 5));
        System.out.println(bananas.minEatingSpeed(new int[] { 30, 11, 23, 4, 20 }, 6));
    }
}
