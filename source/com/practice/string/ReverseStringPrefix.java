package com.practice.string;

public class ReverseStringPrefix {

    public String reversePrefix(String s, int k) {

        StringBuilder builder = new StringBuilder();

        builder.append(s.substring(0, k));
        builder.reverse();
        builder.append(s.substring(k, s.length()));

        return builder.toString();
    }

    public static void main(String[] args) {
        ReverseStringPrefix prefix = new ReverseStringPrefix();
        System.out.println(prefix.reversePrefix("abcd", 2));
        System.out.println(prefix.reversePrefix("xyz", 3));
        System.out.println(prefix.reversePrefix("hey", 1));
    }
}
