package com.practice.search.twod;

public class TwoDBinarySearch {

    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;
        int n = matrix[0].length;

        int total = m * n;

        int start = 0;
        int end = total - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
        }

        return false;
    }

    public static void main(String[] args) {
        TwoDBinarySearch twoDBinarySearch = new TwoDBinarySearch();
        System.out.println(twoDBinarySearch
                .searchMatrix(new int[][] {
                        { 1, 3, 5, 7 },
                        { 10, 11, 16, 20 },
                        { 23, 30, 34, 60 }
                }, 3));
        System.out.println(twoDBinarySearch
                .searchMatrix(new int[][] {
                        { 1, 3, 5, 7 },
                        { 10, 11, 16, 20 },
                        { 23, 30, 34, 60 }
                }, 13));
    }
}
