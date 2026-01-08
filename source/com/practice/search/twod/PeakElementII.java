package com.practice.search.twod;

import java.util.Arrays;

public class PeakElementII {

    public int[] findPeakGrid(int[][] mat) {

        int result[] = new int[2];

        int cols = mat[0].length;

        int start = 0;
        int end = cols - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // row
            int maxIdx = max(mat, mid);

            int row = mat[maxIdx][mid];
            int left = ((mid) > 0) ? mat[maxIdx][mid - 1] : -1;
            int right = (mid < (cols - 1)) ? mat[maxIdx][mid + 1] : -1;

            if ((left < row) && (right < row)) {
                result[0] = maxIdx;
                result[1] = mid;
                return result;
            }

            if (left > row) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return result;
    }

    private int max(int mat[][], int col) {
        int rows = mat.length;
        int max = -1;
        int maxIdx = -1;
        for (int i = 0; i < rows; ++i) {
            int num = mat[i][col];
            if (num > max) {
                max = num;
                maxIdx = i;
            }
        }
        return maxIdx;
    }

    public static void main(String[] args) {
        PeakElementII peak = new PeakElementII();
        System.out.println(
                Arrays.toString(peak.findPeakGrid(new int[][] { { 70, 50, 40, 30, 20 }, { 100, 1, 2, 3, 4 } })));
        System.out.println(
                Arrays.toString(peak.findPeakGrid(new int[][] { { 10, 20, 15 }, { 21, 30, 14 }, { 7, 16, 32 } })));
        System.out.println(Arrays.toString(peak.findPeakGrid(new int[][] { { 1, 4 }, { 3, 2 } })));
    }
}
