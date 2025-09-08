package com.practice.patterns;

public class PatternS {
    private static void upward(int rows) {
        for (int i = rows; i > 0; --i) {
            int count = rows - i + 1;
            print(count, '*');

            int space = 2 * (i - 1);
            print(space, ' ');

            print(count, '*');
            System.out.println();
        }
    }

    private static void downward(int rows) {

        for (int i = 0; i < rows; ++i) {
            int count = rows - i;
            print(count, '*');

            int space = 2 * i;
            print(space, ' ');

            print(count, '*');
            System.out.println();
        }
    }

    private static void print(int count, char ch) {
        for (int j = 0; j < count; ++j) {
            System.out.print(ch);
        }
    }

    public static void main(String[] args) {
        upward(4);
        downward(4);
    }
}
