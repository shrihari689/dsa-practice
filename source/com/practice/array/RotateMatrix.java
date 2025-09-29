package com.practice.array;

public class RotateMatrix {

    public void rotate(int[][] matrix) {

        int n = matrix.length;
        int mid = n / 2;

        int end = n - 1;

        for (int i = 0; i < mid; ++i) {
            for (int j = i; j < end - i; ++j) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[end - j][i];
                matrix[end - j][i] = matrix[end - i][end - j];
                matrix[end - i][end - j] = matrix[j][end - i];
                matrix[j][end - i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        RotateMatrix rotateMatrix = new RotateMatrix();
        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 1, 3, 4 },
                { 7, 3, 2, 1 }
        };
        rotateMatrix.rotate(matrix);
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
