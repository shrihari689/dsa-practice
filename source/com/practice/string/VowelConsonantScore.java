package com.practice.string;

public class VowelConsonantScore {

    public int vowelConsonantScore(String s) {

        int vowels = 0;
        int consonants = 0;

        char ch[] = s.toCharArray();
        for (char c : ch) {
            if ((c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u')) {
                vowels++;
            } else if ((c >= 'a') && (c <= 'z')) {
                consonants++;
            }
        }

        return (consonants > 0) ? (int) Math.floor(vowels / consonants) : consonants;
    }

    public static void main(String[] args) {
        VowelConsonantScore score = new VowelConsonantScore();
        System.out.println(score.vowelConsonantScore("cooear"));
        System.out.println(score.vowelConsonantScore("axeyizou"));
        System.out.println(score.vowelConsonantScore("au 123"));
    }
}
