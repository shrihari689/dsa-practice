package com.practice.array.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/merge-intervals/
 */
public class MergeOverlappingInterval {

    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> result = new ArrayList<>();
        result.add(intervals[0]);

        int n = intervals.length;
        for (int i = 1; i < n; ++i) {
            int prev[] = result.get(result.size() - 1);
            int curr[] = intervals[i];

            if (curr[0] > prev[1]) {
                result.add(curr);
            } else {
                prev[1] = Math.max(prev[1], curr[1]);
            }
        }

        return result.toArray(new int[0][0]);
    }

    public static void main(String[] args) {
        MergeOverlappingInterval interval = new MergeOverlappingInterval();
        System.out.println(
                Arrays.deepToString(interval.merge(new int[][] { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } })));
        System.out.println(Arrays.deepToString(interval.merge(new int[][] { { 1, 4 }, { 4, 5 } })));
        System.out.println(Arrays.deepToString(interval.merge(new int[][] { { 4, 7 }, { 1, 4 } })));
    }
}
