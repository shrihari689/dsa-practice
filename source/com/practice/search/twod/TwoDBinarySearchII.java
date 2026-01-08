package com.practice.search.twod;

public class TwoDBinarySearchII {

    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;
        int n = matrix[0].length;

        int row = 0;
        int col = n - 1;

        while ((row < m) && (col >= 0)) {
            if (matrix[row][col] == target) {
                return true;
            }
            if (matrix[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        TwoDBinarySearchII binarySearchII = new TwoDBinarySearchII();
        System.out.println(
                binarySearchII.searchMatrix(new int[][] {
                        { 1, 4, 7, 11, 15 },
                        { 2, 5, 8, 12, 19 },
                        { 3, 6, 9, 16, 22 },
                        { 10, 13, 14, 17, 24 },
                        { 18, 21, 23, 26, 30 } }, 5));

        System.out.println(
                binarySearchII.searchMatrix(new int[][] {
                        { 1, 4, 7, 11, 15 },
                        { 2, 5, 8, 12, 19 },
                        { 3, 6, 9, 16, 22 },
                        { 10, 13, 14, 17, 24 },
                        { 18, 21, 23, 26, 30 } }, 20));
    }
}
