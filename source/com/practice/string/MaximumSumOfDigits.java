package com.practice.string;

public class MaximumSumOfDigits {
    public String maxSumOfSquares(int num, int sum) {

        int maxPossibleSum = (num * 9);
        if (sum > maxPossibleSum) {
            return "";
        }

        if (sum < 10) {
            StringBuilder builder = new StringBuilder();
            builder.append(Integer.toString(sum));
            for (int i = 1; i < num; ++i) {
                builder.append('0');
            }
            return builder.toString();
        }

        int countOfNine = sum / 9;
        int remOfNine = sum % 9;

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < countOfNine; ++i) {
            builder.append('9');
        }

        if (remOfNine == 0) {
            for (int i = countOfNine; i < num; ++i) {
                builder.append('0');
            }
        } else {
            builder.append(Integer.toString(remOfNine));
            for (int i = countOfNine + 1; i < num; ++i) {
                builder.append('0');
            }
        }

        return builder.toString();
    }

    public static void main(String[] args) {
        MaximumSumOfDigits digits = new MaximumSumOfDigits();
        System.out.println(digits.maxSumOfSquares(3, 10));
        System.out.println(digits.maxSumOfSquares(3, 18));
        System.out.println(digits.maxSumOfSquares(2, 3));
        System.out.println(digits.maxSumOfSquares(2, 17));
        System.out.println(digits.maxSumOfSquares(1, 10));
    }
}
