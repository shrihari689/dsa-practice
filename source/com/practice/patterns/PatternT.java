package com.practice.patterns;

public class PatternT {

    private static void print(int count, char ch) {
        for (int j = 0; j < count; ++j) {
            System.out.print(ch);
        }
    }

    public static void main(String[] args) {
        int rows = 4;

        print(rows, '*');
        System.out.println();

        int count = rows - 2;

        for (int i = 0; i < count; ++i) {
            System.out.print("*");
            print(count, ' ');
            System.out.print("*");
            System.out.println();
        }
        print(rows, '*');
        System.out.println();

    }
}
