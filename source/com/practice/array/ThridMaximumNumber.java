package com.practice.array;

public class ThridMaximumNumber {

    public int thirdMax(int[] nums) {

        long maximum = Long.MIN_VALUE;
        long secondMaximum = Long.MIN_VALUE;
        long thirdMaximum = Long.MIN_VALUE;

        for (int num : nums) {

            if (num > maximum) {
                thirdMaximum = secondMaximum;
                secondMaximum = maximum;
                maximum = num;
            } else if ((secondMaximum != maximum) && (num > secondMaximum)) {
                thirdMaximum = secondMaximum;
                secondMaximum = num;
            } else if ((thirdMaximum != maximum) && (secondMaximum != maximum) && (num > thirdMaximum)) {
                thirdMaximum = num;
            }

        }

        if (thirdMaximum == Long.MIN_VALUE) {
            return (int) maximum;
        }

        return (int) thirdMaximum;
    }

    public static void main(String[] args) {
        ThridMaximumNumber maximumNumber = new ThridMaximumNumber();
        System.out.println(maximumNumber.thirdMax(new int[] { 3, 2, 1 }));
        System.out.println(maximumNumber.thirdMax(new int[] { 1, 2, 3 }));
        System.out.println(maximumNumber.thirdMax(new int[] { 1, 2, -2147483648 }));
        System.out.println(maximumNumber.thirdMax(new int[] { 1, 2, 2, 5, 3, 5 }));
        System.out.println(maximumNumber.thirdMax(new int[] { 2, 2, 3, 1 }));
    }
}
