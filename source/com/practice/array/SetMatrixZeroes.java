package com.practice.array;

import java.util.Arrays;

public class SetMatrixZeroes {

    public void setZeroes(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int firstRow = 0;
        int firstCol = 0;

        // first row.
        for (int i = 0; i < cols; ++i) {
            if (matrix[0][i] == 0) {
                firstRow = 1;
                break;
            }
        }

        // first column.
        for (int i = 0; i < rows; ++i) {
            if (matrix[i][0] == 0) {
                firstCol = 1;
                break;
            }
        }

        for (int i = 1; i < rows; ++i) {
            for (int j = 0; j < cols; ++j) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        for (int i = 1; i < rows; ++i) {
            if (matrix[i][0] == 0) {
                for (int j = 0; j < cols; ++j) {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < cols; ++i) {
            if (matrix[0][i] == 0) {
                for (int j = 0; j < rows; ++j) {
                    matrix[j][i] = 0;
                }
            }
        }

        if (firstRow == 1) {
            for (int i = 0; i < cols; ++i) {
                matrix[0][i] = 0;
            }
        }

        if (firstCol == 1) {
            for (int i = 0; i < rows; ++i) {
                matrix[i][0] = 0;
            }
        }

    }

    public static void main(String[] args) {
        SetMatrixZeroes matrixZeroes = new SetMatrixZeroes();
        int arr[][] = new int[][] {
                { 3, 5, 5, 6, 9, 1, 4, 5, 0, 5 },
                { 2, 7, 9, 5, 9, 5, 4, 9, 6, 8 },
                { 6, 0, 7, 8, 1, 0, 1, 6, 8, 1 },
                { 7, 2, 6, 5, 8, 5, 6, 5, 0, 6 },
                { 2, 3, 3, 1, 0, 4, 6, 5, 3, 5 },
                { 5, 9, 7, 3, 8, 8, 5, 1, 4, 3 },
                { 2, 4, 7, 9, 9, 8, 4, 7, 3, 7 },
                { 3, 5, 2, 8, 8, 2, 2, 4, 9, 8 }
        };
        matrixZeroes.setZeroes(arr);
        System.out.println(Arrays.deepToString(arr));

        arr = new int[][] { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };
        matrixZeroes.setZeroes(arr);
        System.out.println(Arrays.deepToString(arr));
    }
}
