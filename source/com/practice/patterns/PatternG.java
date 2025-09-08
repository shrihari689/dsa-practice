package com.practice.patterns;

public class PatternG {

    public static void main(String[] args) {
        int rows = 5;

        for (int i = rows; i >= 0; --i) {
            for (int j = 0; j < (rows - i); ++j) {
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
