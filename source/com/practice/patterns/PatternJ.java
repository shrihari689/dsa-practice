package com.practice.patterns;

public class PatternJ {

    public static void main(String[] args) {
        int rows = 5;

        int bit = 0;
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j <= i; ++j) {
                System.out.print((bit ^= 1));
            }
            System.out.println();
        }

    }
}
