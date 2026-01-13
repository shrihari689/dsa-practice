package com.practice.string;

import java.util.HashMap;
import java.util.Map;

public class RomanNumerals {

    public int romanToInt(String s) {

        Map<Character, Integer> romans = new HashMap<>();
        romans.put('I', 1);
        romans.put('V', 5);
        romans.put('X', 10);
        romans.put('L', 50);
        romans.put('C', 100);
        romans.put('D', 500);
        romans.put('M', 1000);

        int num = 0;

        char ch[] = s.toCharArray();
        int n = ch.length - 1;
        for (int i = 0; i < n; ++i) {
            if (romans.get(ch[i]) < romans.get(ch[i + 1])) {
                num -= romans.get(ch[i]);
            } else {
                num += romans.get(ch[i]);
            }
        }

        return num + romans.get(ch[n]);
    }

    public static void main(String[] args) {
        RomanNumerals numerals = new RomanNumerals();
        System.out.println(numerals.romanToInt("III"));
        System.out.println(numerals.romanToInt("LVIII"));
        System.out.println(numerals.romanToInt("MCMXCIV"));
    }
}
