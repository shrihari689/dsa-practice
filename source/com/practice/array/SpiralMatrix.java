package com.practice.array;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        List<Integer> result = new ArrayList<>();

        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;

        while ((top <= bottom) && (left <= right)) {

            // towards right.
            for (int i = left; i <= right; ++i) {
                result.add(matrix[top][i]);
            }

            top++;

            // towards bottom.
            for (int i = top; i <= bottom; ++i) {
                result.add(matrix[i][right]);
            }

            right--;

            // towards left.
            if (top <= bottom) {

                for (int i = right; i >= left; --i) {
                    result.add(matrix[bottom][i]);
                }

                bottom--;
            }

            // towards top.
            if (left <= right) {

                for (int i = bottom; i >= top; --i) {
                    result.add(matrix[i][left]);
                }

                left++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        SpiralMatrix matrix = new SpiralMatrix();
        System.out.println(matrix.spiralOrder(new int[][] {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 91, 20, 31, 42 }
        }));
        System.out.println(matrix.spiralOrder(new int[][] {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        }));
    }
}
