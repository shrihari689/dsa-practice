package com.practice.array;

import java.util.HashSet;
import java.util.Set;

public class MinimizeMaximumOfArray {
    public int minimizeSet(int divisor1, int divisor2, int uniqueCnt1, int uniqueCnt2) {

        Set<Integer> uniqueA = new HashSet<>();
        Set<Integer> uniqueB = new HashSet<>();

        long curr = 0;
        while (divisor1) {

        }

        return -1;
    }

    public static void main(String[] args) {
        MinimizeMaximumOfArray array = new MinimizeMaximumOfArray();
        System.out.println(array.minimizeSet(2, 7, 1, 3));
        System.out.println(array.minimizeSet(3, 5, 2, 1));
        System.out.println(array.minimizeSet(2, 4, 8, 2));

    }
}
