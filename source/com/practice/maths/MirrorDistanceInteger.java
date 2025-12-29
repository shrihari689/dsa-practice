package com.practice.maths;

public class MirrorDistanceInteger {

    public int mirrorDistance(int n) {
        return Math.abs(n - reverseNumber(n));
    }

    private int reverseNumber(int n) {
        int reversed = 0;
        while (n > 0) {
            reversed = (reversed * 10) + (n % 10);
            n /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        MirrorDistanceInteger distanceInteger = new MirrorDistanceInteger();
        System.out.println(distanceInteger.mirrorDistance(25));
        System.out.println(distanceInteger.mirrorDistance(7));
        System.out.println(distanceInteger.mirrorDistance(10));
    }
}
