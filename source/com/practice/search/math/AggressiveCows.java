package com.practice.search.math;

import java.util.Arrays;

public class AggressiveCows {

    public static int aggressiveCows(int[] stalls, int k) {

        int n = stalls.length;

        int start = 0;
        int end = Arrays.stream(stalls).max().getAsInt();

        int minDistance = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (canAssign(stalls, k, mid)) {
                if (mid < minDistance) {
                    minDistance = mid;
                }
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return minDistance;
    }

    private static boolean canAssign(int[] stalls, int cows, int distance) {
        int n = stalls.length;

        int cowsAssigned = 1;
        int lastStall = stalls[0];

        for (int i = 1; i < n; ++i) {
            if ((stalls[i] - lastStall) >= distance) {
                cowsAssigned++;
                lastStall = stalls[i];
            }
            if (cowsAssigned >= cows) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(AggressiveCows.aggressiveCows(new int[] { 1, 2, 3 }, 2));
        System.out.println(AggressiveCows.aggressiveCows(new int[] { 0, 3, 4, 7, 10, 9 }, 4));
        System.out.println(AggressiveCows.aggressiveCows(new int[] { 4, 2, 1, 3, 6 }, 2));
    }
}
