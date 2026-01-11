package com.practice.string;

public class ReverseWords {
    public String reverseWords(String s) {

        StringBuilder builder = new StringBuilder();

        int i = s.length() - 1;

        int lastSpace = i + 1;

        while (i >= 0) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                String word = s.substring(i + 1, lastSpace);
                if (!word.isBlank()) {
                    builder.append(word);
                    builder.append(" ");
                }
                lastSpace = i;
            }
            i--;
        }

        if (s.charAt(0) != ' ') {
            builder.append(s.substring(0, lastSpace));
        }

        if (builder.charAt(builder.length() - 1) == ' ') {
            builder.deleteCharAt(builder.length() - 1);
        }

        return builder.toString();
    }

    public static void main(String[] args) {
        ReverseWords words = new ReverseWords();
        System.out.println(words.reverseWords(" asdasd df f"));
        System.out.println(words.reverseWords("  hello world  "));
        System.out.println(words.reverseWords("the sky is blue"));
        System.out.println(words.reverseWords("a good   example"));
    }
}
