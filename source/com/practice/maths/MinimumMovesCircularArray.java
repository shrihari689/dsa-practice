package com.practice.maths;

public class MinimumMovesCircularArray {
    public long minMoves(int[] balance) {

        int n = balance.length;
        int total = 0;
        int negIdx = -1;

        // Step 1: total sum & find negative index
        for (int i = 0; i < n; i++) {
            total += balance[i];
            if (balance[i] < 0) {
                negIdx = i;
            }
        }

        // Impossible if total sum is negative
        if (total < 0)
            return -1;

        // If no negative index, no moves needed
        if (negIdx == -1)
            return 0;

        return -1;
    }
}
