package com.practice.search.math;

public class NthRootNumber {

    public static int NthRoot(int n, int m) {

        int start = 1;
        int end = m / n;

        while (start <= end) {

            int mid = start + (end - start) / 2;
            long pow = (long) Math.pow(mid, n);

            if (pow == m) {
                return mid;
            }

            if (pow < m) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        System.out.println(NthRootNumber.NthRoot(3, 27));
        System.out.println(NthRootNumber.NthRoot(4, 69));
    }

}