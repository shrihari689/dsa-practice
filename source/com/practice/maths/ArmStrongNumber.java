package com.practice.maths;

/**
 * https://www.geeksforgeeks.org/dsa/program-for-armstrong-numbers/
 */
public class ArmStrongNumber {

    public int countOfDigits(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public boolean isArmstrong(int n) {
        int count = countOfDigits(n);
        int lhs = n;
        int rhs = 0;
        while (n > 0) {
            int rem = n % 10;
            rhs += ((int) Math.pow(rem, count));
            n /= 10;
        }
        return rhs == lhs;
    }

    public static void main(String[] args) {
        ArmStrongNumber number = new ArmStrongNumber();
        System.out.println(number.isArmstrong(153));
        System.out.println(number.isArmstrong(9474));
        System.out.println(number.isArmstrong(123));
        System.out.println(number.isArmstrong(12));
    }
}
