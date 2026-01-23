package com.practice.array;

import java.util.Arrays;

public class DefuseTheBomb {

    public int[] decrypt(int[] code, int k) {

        int n = code.length;
        int result[] = new int[n];

        if (k == 0) {
            return result;
        }

        int windowSize = Math.abs(k);

        int sum = 0;

        int left = 1;
        int right = k;

        if (k < 0) {
            left = n - windowSize;
            right = n - 1;
        }

        for (int i = left; i <= right; ++i) {
            sum += code[i];
        }

        for (int i = 0; i < n; ++i) {
            result[i] = sum;

            sum -= code[(left) % n];
            sum += code[(right + 1) % n];

            left++;
            right++;
        }

        return result;
    }

    public static void main(String[] args) {
        DefuseTheBomb bomb = new DefuseTheBomb();
        System.out.println(bomb.decrypt(new int[] { 2, 4, 9, 3 }, -2));
        System.out.println(bomb.decrypt(new int[] { 5, 7, 1, 4 }, 3));
        System.out.println(bomb.decrypt(new int[] { 1, 2, 3, 4 }, 0));
    }
}
