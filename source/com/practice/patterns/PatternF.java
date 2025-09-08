package com.practice.patterns;

public class PatternF {

    public static void main(String[] args) {
        int rows = 5;

        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < (rows - 1 - i); ++j) {
                System.out.print(" ");
            }
            int count = (2 * i) + 1;
            for (int j = 0; j < count; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
