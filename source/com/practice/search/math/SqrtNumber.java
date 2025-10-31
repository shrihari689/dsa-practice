package com.practice.search.math;

public class SqrtNumber {

    public int floorSqrt(int n) {

        int start = 1;
        int end = n / 2;

        int sqrt = 0;

        while (start <= end) {

            int mid = start + (end - start) / 2;
            long sqr = (long) mid * mid;

            if (sqr == n) {
                return mid;
            }

            if (sqr < n) {
                sqrt = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return sqrt;
    }

    public static void main(String[] args) {

        SqrtNumber number = new SqrtNumber();
        System.out.println(number.floorSqrt(2147395599));
        System.out.println(number.floorSqrt(36));
        System.out.println(number.floorSqrt(28));
    }

}