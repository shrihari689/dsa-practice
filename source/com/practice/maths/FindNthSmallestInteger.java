package com.practice.maths;

public class FindNthSmallestInteger {

    public long nthSmallest(long n, int k) {

        long result = (1L << k) - 1;

        int count = 0;
        while (count < n) {
            int bits = Long.bitCount(result);
            if (bits == k) {
                count++;
            }
            if (count == n) {
                return result;
            }
            result++;
        }

        return result;
    }

    public static void main(String[] args) {
        FindNthSmallestInteger integer = new FindNthSmallestInteger();
        System.out.println(integer.nthSmallest(342343243, 32));
        System.out.println(integer.nthSmallest(4, 2));
        System.out.println(integer.nthSmallest(3, 1));
    }
}
