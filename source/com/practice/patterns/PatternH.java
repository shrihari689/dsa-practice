package com.practice.patterns;

public class PatternH {

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

        for (int i = rows - 1; i >= 0; --i) {
            for (int j = 0; j < (rows - i - 1); ++j) {
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
