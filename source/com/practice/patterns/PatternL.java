package com.practice.patterns;

public class PatternL {

    public static void main(String[] args) {

        int rows = 5;

        int curr = 1;

        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j <= i; ++j) {
                System.out.print((curr++) + "\t");
            }
            System.out.println();
        }

    }
}
