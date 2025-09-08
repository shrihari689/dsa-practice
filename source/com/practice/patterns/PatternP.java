package com.practice.patterns;

public class PatternP {

    public static void main(String[] args) {
        int rows = 4;

        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < (rows - i - 1); ++j) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; ++j) {
                System.out.print((char) ('A' + j));
            }

            for (int j = 0; j <= (i - 1); ++j) {
                System.out.print((char) ('A' + j));
            }

            System.out.println();
        }
    }
}
