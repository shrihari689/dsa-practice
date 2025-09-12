package com.practice.recursion;

/**
 * https://takeuforward.org/plus/dsa/problems/print-n-to-1-using-recursion
 */
public class PrintN1 {
    public void printNumbers(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNumbers(n - 1);
    }

    public static void main(String[] args) {
        PrintN1 printn1 = new PrintN1();
        printn1.printNumbers(10);
    }
}
