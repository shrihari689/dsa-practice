package com.practice.patterns;

public class PatternU {

    private static void downward(int count) {

        int cols = (count * 2) - 1;

        for (int i = count; i > 0; --i) {
            print(cols, i);
        }
    }

    private static void upward(int count) {

        int cols = ((count + 1) * 2) - 1;

        for (int i = 1; i <= count; ++i) {
            print(cols, i + 1);
        }
    }

    private static void print(int cols, int upto) {

        int start = (cols / 2) + 1;

        int count = 0;
        for (int i = start; i > upto; --i) {
            System.out.print(i);
            count++;
        }

        int middle = cols - (2 * count);
        for (int i = 0; i < middle; ++i) {
            System.out.print(upto);
        }

        for (int i = upto + 1; i <= start; ++i) {
            System.out.print(i);
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int rows = 10;
        int count = (rows / 2) + 1;
        downward(count);
        upward(count - 1);
    }
}
