package com.practice.patterns;

public class PatternK {

    public static void main(String[] args) {
        int rows = 4;
        int total = rows * 2;

        for (int i = 1; i <= rows; ++i) {

            for (int j = 0; j < i; ++j) {
                System.out.print(j + 1);
            }

            int occupied = 2 * i;
            int balance = total - occupied;
            for (int j = 0; j < balance; ++j) {
                System.out.print(" ");
            }

            for (int j = i; j > 0; --j) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
