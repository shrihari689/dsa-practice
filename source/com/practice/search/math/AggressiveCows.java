package com.practice.search.math;

import java.util.Arrays;

public class AggressiveCows {

    public static int aggressiveCows(int[] stalls, int cows) {

        Arrays.sort(stalls);

        int n = stalls.length;

        int start = 1;
        int end = stalls[n - 1] - stalls[0];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (canAssign(stalls, cows, mid)) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return end;
    }

    private static boolean canAssign(int[] stalls, int cows, int distance) {

        int cowsAssigned = 1;
        int last = stalls[0];

        for (int i = 1; i < stalls.length; ++i) {
            if ((stalls[i] - last) >= distance) {
                cowsAssigned++;
                last = stalls[i];
            }
            if (cowsAssigned >= cows) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(AggressiveCows.aggressiveCows(new int[] { 0, 3, 4, 7, 10, 9 }, 4));
        System.out.println(AggressiveCows.aggressiveCows(new int[] { 1, 2, 3 }, 2));
        System.out.println(AggressiveCows.aggressiveCows(new int[] { 4, 2, 1, 3, 6 }, 2));
    }
}
