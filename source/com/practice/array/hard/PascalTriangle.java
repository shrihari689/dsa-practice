package com.practice.array.hard;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; ++i) {
            result.add(generateRow(i));
        }

        return result;
    }

    private List<Integer> generateRow(int n) {
        List<Integer> row = new ArrayList<>();
        for (int i = 0; i <= n; ++i) {
            row.add(calculate(n, i));
        }
        return row;
    }

    public int calculate(int n, int r) {
        long combinations = 1;
        for (int i = n, j = 1; j <= r; --i, ++j) {
            combinations = combinations * i;
            combinations = combinations / j;
        }
        return (int) combinations;
    }

    public static void main(String[] args) {

        PascalTriangle pascalTriangle = new PascalTriangle();
        System.out.println(pascalTriangle.generate(5).toString());
        System.out.println(pascalTriangle.generate(1));
    }
}
