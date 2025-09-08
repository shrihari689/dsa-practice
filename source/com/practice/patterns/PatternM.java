package com.practice.patterns;

public class PatternM {

    public static void main(String[] args) {

        int rows = 5;
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j <= i; ++j) {
                System.out.print((char) ('A' + j));
            }
            System.out.println();
        }
    }
}
