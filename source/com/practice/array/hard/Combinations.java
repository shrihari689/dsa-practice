package com.practice.array.hard;

public class Combinations {

    public int calculate(int n, int r) {
        long combinations = 1;
        for (int i = n, j = 1; j <= r; --i, ++j) {
            combinations = combinations * i;
            combinations = combinations / j;
        }
        return (int) combinations;
    }

    public static void main(String[] args) {
        Combinations combinations = new Combinations();
        System.out.println(combinations.calculate(1, 1));
    }
}
