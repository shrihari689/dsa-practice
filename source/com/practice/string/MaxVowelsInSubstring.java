package com.practice.string;

public class MaxVowelsInSubstring {

    public int maxVowels(String s, int k) {

        int n = s.length();

        int maxVowels = 0;
        int vowels = 0;

        char letters[] = s.toCharArray();

        for (int i = 0; i < k; ++i) {
            if (isVowel(letters[i])) {
                vowels++;
            }
        }

        maxVowels = Math.max(maxVowels, vowels);

        for (int i = k; i < n; ++i) {
            if (isVowel(letters[i - k])) {
                vowels--;
            }
            if (isVowel(letters[i])) {
                vowels++;
            }
            maxVowels = Math.max(maxVowels, vowels);
            if (maxVowels == k)
                return k;
        }

        return maxVowels;
    }

    private boolean isVowel(char ch) {
        return ((ch == 'a') ||
                (ch == 'e') ||
                (ch == 'i') ||
                (ch == 'o') ||
                (ch == 'u'));
    }

    public static void main(String[] args) {
        MaxVowelsInSubstring substring = new MaxVowelsInSubstring();
        System.out.println(substring.maxVowels("weallloveyou", 7));
        System.out.println(substring.maxVowels("abciiidef", 3));
        System.out.println(substring.maxVowels("aeiou", 2));
        System.out.println(substring.maxVowels("leetcode", 3));
    }
}
