package com.practice.patterns;

public class PatternN {

    public static void main(String[] args) {
        int rows = 5;
        for (int i = rows; i > 0; --i) {
            for (int j = 0; j < i; ++j) {
                System.out.print((char) ('A' + j));
            }
            System.out.println();
        }
    }
}
