package com.practice.maths;

public class GetMaximumInArray {

    public int getMaximumGenerated(int n) {

        if (n == 0) {
            return 0;
        }

        int result[] = new int[n + 1];
        result[0] = 0;
        result[1] = 1;

        int maximum = 0;

        for (int i = 0; i < n; ++i) {
            int idxA = 2 * i;
            if (idxA <= n) {
                result[idxA] = result[i];
                maximum = Math.max(maximum, result[idxA]);
            } else {
                break;
            }

            int idxB = idxA + 1;
            if (idxB <= n) {
                result[idxB] = result[i] + result[i + 1];
                maximum = Math.max(maximum, result[idxB]);
            } else {
                break;
            }
        }

        return maximum;
    }

    public static void main(String[] args) {
        GetMaximumInArray array = new GetMaximumInArray();
        System.out.println(array.getMaximumGenerated(7));
        System.out.println(array.getMaximumGenerated(2));
        System.out.println(array.getMaximumGenerated(3));
    }
}
