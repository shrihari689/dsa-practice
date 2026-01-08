package com.practice.maths;

public class LargestEvenNumber {

    public String largestEven(String s) {

        int len = s.length();

        if (s.charAt(len - 1) == '2') {
            return s;
        }

        for (int i = len - 1; i >= 0; --i) {
            if (s.charAt(i) == '2') {
                return s.substring(0, i + 1);
            }
        }

        return "";
    }

    public static void main(String[] args) {
        LargestEvenNumber evenNumber = new LargestEvenNumber();
        System.out.println(evenNumber.largestEven("1112"));
        System.out.println(evenNumber.largestEven("221"));
        System.out.println(evenNumber.largestEven("1"));
    }
}
