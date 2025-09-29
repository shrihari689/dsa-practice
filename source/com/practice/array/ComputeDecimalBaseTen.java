package com.practice.array;

import java.util.ArrayList;
import java.util.List;

public class ComputeDecimalBaseTen {

    public int[] decimalRepresentation(int n) {

        List<Integer> base = new ArrayList<>();

        int expo = 0;
        while (n > 0) {
            int rem = n % 10;

            if (rem > 0) {
                int div = rem * ((int) Math.pow(10, expo++));
                base.add(div);
            } else {
                expo++;
            }

            n /= 10;
        }

        int size = base.size();
        int[] result = new int[size];
        for (int i = size - 1, j = 0; i >= 0; --i, ++j) {
            result[i] = base.get(j);
        }

        return result;
    }

    public static void main(String[] args) {
        ComputeDecimalBaseTen baseTen = new ComputeDecimalBaseTen();
        System.out.println(baseTen.decimalRepresentation(110));
        System.out.println(baseTen.decimalRepresentation(537));
        System.out.println(baseTen.decimalRepresentation(102));
        System.out.println(baseTen.decimalRepresentation(6));
    }
}
