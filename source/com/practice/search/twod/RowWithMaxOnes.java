package com.practice.search.twod;

import java.util.Arrays;

public class RowWithMaxOnes {

    public int[] rowAndMaximumOnes(int[][] mat) {

        int m = mat.length;
        int n = mat[0].length;

        int minIdx = -1;
        int maxCount = 0;

        for (int i = 0; i < m; ++i) {

            if ((minIdx != -1) && (mat[i][n - maxCount] == 0)) {
                continue;
            }

            int idx = findFirstOccurrence(mat[i]);
            if (idx == -1) {
                continue;
            }

            int count = n - idx;
            if (count > maxCount) {
                minIdx = i;
                maxCount = count;
            }
        }

        if (minIdx == -1) {
            return new int[] { 0, 0 };
        }

        return new int[] { minIdx, maxCount };
    }

    private int findFirstOccurrence(int row[]) {
        int idx = -1;
        int start = 0;
        int end = row.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (row[mid] == 1) {
                idx = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        RowWithMaxOnes rowWithMaxOnes = new RowWithMaxOnes();
        System.out.println(Arrays.toString(rowWithMaxOnes.rowAndMaximumOnes(new int[][] {
                { 1, 0, 0 } })));
        System.out.println(Arrays.toString(rowWithMaxOnes.rowAndMaximumOnes(new int[][] {
                { 0 },
                { 0 } })));
        System.out.println(Arrays.toString(rowWithMaxOnes.rowAndMaximumOnes(new int[][] {
                { 0, 0, 1 },
                { 0, 1, 1 } })));
        System.out.println(Arrays.toString(rowWithMaxOnes.rowAndMaximumOnes(new int[][] {
                { 1, 1, 1 },
                { 0, 0, 1 },
                { 0, 1, 1 } })));
        System.out.println(Arrays.toString(rowWithMaxOnes.rowAndMaximumOnes(new int[][] { { 1, 1, 1 },
                { 0, 0, 1 },
                { 0, 0, 0 } })));
    }
}
