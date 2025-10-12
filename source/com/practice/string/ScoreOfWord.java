package com.practice.string;

public class ScoreOfWord {

    public boolean scoreBalance(String s) {

        int score = 0;

        int n = s.length();

        for (int i = 0; i < n; ++i) {
            score += (int) (s.charAt(i) - 'a') + 1;
        }

        int half = 0;
        for (int i = 0; i < n; ++i) {
            half += (int) (s.charAt(i) - 'a') + 1;
            if ((score - half) == half) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ScoreOfWord ofWord = new ScoreOfWord();
        System.out.println(ofWord.scoreBalance("adcb"));
        System.out.println(ofWord.scoreBalance("bace"));
    }
}