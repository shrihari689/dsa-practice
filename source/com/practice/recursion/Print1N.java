package com.practice.recursion;

/**
 * https://takeuforward.org/plus/dsa/problems/print-1-to-n-using-recursion
 */
public class Print1N {
    public void printNumbers(int n) {
        if (n == 0) {
            return;
        }
        printNumbers(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Print1N print1n = new Print1N();
        print1n.printNumbers(10);
    }
}
