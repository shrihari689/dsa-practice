package com.practice.patterns;

public class PatternE {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = rows; i > 0; --i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
