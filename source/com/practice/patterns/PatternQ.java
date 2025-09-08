package com.practice.patterns;

public class PatternQ {

    public static void main(String[] args) {
        int rows = 5;
        for (int i = 0; i < rows; ++i) {
            char start = (char) ('A' + rows - i - 1);
            for (int j = 0; j <= i; ++j) {
                System.out.print((char) (start + j));
            }
            System.out.println();
        }
    }
}
