package com.practice.search.twod;

public class TwoDBinarySearch {

    public int upperBound(int[][] matrix, int target) {

        int m = matrix.length;

        int start = 0;
        int end = m - 1;

        int result = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (matrix[mid][0] <= target) {
                result = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return result;
    }

    private boolean doesExist(int[] row, int target) {
        int n = row.length;

        int start = 0;
        int end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (row[mid] == target) {
                return true;
            }
            if (row[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return false;
    }

    public boolean searchMatrix(int[][] matrix, int target) {

        int upperBound = upperBound(matrix, target);
        return doesExist(matrix[upperBound], target);
    }

    public static void main(String[] args) {
        TwoDBinarySearch twoDBinarySearch = new TwoDBinarySearch();
        System.out.println(twoDBinarySearch.searchMatrix(new int[][] { { 1 } }, 0));
        System.out.println(twoDBinarySearch.searchMatrix(new int[][] { { 1 }, { 3 } }, 3));
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
