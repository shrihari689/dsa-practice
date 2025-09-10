package com.practice.maths;

/**
 * 
 */
public class GCDOfNumbers {

    public int GCDWithDivide(int a, int b) {
        if (b == 0) {
            return a;
        }
        return GCDWithDivide(b, a % b);
    }

    public int GCDWithSubtract(int a, int b) {
        if (b == 0) {
            return a;
        }
        if (a == 0) {
            return b;
        }

        if (a == b) {
            return a;
        }

        if (a > b) {
            return GCDWithSubtract(b, a - b);
        }

        return GCDWithSubtract(a, b - a);
    }

    public static void main(String[] args) {
        GCDOfNumbers gcd = new GCDOfNumbers();
        System.out.println(gcd.GCDWithDivide(4, 6));
        System.out.println(gcd.GCDWithDivide(9, 8));
        System.out.println(gcd.GCDWithDivide(20, 28));

        System.out.println(gcd.GCDWithSubtract(4, 6));
        System.out.println(gcd.GCDWithSubtract(9, 8));
        System.out.println(gcd.GCDWithSubtract(20, 28));
    }
}
