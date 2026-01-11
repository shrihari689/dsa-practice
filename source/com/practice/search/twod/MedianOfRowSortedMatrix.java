package com.practice.search.twod;

public class MedianOfRowSortedMatrix {

    public static int findMedian(int matrix[][], int m, int n) {

        int start = Integer.MAX_VALUE;
        int end = Integer.MIN_VALUE;

        for (int i = 0; i < m; ++i) {
            start = Math.min(start, matrix[i][0]);
            end = Math.max(end, matrix[i][n - 1]);
        }

        int total = m * n;
        int median = (total + 1) / 2;

        while (start < end) {

            int mid = start + (end - start) / 2;
            int count = countOfLessThan(matrix, mid);

            if (count < median) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return start;
    }

    private static int countOfLessThan(int matrix[][], int target) {

        int count = 0;

        for (int i = 0; i < matrix.length; ++i) {

            int start = 0;
            int end = matrix[i].length - 1;

            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (matrix[i][mid] <= target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

            count += start;
        }

        return count;
    }

    public static int findMedian(int matrix[][]) {
        return findMedian(matrix, matrix.length, matrix[0].length);
    }

    public static void main(String[] args) {
        System.out.println(MedianOfRowSortedMatrix.findMedian(new int[][] {
                { 1, 2, 3, 4, 5 },
                { 8, 9, 11, 12, 13 },
                { 21, 23, 25, 27, 29 }
        }));
        System.out.println(MedianOfRowSortedMatrix.findMedian(new int[][] {
                { 1, 2, 8 },
                { 2, 3, 4 },
                { 1, 2, 5 }
        }));
        System.out.println(MedianOfRowSortedMatrix.findMedian(new int[][] {
                { 1, 4, 9 },
                { 2, 5, 6 },
                { 3, 8, 7 }
        }));
        System.out.println(MedianOfRowSortedMatrix.findMedian(new int[][] {
                { 1, 5, 7, 9, 11 },
                { 2, 3, 4, 8, 9 },
                { 4, 11, 14, 19, 20 },
                { 6, 10, 22, 99, 100 },
                { 7, 15, 17, 24, 28 }
        }));
        System.out.println(MedianOfRowSortedMatrix.findMedian(new int[][] {
                { 1, 2, 3, 4, 5 },
                { 8, 9, 11, 12, 13 },
                { 21, 23, 25, 27, 29 }
        }));
    }
}
